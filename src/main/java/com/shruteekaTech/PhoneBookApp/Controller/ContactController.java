package com.shruteekaTech.PhoneBookApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shruteekaTech.PhoneBookApp.Entity.Contact;
import com.shruteekaTech.PhoneBookApp.Service.ContactService;

@RestController
public class ContactController {
	@Autowired
	private ContactService contactService;
	@PostMapping(value="/saveContact",consumes= "application/json")
	public ResponseEntity<String>saveContact(@RequestBody Contact contact){
	
		  boolean saveContact = contactService.saveContact(contact);
		if(saveContact)
		{
			String msg="contact saved successfully";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("contact could not be saved!!",HttpStatus.CREATED);
		}
		
		}
	@GetMapping(value = "/getAllContact", produces = "application/json")
	public ResponseEntity<List<Contact>> getAllContact(){
		List<Contact> allContact = contactService.getAllContact();
		return new ResponseEntity<List<Contact>>(allContact,HttpStatus.OK);
		
	}
	@GetMapping(value = "/getContactById/{id}",produces = "application/json")
	public ResponseEntity<Contact> getContactById(@PathVariable Integer id){
		Contact contact = contactService.getContactById(id);
		return new ResponseEntity<Contact>(contact,HttpStatus.OK);
		}
	@PutMapping(value="/updateContact",consumes = "application/json")
	public ResponseEntity<String> updateContact(@RequestBody Contact contact){
		boolean updateContact = contactService.updateContact(contact);
		if(updateContact) {
			return new ResponseEntity<String>("contact updated successfully",HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<String>("contact not be updated successfully",HttpStatus.CREATED);
		}
	
		
	}

}
