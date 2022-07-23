package studentdatabaseapp;
import java.util.*;
public class student {

		private String firstname;
		private String lastname;
		private int gradeYear;
		private String studentID;
		private String courses="";
		private int tuitionBalance=0;
		private static int costOfCourse=600;
		private static int id=1000;
		
		//constructor:prompt user to enter students's name and year
		public student()
		{
			Scanner in=new Scanner(System.in);
			System.out.print("Enter student first name: ");
			this.firstname=in.nextLine();
			System.out.print("Enter student last name: ");
			this.lastname=in.nextLine();
			System.out.print("1 for freshers\n2 for sophomore\n3 for junior\n4 for senior\nEnter student class level ");
			this.gradeYear=in.nextInt();
			setStudentID();
			
			
			
		}
		
		//generate an ID
		private void setStudentID() {
			//grade level+ID
			id++;
			this.studentID= gradeYear+""+id;
		}
		
		//enroll in courses
		public void enroll() {
			//get inside loop,user hits 0
			do {
				System.out.print("Enter course to enroll(Q to quit) ");
				Scanner in=new Scanner(System.in);
				String course=in.nextLine();
				if(!course.equals("Q"))
				{
					courses=courses+"\n "+course;
					tuitionBalance=tuitionBalance+costOfCourse;
				}
				else
				{
					break;
				}
				
			}while(1!=0);
			
		}
		
		//view balance
		public void viewBalance(){
			System.out.println("Your balance is: $"+tuitionBalance);
			
		}
		
		//pay tuition 
		public void payTuition() {
			viewBalance();
			System.out.print("Enter your payment: $");
			Scanner in=new Scanner(System.in);
			int payment=in.nextInt();
			tuitionBalance=tuitionBalance-payment;
			System.out.println("Thank you for your payment of $"+payment);
			viewBalance();
			
		}
		
		//show status
		public String toString() {
			return "Name: "+firstname+" "+lastname+
					"\nGrade level: "+gradeYear+
					"\nStudent ID: "+studentID+
					"\nCourses Enrolled:"+courses+
					"\nBalance: $"+tuitionBalance;
		}
	

}
