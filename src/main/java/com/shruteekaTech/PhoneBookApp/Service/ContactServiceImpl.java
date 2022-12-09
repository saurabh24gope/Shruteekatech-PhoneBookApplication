package com.shruteekaTech.PhoneBookApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shruteekaTech.PhoneBookApp.Entity.Contact;
import com.shruteekaTech.PhoneBookApp.Exception.ResourceNotFoundException;
import com.shruteekaTech.PhoneBookApp.Repository.ContactRepository;
@Service
public  class ContactServiceImpl implements ContactService{
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

	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> list = contactRepository.findAll();   
		return list;
	}

	@Override
	public Contact getContactById(Integer id) {
	     
		Contact contact = contactRepository.findById(id).orElseThrow(()->new ResourceNotFoundException());
		return contact;
	
		}

	@Override
	public boolean updateContact(Contact contact) {
		Contact contact2 = contactRepository.save(contact);
		if(contact2!=null) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean deleteContact(Integer id) {
		Contact contact = contactRepository.findById(id).orElseThrow(()->new ResourceNotFoundException());
		if(contact!=null) {
			contactRepository.deleteById(id);
			return true;
			}
		else {
		return false;
	}}


		
		
		
	}


		


	
