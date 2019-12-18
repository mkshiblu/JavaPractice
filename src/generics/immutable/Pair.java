package generics.immutable;
/**
 *  Immutable generic pair class
 */

public class Pair<TypeOfFirst, TypeOfSecond> {
	private final TypeOfFirst first;
	private final TypeOfSecond second;

	public Pair(TypeOfFirst first, TypeOfSecond second) {
		this.first = first;
		this.second = second;
	}

	public Pair(Pair<TypeOfFirst, TypeOfSecond> newPair) {
		this.first = newPair.getFirst();
		this.second = newPair.getSecond();
	}

	public TypeOfFirst getFirst() {
		return this.first;
	}

	public TypeOfSecond getSecond() {
		return this.second;
	}

	public String toString() {
		return first.getClass().getName() + ":" + first.toString() + " , "
				+ second.getClass().getName() + ":" + second.toString();
	}
}
