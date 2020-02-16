package com.example.springbatch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String gender;
   private String birthDate;
   private Integer jobCategory;
   private String salary;
   private Long jobTime;
   private Long prevExp;
   private Integer minority;

   public Employee(){

   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public String getBirthDate() {
      return birthDate;
   }

   public void setBirthDate(String birthDate) {
      this.birthDate = birthDate;
   }

   public String getSalary() {
      return salary;
   }

   public void setSalary(String salary) {
      this.salary = salary;
   }

   public Long getJobTime() {
      return jobTime;
   }

   public void setJobTime(Long jobTime) {
      this.jobTime = jobTime;
   }

   public Long getPrevExp() {
      return prevExp;
   }

   public void setPrevExp(Long prevExp) {
      this.prevExp = prevExp;
   }

   public Integer getMinority() {
      return minority;
   }

   public void setMinority(Integer minority) {
      this.minority = minority;
   }

    public Integer getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(Integer jobCategory) {
        this.jobCategory = jobCategory;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", jobCategory=" + jobCategory +
                ", salary='" + salary + '\'' +
                ", jobTime=" + jobTime +
                ", prevExp=" + prevExp +
                ", minority=" + minority +
                '}';
    }
}
