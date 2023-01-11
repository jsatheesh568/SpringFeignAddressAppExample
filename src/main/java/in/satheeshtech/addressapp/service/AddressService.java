package in.satheeshtech.addressapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.satheeshtech.addressapp.entity.Address;
import in.satheeshtech.addressapp.repository.AddressRepository;
import in.satheeshtech.addressapp.response.AddressResponse;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;

	@Autowired
	public ModelMapper modelMapper;
	
	public AddressResponse findEmployeeByEmployeeId(int employeeId) {
		Address address = addressRepository.findAddressByEmployeeId(employeeId);
		AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
		return addressResponse;
	}

	public List<Address> getAllAddress() {
		List<Address> address = addressRepository.findAll();
		//List<AddressResponse> addressResponse = address.stream().map(e -> modelMapper.map(address, AddressResponse.class)).collect(Collectors.toList());
		return address;
		
	}
	
	
}
