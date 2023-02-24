package com.obj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.obj.pojo.AddressBook;
import com.obj.service.AddressBookService;

@RestController
public class AddressBookCon {

	@Autowired
	AddressBookService aservic;
	
	@GetMapping("/getall")
	public List<AddressBook>getbyname(@RequestParam String name)
	{
		return aservic.getbyname(name);
	}
	
}
