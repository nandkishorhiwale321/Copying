package Deep;

public class Third {
	public static void main (String [] args) {
		
		Country cont = new Country();
		cont.name="India";
		
		States state1 =new States();
		
		state1.name="Maharashtra";
		state1.populasion=30000000;
		state1.cont=cont;
		
		States state2 =new States(state1);
		
		
		
	    state2.cont.name="Bharat";
		
		System.out.println("State  :"+state1.name+"Popul :"+state1.populasion+" Contry :"+state1.cont.name);
		
		System.out.println("State  :"+state2.name+"Popul :"+state2.populasion+" Contry :"+state2.cont.name);
		
	}

}
class States {
	
	Country cont;
	String name;
	long populasion;
	
	public States(States state) {
		this.name=state.name;
		this.populasion=state.populasion;
		this.cont= new Country();
		this.cont.name=state.cont.name;
		
	}
	
	public States() {
		
	}
	
	
}
class Country {
	
	String name;
}
