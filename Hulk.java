
 class Hulk extends Hero {
	String hero = "hulk", subject;
	
	Hulk(String name, String subject){ //constructor
		this.name = name;
		this.subject = subject;
	}

	void display() {
		System.out.println("Halo saya "+ this.name);
	}
	
	@Override
	void greet() {
		super.greet();  //super contructor
		System.out.println("Saya adalah "+super.hero+" "+this.hero+" identik warna hijau dan berbadan "+subject);
	}
}
