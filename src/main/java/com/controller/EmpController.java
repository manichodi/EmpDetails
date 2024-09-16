package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.EmpDto;
import com.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService serviceobj;
	
	@PostMapping("/saveemp")
	public void saveemployee(@RequestBody EmpDto empdto) {
		serviceobj.saveemployee(empdto);
	}

}
