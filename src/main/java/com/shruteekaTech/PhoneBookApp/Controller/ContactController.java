package com.shruteekaTech.PhoneBookApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
			return new ResponseEntity<String>("contact could not be saved successfully",HttpStatus.CREATED);
		}
		
		
	}
	
	

}
