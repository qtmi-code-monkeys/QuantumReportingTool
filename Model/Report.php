<?php
class Report{
	private $m_id = -1;
	private $m_creation_date;
	private $m_customer_id;
	private $m_machine;
	private $m_coating;
	private $m_report_filename;
	private $m_test_type = "";
	
	public function __construct($creation_date = "", $customer_id = -1, $machine = "", $pre_install = false, $hot = false, $standard = false, $non_standard = false, $coating = "", $report_filename = ""){
		$this->m_creation_date = $craetion_date;
		$this->m_customer_id = $customer_id;
		$this->m_machine = $machine;
		$this->m_coating = $coating; 
		$this->m_report_filename = $report_filename;
		if($pre_install){
			$this->m_test_type = "Pre-Install";
		}
		else if($hot){
			$this->m_test_type = "Hot";	
		}
		else if($standard){
			$this->m_test_type = "Standard";
		}
		else if($non_standard){
			$this->m_test_type = "Non-Standard";	
		}
	}
	
	public function __destruct(){
	}
	
	public function getId(){
		return $this->m_id;
	}
	
	public function getCreationDate(){
		return $this->m_creation_date;	
	}
	
	public function setCreationDate($creation_date){
		$this->m_creation_date = $creation_date;
	}
	
	public function getCustomerId(){
		return $this->m_customer_id;	
	}
	
	public function setCreationDate($customer_id){
		$this->m_customer_id = $customer_id;
	}
	
	public function getMachine(){
		return $this->m_machine;	
	}
	
	public function setMachine($machine){
		$this->m_machine = $machine;
	}
	
	public function getTestType(){
		return $this->m_test_type;
	}
	
	public function setTestType($test_type){
		$this->m_test_type = $test_type;
	}
	
	public function getCoating(){
		return $this->m_coating;	
	}
	
	public function setCoating($coating){
		$this->m_coating = $coating;
	}
	
	public function getReportFilename(){
		return $this->m_report_filename;	
	}
	
	public function setReportFilename($report_filename){
		$this->m_report_filename = $report_filename;
	}
		
}
?>