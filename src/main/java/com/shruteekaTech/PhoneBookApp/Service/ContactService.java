package com.shruteekaTech.PhoneBookApp.Service;

import java.util.List;

import com.shruteekaTech.PhoneBookApp.Entity.Contact;

public interface ContactService {
	
	public abstract boolean saveContact(Contact contact);
	
	public abstract List<Contact> getAllContact();

}
