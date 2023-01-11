package in.satheeshtech.addressapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.satheeshtech.addressapp.entity.Address;
import in.satheeshtech.addressapp.response.AddressResponse;
import in.satheeshtech.addressapp.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;

	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int id) {
		
		AddressResponse addressResponse = null;
		addressResponse = addressService.findEmployeeByEmployeeId(id);
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	}
	
	@GetMapping("/address")
	public ResponseEntity<List<Address>> getAllAddress(){
		List<Address> addressResponse1 = addressService.getAllAddress();
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse1);
	}
}
