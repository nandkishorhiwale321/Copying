package Deep;

public class Deep_Copy_Cons {
	public static void main (String [] args) {
		
		Flipkart flip=new Flipkart();
		flip.Costumer_Name="Nanda Patil";
		
		Order ord = new Order();
		ord.Order_Name="Smart Watch";
		ord.price=1250;
		ord.flip=flip;
		
		Order ord2= new Order(ord);
		
		ord2.flip.Costumer_Name="Aakash sir";
		
		System.out.println(ord.Order_Name+ord.price+ord.flip.Costumer_Name);
		System.out.println(ord2.Order_Name+ord2.price+ord2.flip.Costumer_Name);
		
		
	}

}
class Order {
	
	Flipkart flip;

	String Order_Name;
	int price;
	
	public Order(Order order) {
		this.Order_Name=order.Order_Name;
		this.price=order.price;
		this.flip=new Flipkart();
		this.flip.Costumer_Name=order.flip.Costumer_Name;
	}
	
	public Order() {
		
	}
	
	
}
class Flipkart 
{
	String Costumer_Name;
}
