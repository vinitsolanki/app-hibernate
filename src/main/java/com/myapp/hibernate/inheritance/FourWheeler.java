package com.myapp.hibernate.inheritance;

import javax.persistence.*;

@Entity
@Table(name="FOUR_WHEELER")
public class FourWheeler extends Vehicle
{
 @Column(name="STEERING_TYPE")
 private String steeringFourWheeler;

 public String getSteeringFourWheeler() 
 {
  return steeringFourWheeler;
 }

 public void setSteeringFourWheeler(String steeringFourWheeler) 
 {
  this.steeringFourWheeler = steeringFourWheeler;
 }
}