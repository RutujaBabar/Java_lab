

public class TestStudent {

	public static void main(String[] args) {
		
		
		Student[] sarr=new Student[1];
		
		StudentService.addStudentData(sarr);
		
		StudentService.percentage(sarr);
		StudentService.displayStudentData(sarr);

	}

}
