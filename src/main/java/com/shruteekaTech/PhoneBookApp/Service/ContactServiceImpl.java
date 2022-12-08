package com.shruteekaTech.PhoneBookApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shruteekaTech.PhoneBookApp.Entity.Contact;
import com.shruteekaTech.PhoneBookApp.Repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService{
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean saveContact(Contact contact) {
		Contact contact2 = contactRepository.save(contact);
		if(contact2!=null) {
			return true;
		}
		else {
		return false;
	}

	}}
