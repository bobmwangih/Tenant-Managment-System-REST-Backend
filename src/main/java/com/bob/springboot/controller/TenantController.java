package com.bob.springboot.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bob.springboot.exception.ResourceNotFoundException;
import com.bob.springboot.model.Tenant;
import com.bob.springboot.repository.TenantRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class TenantController {

	@Autowired
	TenantRepository tenantRepository;

//getting all tenants
	@GetMapping("/tenants")
	public List<Tenant> getTenants() {
		return tenantRepository.findAll();
	}

//saving a tenant
	@PostMapping("/tenants")
	public Tenant saveTenant(@RequestBody Tenant tenant) {
		tenant.setDateOfTransaction(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now()));
		return tenantRepository.save(tenant);
	}

//getting one tenant
	@GetMapping("/tenants/{id}")
	public ResponseEntity<Tenant> getTenantById(@PathVariable Long id) {
		Tenant tenant = tenantRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Tenant with ID : " + id + " doesn't exist"));
		return ResponseEntity.ok(tenant);
	}

//updating a tenant
	@PutMapping("/tenants/{id}")
	public Tenant updateTenantById(@PathVariable Long id, @RequestBody Tenant tenantDetails) {
		Tenant tenant = tenantRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Tenant with ID : " + id + " doesn't exist"));
		tenant.setFirstName(tenantDetails.getFirstName());
		tenant.setLastName(tenantDetails.getLastName());
		tenant.setPhoneNumber(tenantDetails.getPhoneNumber());
		tenant.setIdNumber(tenantDetails.getIdNumber());
		tenant.setHouseNumber(tenantDetails.getHouseNumber());
		tenant.setDateOfLease(tenantDetails.getDateOfLease());
		String beforeUpdate = tenant.getMonthsPaid();
		tenant.setMonthsPaid(tenantDetails.getMonthsPaid());
		String afterUpdate = tenant.getMonthsPaid();
		tenant.setHouseNumber(tenantDetails.getHouseNumber());
		if(!(beforeUpdate.contentEquals(afterUpdate))){
			tenant.setDateOfTransaction(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now()));
		} 
		Tenant tenantUpdated = tenantRepository.save(tenant);
		return tenantUpdated;
	}
	
//delete tenant
	@DeleteMapping("/tenants/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteTenant(@PathVariable Long id){
		Tenant tenant = tenantRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Tenant with ID : " + id + " doesn't exist"));
		tenantRepository.delete(tenant);
		Map<String,Boolean> response = new HashMap<String, Boolean>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
