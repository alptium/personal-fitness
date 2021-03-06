package com.alptium.personalfitness;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Welcome to the Orca gym!");
			System.out.println("Please chose your next step.");
			System.out.println("Do you want to enter details about new trainer or new member?");
			System.out.println("If your choise is trainer, please type TRAINER");
			System.out.println("If your choise is new member, please type MEMBER");
			String detailsType = sc.next();
			
			if (detailsType.equals("trainer")) {
				runDemoTrainer();
			} else if (detailsType.equals("member")) {
				runDemoMember();
		
			}
			
		}
}

	private static void runDemoMember() {

		try(Scanner sc = new Scanner(System.in)) {
			
				System.out.println("Enter the new member's ID:");
				int memberId = sc.nextInt();
				
				System.out.println("Enter the first name of new member:");
				String firstName = sc.next();
				
				System.out.println("Enter the last name of new member:");
				String lastName = sc.next();
				
				System.out.println("Enther the birth year:");
				int birthYear = sc.nextInt();
				
				System.out.println("Please enter your gender: F or M?");
				char gender = sc.next().charAt(0);
				
				System.out.println("Please enter member's address:");
				String address = sc.next();
				
				System.out.println("Does member have any injuries? True or false");
				boolean hasInjuries = sc.nextBoolean();
				
				Member member = new Member (firstName, lastName, birthYear, memberId, gender, address, hasInjuries);
				System.out.println("File for new member has been done. Check data before saving!");
				System.out.println("Member ID: " + member.getMemberId());
				System.out.println("First and last name: " + member.getFirstName() + " " + member.getLastName());
				System.out.println("Year of birth: " + member.getBirthYear());
				System.out.println("Member's gender: " + member.getGender());
				System.out.println("Member's address: " + member.getAddress());
				System.out.println("Does member have any injuries? " + member.getHasInjuries());
		
				System.out.println("===================================================================");
				
				System.out.println("Please chose your next step.");
				System.out.println("Do you want to enter details about new trainer or new member?");
				System.out.println("If your choise is trainer, please type TRAINER");
				System.out.println("If your choise is new member, please type MEMBER");
				String detailsType = sc.next();
				
				if (detailsType.equals("trainer")) {
					runDemoTrainer();
				} else if (detailsType.equals("member")) {
					runDemoMember();
				
				}
		}
		
	}

	private static void runDemoTrainer() {
		
		try(Scanner sc = new Scanner(System.in)) {
			
				System.out.println("Enter the first name of trainer:");
				String name = sc.next();
				System.out.println("Enter the last name of trainer:");
				String surname = sc.next();
				System.out.println("Enter how many years of experience trainer has:");
				int yearsOfExperience = sc.nextInt();
				System.out.println("Enter the availability of the trainer. True or false?");
				boolean isAvailable = sc.nextBoolean();
			
				Trainer trainer = new Trainer (name, surname, yearsOfExperience, isAvailable);
				
				System.out.println("File for new trainer has been done. Check data before saving!");
				System.out.println("Trainer first name: " + trainer.getName());
				System.out.println("Trainer surname: " + trainer.getSurname());
				System.out.println("Trainer years of expriance: " + trainer.getYearsOfExperience());
				System.out.println("Availability of the trainer: " + trainer.getIsAvailable());
				
				System.out.println("=========================================================");
				
				System.out.println("Please chose your next step.");
				System.out.println("Do you want to enter details about new trainer or new member?");
				System.out.println("If your choise is trainer, please type TRAINER");
				System.out.println("If your choise is new member, please type MEMBER");
				String detailsType = sc.next();
				
				if (detailsType.equals("trainer")) {
					runDemoTrainer();
				} else if (detailsType.equals("member")) {
					runDemoMember();
				
				}
					
		}
	
	}	
}
	

	

	


