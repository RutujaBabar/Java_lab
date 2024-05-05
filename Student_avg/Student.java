import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

	private int sId;
	private String name;
	private Date date;
	private int sub1,sub2,sub3;
	
	//default constructor
	public Student() 
	{
		  this(0,null,null,0,0,0);
		  
				
	}
	
	//parametrized constructor
	public Student(int id,String nm,Date doa,int s1, int s2, int s3){
        this.sId=id;
        name=nm;
        this.date=doa;
       sub1=s1;
        sub2=s2;
        sub3=s3;
        
		
   } 

	//getter and setter
	
	 public void setSid(int id)
	 {
	      this.sId=id;
	 }
	      
	 public int getSid()
	   {
	       return sId;
	   }    
	
	 
	 public void setname(String nm)
	   {
	      this.name=nm;
	   }
	 
	 public String getname(){
	       return name;
	   }
	 
	
	  public void setDOA(Date d)
	  {
	      this.date=d;
	   }
	  
	  public Date getDOA()
	  {
	       return date;
	   }
	  
	  
	  public void setSub1Marks(int m1)
	  {
		  this.sub1=m1;
	  }
	  public int getSub1Marks()
	  {
		  return sub1;
	  }
	  
	  public void setSub2Marks(int m2)
	  {
		  this.sub2=m2;
	  }
	  public int getSub2Marks()
	  {
		  return sub2;
	  }
	  
	  public void setSub3Marks(int m3)
	  {
		  this.sub3=m3;
	  }
	  
	  public int getSub3Marks()
	  {
		  return sub3;
	  }
	  //display
	  public String toString(){
		   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		   String d=sdf.format(date);
	      return "Id :"+ sId + " Name : " + name + " date of admission :"  + d ;
	      
	     
	   }
}
