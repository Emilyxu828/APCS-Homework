/*public class Driver{
    public static void main(String[] args){
	Greeter g;
	g = new Greeter();
        System.out.println(g);
	g.greet();
	g.greet();
    }
}
*/

public class Driver {
    public static void main(String[] args){
	Greeter g1 = new Greeter();
	Greeter g2 = new Greeter();
	g2.setGreeting("Howdy!");
	g1.greet();
	g2.greet();
	/*g1.greeting = new String("Sup!");
       	g1.greet();
	g2.greet();*/

	String s = g1.getGreeting();
	System.out.println("g1's greeting is: "+s);
	System.out.println("g2's greeting is: "+g2.getGreeting());

    }
}
