<?php

class WcaResults{

	private	$m_id = -1;
	private $m_cusotmer_id;
	private $m_report_id;
	private $m_machine;
	private $m_coating; 
	private $m_result;
	
	public function __construct($customer_id = -1, $report_id = -1, $machine = "", $coating = "", $result = -1){
		$this->m_customer_id = $customer_id;
		$this->m_report_id = $report_id;
		$this->m_machine = $machine;
		$this->m_coating = $coating;
		$this->m_result = $result;
	}
	
	public function __destruct(){
		}
	
	public function getId(){
		return $this->m_id;	
	}
	
	public function getCustomerId(){
		return $this->m_customer_id;
	}
	
	public function setCustomerId($customer_id){
		$this->m_customer_id = $customer_id;
	}
	
	public function getReportId(){
		return $this->m_report_id;	
	}
	
	public function setReportId($report_id){
		$this->m_report_id = $report_id;	
	}
	
	public function getMachine(){
		return $this->m_machine;	
	}
	
	public function setMachine($machine){
		$this->m_machine = $machine;
	}
	
	public function getCoating(){
		return $this->m_coating;	
	}
	
	public function setCoating($coating){
		$this->m_coating = $coating;	
	}
	
	public function getResult(){
		return $this->m_result;	
	}
	
	public function setLAB($result){
		$this->m_result = $result;
	}
}

?>