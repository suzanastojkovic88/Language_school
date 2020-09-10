package language_school;

import java.util.Scanner;

public class CourseParticipant {

	private String firstName;
	private String lastName;
	private String participantId;
	private String languages = "";
	private int courseLevel;
	private int payBalance;
	private static int price = 100;
	private static int id = 0;

	public CourseParticipant() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter course participant first name: ");
		this.firstName = sc.nextLine();

		System.out.print("Enter course participant last name: ");
		this.lastName = sc.nextLine();

		id++;

	}

	public void enroll() {

		do {
			System.out.print("Enter the course (English, German, French, Arabic ...) or Q to quit: ");
			Scanner sc = new Scanner(System.in);
			String language = sc.nextLine();

			if (!language.equalsIgnoreCase("Q")) {
				System.out.println(
						"1-Beginner Low\n2-Beginner High\n3-Intermediate Low\n4-Intermediate High\n5-Advanced Low\n6-Advanced Mid\n7-Advanced High\n8-Superior\nEnter course level: ");
				this.courseLevel = sc.nextInt();

				languages = languages + "\n-" + language + "/level " + courseLevel;
				payBalance = payBalance + price;
			} else {
				break;
			}
		} while (1 != 0);

	}

	public void viewBalance() {
		System.out.println("The amount you need to pay is: €" + payBalance);
	}

	public void payForCourse() {
		viewBalance();
		System.out.print("Enter your payment: €");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		payBalance = payBalance - payment;
		System.out.println("Thank you for your payment of €" + payment);

		viewBalance();
	}

	public String toString() {
		return "--------------------------------\nName: " + firstName + " " + lastName + "\nParticipant ID: " + id
				+ "\nCourses enrolled: " + languages + "\nBalance: €" + payBalance
				+ "\n--------------------------------";

	}

}
