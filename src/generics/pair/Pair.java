package generics.pair;

public class Pair<T extends Number> {

	public void print(T num) {
		System.out.println(num);
	}

	/**
	 * U is not parameterized in the class before so had to be declared before the
	 * method signature. T is already declared so no need to declare it again
	 */
	public <U extends Number> void add(T x, U y) {
		System.out.println(x.doubleValue() + y.doubleValue());
	}

	public static void main(String[] args) {
		Pair<Integer> pair = new Pair<>();
		pair.print(10);
		pair.add(10, 20);
	}
}
