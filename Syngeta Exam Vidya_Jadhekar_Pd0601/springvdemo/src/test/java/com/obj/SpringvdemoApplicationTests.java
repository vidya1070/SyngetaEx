package com.obj;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.obj.controller.AddressBookCon;
import com.obj.pojo.AddressBook;
import com.obj.repository.AddressBookRepo;

@SpringBootTest
class SpringvdemoApplicationTests {
	@Autowired
	AddressBookRepo abrepo;

	@Test
	public void testCase() {
		
	List<AddressBook> list=abrepo.findAll()	;
	assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	public void testSingle() {
		AddressBook b1=abrepo.findById(20).get();
		assertEquals(43, b1.getAge());
	
	}
}

