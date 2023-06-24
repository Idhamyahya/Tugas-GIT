
public class Popay extends Hero {
	String hero = "Popay", subject;
	
	Popay(String name, String subject){
		this.name = name;
		this.subject = subject;
	}
	
	Popay(){
		
	}
	
	void display() {
		System.out.println("Halo saya "+ this.name);
	}

	
	@Override
	void greet() {
		super.greet();  //super contructor
		System.out.println("Saya adalah "+super.hero+" "+this.hero+" saya adalah "+subject);
	}
	
	
	
	
}
