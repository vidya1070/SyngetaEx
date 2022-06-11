package com.obj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.obj.pojo.AddressBook;
@Repository
public interface AddressBookRepo extends JpaRepository<AddressBook,Integer> {

	@Query(value="select * from reader_info where fname=?1",nativeQuery = true)
	public List<AddressBook>getbyname(String name);
	
}
