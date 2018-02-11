package com.boni;

import java.util.Scanner;

import com.boni.constants.CommonConstants.TypeConstant;

public class TypePrinter {

	public static void main(String[] args) {
		TypePrinter printer = new TypePrinter();
		System.out.println("Please Enter the type from below list...");
		
		for(TypeConstant typeConstant:TypeConstant.values()){
			System.out.println(typeConstant.name());
		}
		
		System.out.println();
		
		try(Scanner scanner = new Scanner(System.in)){
			String type = scanner.next()+scanner.nextLine();
			printer.processContract(type);
		}catch(Exception e){
			System.out.println("Some error occured");
		}
		
	}
	public void processContract(String type) {
		try{
			TypeConstant typeConstant = TypeConstant.valueOf(type);
			System.out.println("Processed "+typeConstant.getType());
		}catch(IllegalArgumentException e){
			System.out.println("Invalid Type selected: "+type);
		}
	}

}
