package week15;

class Student{
	private int rollNo;
	private String name;
	private String ClassName;
	private String text ="Flying";
	
	public void fly() {
		System.out.println(text);
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setRollNo(int value) {
		rollNo = value;
	}
	public void setName(String value) {
		name = value;
	}
	public void setClassName(String value) {
		ClassName = value;
	}
}
class Animetion extends Student{
	private String text = "Flying";
	public void play() {
		System.out.println("Animation :");
	}
}
public class TestEncapsulution {
	public static void main(String[]args) {
		Student obj = new Student();
		Animetion an = new Animetion();
		
		an.play();
		an.fly();
		
		obj.setRollNo(1);
		obj.setName("Lisa");
		obj.setClassName("IT");
		System.out.println("Student RollNo : " +obj.getRollNo());
		System.out.println("Student Name : " +obj.getName());
		System.out.println("Student ClassName : " +obj.getClassName());
		
		
		
	}
}
