public class Driver {
    public static void  main(String[] args){
	Shapes s =  new Shapes();
	System.out.println(s.box(5,4));
	System.out.println(s.box(4,5));
	
	System.out.println(s.tri1(3));
	System.out.println(s.tri1(13));
	System.out.println(s.tri2(3));
	System.out.println(s.tri2(13));
	
	System.out.println(s.tri3(3));
	System.out.println(s.tri3(13));
	System.out.println(s.tri4(3));
	System.out.println(s.tri4(13));
	System.out.println(s.diamond(3));
	System.out.println(s.diamond(13));
    }
}
