package com.bob.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bob.springboot.model.Tenant;
import com.bob.springboot.repository.TenantRepository;

@RestController
@RequestMapping("/api/v1/")
public class TenantController {
	
	@Autowired
	TenantRepository tenantRepository;
	
//getting all tenants
	@GetMapping("/tenants")
	public List<Tenant> getTenants(){
		return tenantRepository.findAll();
	}

}
