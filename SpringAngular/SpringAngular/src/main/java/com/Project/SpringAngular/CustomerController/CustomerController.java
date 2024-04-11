package com.Project.SpringAngular.CustomerController;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
	
	@postMapping(path="/save")
	public String SaveCustomer(@RequestBody CustomerDTO customerDTO)
	{
		
		
	}
	
}
