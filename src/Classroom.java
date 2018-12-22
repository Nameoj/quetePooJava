
public class Classroom {

	public static void main(String[] args) {
		
		Wilder aymeric = new Wilder("Aymeric", true);
		Wilder mathieu = new Wilder("Mathieu", false);
		System.out.println(aymeric.whoAmI());
		System.out.println(mathieu.whoAmI());
	}

}
