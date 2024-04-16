package com.Project.SpringAngular.Service;

import com.Project.SpringAngular.DTO.CustomerDTO;
import com.Project.SpringAngular.DTO.CustomerSaveDTO;

public interface CustomerService {
String addCustomer(CustomerSaveDTO customerSaveDTO);
}
