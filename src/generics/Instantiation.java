package generics;

public class Instantiation {

	public static void main(String[] args) {
		// The type of x and Y are object
		Pair rawP = new Pair(10, 20);
		Integer x = (Integer) rawP.getFirst();

		System.out.println("Casted raw type : " + x);

		Pair rawReference = new Pair<Integer, String>(10, "Hello");
		x = (Integer) rawReference.getFirst();
		System.out.println("Casted raw type : " + x);

	}
}
