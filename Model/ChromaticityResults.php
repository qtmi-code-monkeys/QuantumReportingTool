<?php

class ChromaticityResults{

	private	$m_id = -1;
	private $m_cusotmer_id = -1;
	private $m_report_id = -1;
	private $m_machine = "";
	private $m_coating = "";
	private $m_LAB = "";
	private $m_curve_success = "";
	
	public function __construct($customer_id, $report_id, $machine, $coating, $LAB, $curve_success){
		$this->m_customer_id = $customer_id;
		$this->m_report_id = $report_id;
		$this->m_machine = $machine;
		$this->m_coating = $coating;
		$this->m_LAB = $LAB;
		$this->m_curve_success = $curve_success;
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
	
	public function getLAB(){
		return $this->m_LAB;	
	}
	
	public function setLAB($LAB){
		$this->m_LAB = $LAB;
	}
	
	public function getCurvePassFail(){
		return $this->m_curve_success;
	}
	
	public function setCurvePassFail($curve_success){
		$this->m_curve_success = $curve_success;	
	}
	
}

?>