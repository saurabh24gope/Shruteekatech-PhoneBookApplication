package com.shruteekaTech.PhoneBookApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shruteekaTech.PhoneBookApp.Entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
