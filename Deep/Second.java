package Deep;

public class Second {
	public static void main (String [] args) throws CloneNotSupportedException {
		
	    Departments dept= new Departments();
	    
	    dept.Dpt_name="IT";
		
		Employee em =new Employee();
		em.name="Suraj ";
		em.id=101;
		em.dpt=dept;
		
		Employee em2 = (Employee)em.clone();
		
		em2.id=102;
		em2.name="Venkyy";
		em2.dpt.Dpt_name="HR";
		
		System.out.println("Name ::"+em.name+"   ID ::"+em.id+"   Dpt ::"+em.dpt.Dpt_name);
		System.out.println("Name ::"+em2.name+"   ID ::"+em2.id+"   Dpt ::"+em2.dpt.Dpt_name);
	}

}
class Employee implements Cloneable {
	
	Departments dpt;
	
	String name;
	int id;
	
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee)super.clone();
		e.dpt=(Departments)this.dpt.clone();
		return e;
	}
}
class Departments implements Cloneable {
	
	String Dpt_name;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

