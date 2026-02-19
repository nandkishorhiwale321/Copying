package refrence_copy;

public class Second {
	public static void main (String [] args)
	{
		
		
		Employee em = new Employee();
		
		em.name="Omkar kale";
		em.id=101;
		em.Gender="Male";
		em.Dpmt="IT";
		em.price=35000.20;
		
	
		System.out.println("Name :"+em.name+"\nId   :"+em.id+"\nGender :"+em.Gender+"\nDpmt :"+em.Dpmt+"\nPrice :"+em.price);
		
		
		System.out.println("*********************************************");
		Employee em2= em;
		em2.name="Narayan Murty";
		em2.id=102;
		em2.Gender="Male";
		em2.Dpmt="IT";
		em2.price=37000.20;
		
		System.out.println("Name :"+em.name+"\nId   :"+em.id+"\nGender :"+em.Gender+"\nDpmt :"+em.Dpmt+"\nPrice :"+em.price);
		System.out.println("-----------------------------------------------");
		System.out.println("Name :"+em2.name+"\nId   :"+em2.id+"\nGender :"+em2.Gender+"\nDpmt :"+em2.Dpmt+"\nPrice :"+em2.price);

		
	}
}
class Employee {
	
	String name;
	int id;
	String Gender;
	double price;
	String Dpmt;
	
	
}
