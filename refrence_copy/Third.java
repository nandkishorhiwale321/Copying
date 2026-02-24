package refrence_copy;

import java.util.ArrayList;
import java.util.List;

public class Third {
	public static void main(String [] args) throws CloneNotSupportedException {
		
		Department dept =new Department();
		dept.kept.add("Machanical");
		
		
		Student st = new Student();
		
		st.id=101;
		st.dept=dept;
		
		Student st2= new Student();
		
	
		st2 = (Student) st.clone();
		st2.id=102;
		
		st2.dept.kept.add("Computer Science");
		System.out.println("Student ID : "+st.id+"  Deparment :"+st.dept.kept);
		System.out.println("***************************************************");
		System.out.println("Student ID : "+st2.id+"  Deparment :"+st2.dept.kept);
	
		
		
	}

}
class  Student implements Cloneable  {
	
	int id;
	Department dept;
	
	public Object clone() throws CloneNotSupportedException {
		Student s= (Student)super.clone();
		
		s.dept=(Department)this.dept.clone();
	
		return s;
	}

}
class Department implements Cloneable {
	
	List<String> kept= new ArrayList<>();
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
