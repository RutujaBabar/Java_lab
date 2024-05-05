import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentService {

	
	public static void addStudentData(Student[] s)
	{
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		for(int i=0; i<s.length; i++)
		{
			
			System.out.println("Enter student id :");
			int sId=sc.nextInt();
			System.out.println("enter name");
			sc.nextLine();
			String nm=sc.nextLine();
			System.out.println("Enter date of admission :(dd/MM/yyyy)");
			String doa=sc.next();
			
			
			System.out.print("Enter marks for Subject 1: ");
	        int sub1 = sc.nextInt();
	        System.out.print("Enter marks for Subject 2: ");
	        int sub2 = sc.nextInt();
	        System.out.print("Enter marks for Subject 3: ");
	        int sub3 = sc.nextInt();
	        
	        try {
				Date doa1=sdf.parse(doa);
				//create object
				s[i]=new Student(sId, nm, doa1,sub1,sub2,sub3);
				} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
		}
	}
	
	

	
	public static void percentage(Student[] st)
	{
		
		
     
		for(int i=0;i<st.length;i++)
		{
			int avg = (st[i].getSub1Marks() + st[i].getSub2Marks() + st[i].getSub3Marks())/3;
			 
		        System.out.println("Average percentage marks  : " + avg +"%");
		}
	        
	        
	}
	
	public static void displayStudentData(Student[] sarr) 
	   {
			for(int i=0;i<sarr.length;i++)
			{
				System.out.println(sarr[i]);
		
			}
			
		}
		
	
}
