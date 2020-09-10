package language_school;

import java.util.Scanner;

public class CoursesApp {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("     HELLO WORLD");
		System.out.println("   Language School");
		System.out.println("");
		System.out.println("Enter number of new participants to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfParticipants = sc.nextInt();
		CourseParticipant[] participants = new CourseParticipant[numOfParticipants];

		for (int n = 0; n < numOfParticipants; n++) {
			participants[n] = new CourseParticipant();
			participants[n].enroll();
			participants[n].payForCourse();
			System.out.println(participants[n].toString());
		}

	}

}
