package com.online.stores.service;

import javax.mail.MessagingException;
import com.online.stores.entity.Contact;

public interface ContactService {
	
	void saveContacts(Contact contact) throws MessagingException;

}
