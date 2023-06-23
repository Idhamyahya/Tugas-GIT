

public class App {
    public static void main(String[] args) {
       
    	System.out.println();
    	Hero hero1 = new Hero();
    	hero1.name = "Idham";
    	hero1.display();
    	
    	System.out.println();
    	Superman superman1 = new Superman("Yahya","Jubah");//constructor
//    	superman1.name = "Yahya";
//    	superman1.subject = "Jubah";
    	superman1.display();
    	superman1.greet();
    	
    	System.out.println();
    	Batman batman1 = new Batman("Idham","Kelalawar");//constructor
//    	batman1.name = "Idham";
//    	batman1.subject = "Kelalawar";
    	batman1.display();
    	batman1.greet();
    	
    	System.out.println();
    	Hulk hulk1 = new Hulk("Miki","Besar");//constructor
//    	hulk1.name = "Miki";
//    	hulk1.subject = "Besar";
    	hulk1.display();
    	hulk1.greet();


    	
    	
    	

    }
}