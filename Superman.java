class Superman extends Hero{
	
	String hero = "Superman", subject;
	
	Superman(String name, String subject){ //constructor
		this.name = name;
		this.subject = subject;
	}
	
	Superman(){
		
	}

	void display() {
		System.out.println("Halo saya "+ this.name);
	}
	
	@Override
	void greet() {
		super.greet(); //super contructor
		System.out.println("Saya adalah "+super.hero+ " " +this.hero+ " identik warna merah biru mempunyai "+subject);
	}
} 