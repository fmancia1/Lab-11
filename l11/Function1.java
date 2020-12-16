




public class Function1 extends Function {

	@Override
	public double fnValue(double x) {
		if (x==0.0)
			return Double.NaN;
		else
			return 0.8 * Math.PI * x^2 + (800/x);
	}

	public String toString() {
		return "0.8 * PI * x^2 + (800/x)";
	}

}
