package shallo_Copy;

public class ShalloCopy_01 {
	public static void main (String [] args ) throws CloneNotSupportedException {
		
		
		ShowRoom smr = new ShowRoom();
		smr.ShowRoom_Name="kothrud";
		
		Bike b = new Bike();
			
		b.name="Spender plus";
		b.price=90000;
		b.sm=smr;
	
		
		
		
		
		Bike b2=(Bike) b.clone();
		
		
		
		b2.name="HF-Deulex";
		b2.price=80000;
		b2.sm.ShowRoom_Name="pune";
		
		System.out.println("Name :"+b2.name+" : price :"+b2.price+"ShowRoom :"+b2.sm.ShowRoom_Name);
		System.out.println("Name :"+b.name+" : price :"+b.price+"ShowRoom :"+b.sm.ShowRoom_Name);
	}

}
class Bike implements Cloneable {
	
	ShowRoom sm;
	
	String name;
	double price;
	

	
	public Object clone() throws CloneNotSupportedException {
		
//		Bike b=(Bike)super.clone();
//		b.sm=(ShowRoom)this.sm.clone();
		return super.clone();
	}
}
class ShowRoom  implements Cloneable{
	
	String ShowRoom_Name;
//	
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//		
//	}
}
