package Files;

public class helloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World, I'm back");
		
		for(int i = 221; i < 448; i++) {
			if (i < 10) {
				System.out.print(", GBRP265DG00" + i);
			} else if (i < 100) {
				System.out.print(", GBRP265DG0" + i);
			} else {
				System.out.print(", GBRP265DG" + i);
			}
		}
	}
}
