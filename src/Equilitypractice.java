
public class Equilitypractice {

	public static void main(String[] args) {
		
		String a = new String("Hello");
		String b = new String("Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println("equals() method: " + a.equals(b));
		// Each Object has its own location in memory, so they different Objects even though they contain the same data.
		// value of to Objects can be compared using the .equals() method.
		int x = 5;
		int y = 5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
		//Primitive data types are comparing the same literal data; in this case 5 is the literal data.
		
	}

}
