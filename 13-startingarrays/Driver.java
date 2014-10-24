public class Driver {
    public static void main (String[] args){
	startingarrays hello = new startingarrays();
    
    System.out.println(hello.frontPiece({1,2,3,4,5}));
	System.out.println(hello.frontPiece({}));
	System.out.println(hello.frontPiece({45,3}));

	System.out.println(hello.sum13({0}));
	System.out.println(hello.sum13({1,2,3,4,5}));
	System.out.println(hello.sum13({13,13,13,2,3,5,4,13,4,13,6,78}));
    }
}