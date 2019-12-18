package generics.immutable;

import java.util.ArrayList;

public class ComparablePairDriver {

	public static void main(String[] args) {

		Integer x = 4;
		Integer y = 1;
		
		System.out.println(x.compareTo(y));
		
		
		String s1 = "un";
		String s2 = "one";
		System.out.println(s2.compareTo(s1));
		
		ArrayList<ComparablePair<Integer, String>> alcp = new ArrayList<ComparablePair<Integer, String>>();
		alcp.add(new ComparablePair<Integer, String>(3, "trois"));
		alcp.add(new ComparablePair<Integer, String>(4, "quatre"));
		alcp.add(new ComparablePair<Integer, String>(1, "un"));
		alcp.add(new ComparablePair<Integer, String>(1, "one"));
		alcp.add(new ComparablePair<Integer, String>(1, "one"));

		ComparablePair<Integer, String> previousalcp = null;
		for (ComparablePair<Integer, String> p : alcp) {
			System.out.println(p);
			
			if (previousalcp != null)
				System.out.println(p.compareTo(previousalcp));
			
			
			previousalcp = new ComparablePair<Integer, String>(p);
		}
	}
}
