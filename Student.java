package week3.day1;

public class Student {
public int getStudentInfo(int id) {
	return id;
	
}
public void getStudentInfo(int id, String name) {
	System.out.println(id+" "+ name);
}
public void getStudentInfo(String email,long phoneNum) {
	System.out.println(email+" "+ phoneNum);
	
}
public static void main(String[] args) {
	Student std=new Student();
	
	std.getStudentInfo(2226,"Varshini");
	System.out.println(std.getStudentInfo(2226));
	std.getStudentInfo("varshu26.may@gmail.com", 9887654364l);
	
	
}
}

