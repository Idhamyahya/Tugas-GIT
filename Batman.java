class Batman extends Hero{
	
	String hero = "Batman", subject;
	
	Batman(String name, String subject){ //constructor
		this.name = name;
		this.subject = subject;
	}
	
	void display() {
		System.out.println("Halo saya "+ this.name);
	}
	
	@Override
	void greet() { 
		super.greet();  //super contructor
		System.out.println("Saya adalah "+super.hero+" "+this.hero+" identik warna hitam dan ciri khas "+subject );
	}
	
}