package hw.ch13;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			return this.studentNum == stu.studentNum;
		}else 
			return false;
	}
}
