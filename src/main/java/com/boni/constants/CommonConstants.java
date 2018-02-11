package com.boni.constants;

public class CommonConstants {

	public enum TypeConstant{
		electricity("electricity"),
	    dsl("dsl"),
	    appartment_rent("appartment rent");
		
		private String type;
		 
		TypeConstant(String type) {
	        this.type = type;
	    }
		
		public String getType() {
	        return type;
	    }
	}
	
	
}
