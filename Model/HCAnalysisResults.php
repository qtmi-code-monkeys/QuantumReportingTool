<?php

class HCAnalysisResults{
	
	private	$m_id = -1;
	private $m_cusotmer_id = -1;
	private $m_report_id = -1;
	private $m_machine = "";
	private $m_hardcoat = "";
	private $m_average_thickness = -1;
	private $m_average_haze = -1;
	private $m_delam_test = "";
	
	public function __construct($customer_id, $report_id, $machine, $hardcoat, $average_thickness, $average_haze, $delam_test){
		$this->m_customer_id = $customer_id;
		$this->m_report_id = $report_id;
		$this->m_machine = $machine;
		$this->m_hardcoat = $hardcoat;
		$this->m_average_thickness = $average_thickness;
		$this->m_average_haze = $average_haze;
		$this->m_delam_test = $delam_test;
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
	
	public function getMachine(){
		return $this->m_machine;	
	}
	
	public function setMachine($machine){
		$this->m_machine = $machine;
	}
	
	public function getReportId(){
		return $this->m_report_id;	
	}
	
	public function setReportId($report_id){
		$this->m_report_id = $report_id;	
	}
	
	public function getHardcoat(){
		return $this->m_hardcoat;
	}
	
	public function setHardcoat($hardcoat){
		$this->m_hardcoat = $hardcoat;
	}
	
	public function getAverageThickness(){
		return $this->m_average_thickness;
	}
	
	public function setAverageThickness($average_thickness){
		$this->m_average_thickness = $average_thickness;
	}
	
	public function getAverageHaze(){
		return $this->m_average_haze;
	}
	
	public function setAverageHaze($average_haze){
		$this->m_average_haze = $average_haze;
	}
		
	public function getDelamTest(){
		return $this->m_delam_test;
	}
	
	public function setDelamTest($delam_test){
		$this->m_delam_test = $delam_test	
	}	
}

?>