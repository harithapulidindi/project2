package com.tnsif.overridingprog;

public class Sbi extends Rbi {
        public float getRateOfIntrest() {
        	System.out.println(super.getRateOfInterest());
        	return 5.5f;
        }

}
