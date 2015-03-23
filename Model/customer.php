<?php

class Customer{
	
	//declare member variables
	private $m_id = -1;
	private $m_name;
	private $m_contact_name;
	private $m_contact_phone;
	private $m_contact_email;
	private $m_number_of_machines;
	
	
	//constructor/destructor
	function __construct($name = "", $contact_name = "", $contact_phone = "", $contact_email = "", $number_of_machines = -1){
		$this->m_name = $name;
		$this->m_contact_name = $contact_name;
		$this->m_contact_phone = $contact_phone;
		$this->m_contact_email = $contact_email;
		$this->m_number_of_machines = $number_of_machines;
	}
	
	function __destruct(){
		
	}
	
	
	//all of the getters/setters
	function getId(){
		return $this->m_id;
	}
	
	function getName(){
		return $this->m_name;
	}
	
	function setName($name){
		$this->m_name = $name;	
	}
	function getContactName(){
		return $this->m_contact_name;
	}
	
	function setContactName($contact_name){
		$this->m_contact_name = $contact_name;	
	}
	function getContactPhone(){
		return $this->m_contact_phone;
	}
	
	function setContactPhone($contact_phone){
		$this->m_contact_phone = $contact_phone;	
	}
	function getContactEmail(){
		return $this->m_contact_email;
	}
	
	function setContactEmail($contact_email){
		$this->m_contact_email = $contact_email;	
	}
	function getNumberOfMachines(){
		return $this->m_number_of_machines;
	}
	
	function setNumberOfMachines($number_of_machines){
		$this->m_number_of_machines = $number_of_machines;	
	}
}
?>