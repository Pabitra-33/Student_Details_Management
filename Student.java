import java.util.*;
class Student
{
 String name;
 int roll;
 int m1,m2,m3;
 char gd; 
 
 void StudentDetail(String nm,int rl,int m1,int m2,int m3)
 {
   	name=nm;
	roll=rl;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	gd='F';
 }
 char Grade(Student s)
 {
   
   int sum=s.m1+s.m2+s.m3;
   int avg= sum/3;
	if(avg >=90 && avg <=100)
		gd='O';
	if(avg >=80 && avg <=89)
		gd='E';
	if(avg >=70 && avg <=79)
		gd='A';
	if(avg >=60 && avg <=69)
		gd='B';
	if(avg >=50 && avg <=59)
		gd='C';
	if(avg <50)
		gd='F';
	return gd;

 }
void Show(Student s)
{
	System.out.println("Student Details");
	System.out.println("==========================");
	System.out.println("Name : " + s.name);
	System.out.println("Roll Number : "+ s.roll);
	System.out.println("Phy : " + s.m1);
	System.out.println("Chem : " + s.m2);
	System.out.println("Math : " + s.m3);
	System.out.println("Grade : " + s.gd);
	System.out.println("==========================");

}
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	Student s1=new Student();
	Student s2=new Student();
	int i,m1,m2,m3,roll;
	String nm;
	for(i=1;i<3;i++)
	{
		System.out.println("Enter Student Name:");
		nm=sc.next();
		System.out.println("Enter Student Roll Number:");
		roll=sc.nextInt();
		System.out.println("Enter Phy Mark:");
		m1=sc.nextInt();
		System.out.println("Enter Chem Mark:");
		m2=sc.nextInt();
		System.out.println("Enter Math Mark:");
		m3=sc.nextInt();
		if(i==1)
		{
			s1.StudentDetail(nm,roll,m1,m2,m3);
			s1.gd=s1.Grade(s1);
			
		}
		if(i==2)
		{
			s2.StudentDetail(nm,roll,m1,m2,m3);
			s2.gd=s2.Grade(s2);
			
		}
				
	}

		s1.Show(s1);
		s2.Show(s2);		
	
	
}

}