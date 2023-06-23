class Hero{
	String name;
	String hero = "hero";
	
	Hero(String name, String hero){
		super();
		this.name = name;
		this.hero = hero; 
	}

	public Hero() {
		super();
	}

	void display() {
		System.out.println("Ini adalah macam macam "+ this.hero);
	}
	void greet() {
	
		System.out.println("Saya salah satu "+this.hero);
	}
}