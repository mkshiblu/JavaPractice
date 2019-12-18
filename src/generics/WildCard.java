package generics;

import java.util.List;

public class WildCard {

	/**
	 * The method copy() receives as parameters two lists, where the type of
	 * elements in the source List must be a subtype of type of elements in the
	 * destination List. Failure to impose such a restriction may allow to attempt
	 * to copy the elements of a list into a list of elements of an unrelated type,
	 * leading to an illegal type cast. It must do so because it uses get() and
	 * set(), which are bound to the type of values stored in the List.
	 */
	public static <T> void copy(List<? extends T> src, List<? super T> dest) {
		for (int i = 0; i < src.size(); i++) {
			dest.set(i, src.get(i));
		}
	}
}
