package com.Codsoft.Student_Grade_Calculator;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		int totalMarks = 0;
		char grade;

		System.out.println("\t\t\t\t\t* STUDENT GRADE CALCULATOR *");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of subject: ");
		int numofSubject = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= numofSubject; i++) {
			System.out.println("Enter marks obtained(out of 100) in subject: " + i);
			int marks = sc.nextInt();
			totalMarks = totalMarks + marks;

		}
		double averagePercentage = (totalMarks / numofSubject);

		if (averagePercentage >= 90) {
			grade = 'A';
		} else if (averagePercentage >= 80) {
			grade = 'B';
		} else if (averagePercentage >= 70) {
			grade = 'C';
		} else if (averagePercentage >= 60) {
			grade = 'D';
		} else if (averagePercentage >= 50) {
			grade = 'E';
		} else {
			grade = 'E';
		}

		System.out.println("-------------------------------------------------");
		System.out.println("\nResults: ");
		System.out.println("TotalMarks:-> " + totalMarks);
		System.out.println("Average Percentage:-> " + averagePercentage + "%");
		System.out.println("Grade:-> " + grade);

		sc.close();
	}

}
