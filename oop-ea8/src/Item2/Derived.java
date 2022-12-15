package Item2;

public class Derived implements Interface1, Interface2, Interface3{
	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	@Override
	public int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	@Override
	public int diff(int a, int b) {
		return a - b;
	}

	@Override
	public int product(int a, int b) {
		return a*b;
	}

	@Override
	public int quotient(int a, int b) {
		return a/b;
	}

	@Override
	public int SquareCube(int a) {
		if (a > 0) {
			return a*a;
		} else {
			return a^3;
		}
	}

}
