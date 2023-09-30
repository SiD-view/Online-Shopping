package com.online.stores.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.stores.entity.Contact;

public interface ContactAdmRepository extends JpaRepository<Contact, Long> 
{
	
}
