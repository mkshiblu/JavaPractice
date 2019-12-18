package generics;

/**
 * Represents 2 values
 * X and Y does not contain any upper bounds (not extending anything)
 */
public class Pair<X, Y> {

	private final X x;
	private final Y y;

	public Pair(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	public X getFirst() {
		return x;
	}

	public Y getSecond() {
		return y;
	}
}
