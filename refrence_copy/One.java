package refrence_copy;

public class One {
	public static void main  (String [] args) {
		
		Animal ani = new Animal();
		
		ani.id=101;
		ani.name="Dog";
		
		System.out.println("*****Refrence of ani*****");
		System.out.println("Name :"+ani.name+"\nId   :"+ani.id);
		
		Animal ani2 = ani;
		
		System.out.println("*****Refrence of ani2*****");
		System.out.println("Name :"+ani2.name+"\nId   :"+ani2.id);
		
		System.out.println(ani== ani2);
		
	}

}
class Animal 
{
	String name;
	int id;
}
