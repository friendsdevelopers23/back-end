package com.Project.SpringAngular.CustomerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.SpringAngular.DTO.CustomerDTO;
import com.Project.SpringAngular.DTO.CustomerSaveDTO;
import com.Project.SpringAngular.Service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(path="/save")
	public String SaveCustomer(@RequestBody CustomerSaveDTO customersaveDTO)
	{
		String id=customerService.addCustomer(customersaveDTO);
		return id;
	}
	
}
