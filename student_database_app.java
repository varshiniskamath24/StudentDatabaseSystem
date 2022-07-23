/*This project is also a simple Student Management System. 
 * Scenario:you are a database administrator for a university and
 * You need to create an application to manage student enrollments and balance
 * Your application should do the following:
 * 1)Ask the user how many new students will be added to the database
 * 2)The user should be prompted to enter the name and year for each student
 * 3)The student should have a 5 digit unique id with the first number being their grade level
 * 4)A student can enroll in the following courses:
 * -History 101
 * -Maths 101
 * -English 101
 * -Chemistry 101
 * -Computer Science 101
 * 5)Each course costs $600 to enroll
 * 6)The student should be able to view their balance and pay the tuition
 * 7)To see the staus of the student we should see their name,id,courses enrolled and balance
 */
package studentdatabaseapp;

import java.util.Scanner;

public class student_database_app {
	public static void main(String args[])
	{
		
		//how many new users you want to add
		
		System.out.println("Enter number of new students to enroll: ");
		Scanner in=new Scanner(System.in);
		int numOfStudents=in.nextInt();
		student[] students=new student[numOfStudents];
		
		
		//create n number of new students
		for(int n=0;n<numOfStudents;n++)
		{
			students[n]=new student();
			students[n].enroll();
			students[n].payTuition();
		}
		for(int n=0;n<numOfStudents;n++)
		{
			System.out.println(students[n].toString());
		}
	}
}
