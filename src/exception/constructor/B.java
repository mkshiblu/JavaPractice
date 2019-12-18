package exception.constructor;

public class B {
	private D d = new D('B');
	
	B(char classToThrow) throws Exception {
		System.out.println("in Constructor B() with class to throw: "
				+ classToThrow);
		if (classToThrow == 'B')
			throw new Exception();
		stateB = "initialized";
	}

	String stateB = "NOT initialized";
}
