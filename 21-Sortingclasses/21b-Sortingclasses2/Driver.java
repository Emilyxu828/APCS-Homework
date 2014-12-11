import java.util.*;

public class Driver{
    public static void main(String[]args){
	Archer[] arch = new Archer[5];
	arch[0] = new Archer("Bob");
	arch[1] = new Archer("Peeta");
	arch[2] = new Archer("Liam");
	arch[3] = new Archer("Jerry");
	arch[4] = new Archer("Ben");

	System.out.println("before: " + Arrays.toString(arch));
	Arrays.sort(arch);
	System.out.println("after: " + Arrays.toString(arch));
    }
}
