package com.obj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obj.pojo.AddressBook;
import com.obj.repository.AddressBookRepo;

@Service
public class AddressBookService {

	@Autowired
	AddressBookRepo abrepo;
	
	public List<AddressBook>getbyname(String name)
	{
		return abrepo.getbyname(name);
	}
}
