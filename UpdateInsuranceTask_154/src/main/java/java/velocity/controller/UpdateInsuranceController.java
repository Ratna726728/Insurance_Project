package java.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.UpdateInsuranceModel;
import com.velocity.service.UpdateInsuranceService;

@RestController
public class UpdateInsuranceController {
	@Autowired
	private UpdateInsuranceService updateInsuranceService;
	@PostMapping("/save")
	public ResponseEntity<UpdateInsuranceModel> updateData(@RequestBody UpdateInsuranceModel updateInsuranceModel){
		UpdateInsuranceModel UIM=updateInsuranceService.updateData(updateInsuranceModel);
		return ResponseEntity.ok().body(UIM);
	}

}
