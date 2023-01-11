package in.satheeshtech.addressapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.satheeshtech.addressapp.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{
	
	@Query(nativeQuery = true, value = "SELECT ea.id,ea.lane1,ea.lane2,ea.state,ea.zip From seleniumexpress.address ea join seleniumexpress.employee e on e.id = ea.employee_id where ea.employee_id=:employeeId")
	Address findAddressByEmployeeId(@Param("employeeId") int id);

	

}
