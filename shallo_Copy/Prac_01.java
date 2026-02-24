package shallo_Copy;

public class Prac_01 {
	public static void main(String [] args) throws CloneNotSupportedException {
		Univer un1 = new Univer();
		un1.Uname="SGBUA";
		
		Collage cal1 = new Collage();
		 cal1.Collname="RSCE";
		 cal1.CollCode=1101;
		 cal1.un=un1;
		 
		 Collage cal2=(Collage) cal1.clone();
		 
		 cal2.Collname="SRTM";
		 cal2.CollCode=2002;
		 
		cal2.un.Uname="Batu";
		 
		 
		 System.out.println("Name :"+cal1.Collname+" Collage Code :"+cal1.CollCode+"  Univarcity :"+cal1.un.Uname);
		 
		 System.out.println("Name :"+cal2.Collname+" Collage Code :"+cal2.CollCode+"Univarcity :"+cal2.un.Uname);
		 
		
	}

}
class Collage implements Cloneable {
	
	Univer un;
	
	String Collname;
	int CollCode;
	
	public Object clone() throws CloneNotSupportedException {
		Collage c = (Collage)super.clone();
		c.un=(Univer)this.un.clone();
		return c;
	}
	
	
}
class Univer implements Cloneable {
	
	String Uname;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
