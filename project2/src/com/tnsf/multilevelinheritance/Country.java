package com.tnsf.multilevelinheritance;

public class Country {
     private String countryname;
     
     public void country(String countryname) {
    	     super();
    	 this.countryname = countryname;
    	 
     }
     
     public String getCountryname() {
    	 return countryname;
     }
     
     public void setCountryname(String countryname) {
    	 this.countryname = countryname;
     }
     
     @Override
     public String toString() {
    	 return "Country[countryname=" + countryname + "]";
     }
    	 
     }

