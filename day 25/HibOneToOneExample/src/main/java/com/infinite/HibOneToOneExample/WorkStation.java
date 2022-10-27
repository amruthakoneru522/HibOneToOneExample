package com.infinite.HibOneToOneExample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="WorkStation2341")
public class WorkStation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
   private int workstationId;
	
   private String floorNo;
   private String cubicalId;
   private String domain;
   private String rackFacility;
   @OneToOne(targetEntity=Employ.class)
   private Employ employ;
   
   
public Employ getEmploy() {
	return employ;
}
public void setEmploy(Employ employ) {
	this.employ = employ;
}
public int getWorkstationId() {
	return workstationId;
}
public void setWorkstationId(int workstationId) {
	this.workstationId = workstationId;
}
public String getFloorNo() {
	return floorNo;
}
public void setFloorNo(String floorNo) {
	this.floorNo = floorNo;
}
public String getCubicalId() {
	return cubicalId;
}
public void setCubicalId(String cubicalId) {
	this.cubicalId = cubicalId;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public String getRackFacility() {
	return rackFacility;
}
public void setRackFacility(String rackFacility) {
	this.rackFacility = rackFacility;
}
   
}
