package com.online.stores.service.Impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.stores.entity.Contact;
import com.online.stores.repository.ContactAdmRepository;
import com.online.stores.service.ContactAdmService;

@Service
@Transactional
public class ContactAdmServiceImpl implements ContactAdmService
{
	@Autowired
	ContactAdmRepository contactAdmRepo;
	
	@Override
	public Optional<Contact> getContactId(Long pid)
	{
		
		return contactAdmRepo.findById(pid);
	}

	@Override
	public List<Contact> getAllContact() 
	{
		
		return contactAdmRepo.findAll();
	}

	@Override
	public void deleteContact(Long pid) 
	{
		contactAdmRepo.deleteById(pid);
	}

	@Override
	public void deleteAll(List<Contact> ids)
	{
		contactAdmRepo.deleteInBatch(ids);
	}

}
