package Deep;

public class First {
	public static void main (String [] args) throws CloneNotSupportedException {
		
		Forest forest= new Forest();
		forest.Ani_Name="Kaloba";
		
		Animal ani =new Animal();
		ani.name="Loan";
		ani.f=forest;
		
		Animal ani2 =(Animal) ani.clone();
		ani2.name="Dog";
		ani2.f.Ani_Name="BhimaShankar Abhyarnay";
		
		System.out.println(ani.name+" : "+ani.f.Ani_Name);
		System.out.println(ani2.name+" : "+ani2.f.Ani_Name);
		
		
	}
 
}
class Animal implements Cloneable{
	Forest f;
	String name;
	
	public Object clone() throws CloneNotSupportedException {
		Animal a=(Animal)super.clone();
		a.f=(Forest)this.f.clone();
		return a;
	}
	
}
class Forest implements Cloneable {
	String Ani_Name;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
