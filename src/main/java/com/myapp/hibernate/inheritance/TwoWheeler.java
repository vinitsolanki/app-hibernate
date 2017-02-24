package com.myapp.hibernate.inheritance;

import javax.persistence.*;

@Entity
@Table(name="TWO_WHEELER")
public class TwoWheeler extends Vehicle
{
 @Column(name="STEERING_TYPE")
 private String steeringTwoWheeler;

 public String getSteeringTwoWheeler()
 {
  return steeringTwoWheeler;
 }

 public void setSteeringTwoWheeler(String steeringTwoWheeler) 
 {
  this.steeringTwoWheeler = steeringTwoWheeler;
 }
}