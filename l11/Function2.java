




public class Function1 extends Function {

	@Override
	public double fnValue(double x) {
		double aux = Math.pow(x, 2) - (8 * x) + 25;
		if (x < 0.0)
			return Double.NaN;
		else
			return (x/3) + 2 * Math.sqrt(aux);
	}

	public String toString() {
		return "(x/3) + 2 * sqrt(x^2 - (8 * x) + 25)";
	}
public String answerString(double optVal, double x, double y, double z){
	return "x = " + String.valueOf(x) + "; y =" + String.valueOf(y) + "; optVal = " + String.valueOf(optVal);
}
public double getXVal (double x){
	return x;
}

public double getYVal (double x){
	return 2000/(Math.PI * Math.pow(x,2));
}

public double getZVal (double x){
	return -1.0;
}

}
