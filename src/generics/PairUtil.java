package generics;

public class PairUtil {

	/**
	 * This method defines A and B as a subset of Number class. Therefore in this
	 * method A and b has access to the doubleValue() provided by the Number class
	 * which is not available inside of Pair class' X and Y types
	 */
	public static <A extends Number, B extends Number> double add(Pair<A, B> pair) {
		return pair.getFirst().doubleValue() + pair.getSecond().doubleValue();
	}

	/**
	 * Swaps to first with second and returns a new Pair. In here pair is generic
	 * because there is no need for additional numeric methods. Notice the method
	 * has return type of Par<B,A> since after swapping the type of B will be type
	 * of A and vice versa. This is needed since in this method the types of A or B
	 * can be anything and different from each other.
	 */
	public static <A, B> Pair<B, A> swap(Pair<A, B> p) {
		A first = p.getFirst();
		B second = p.getSecond();
		return new Pair<>(second, first);
	}
}
