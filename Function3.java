




public class Function3 extends Function {

	@Override
	public double fnValue(double x) {
		double aux = Math.pow(x, 4) - Math.pow(x, 2) + 1;
		if (x < 0.0)
			return Double.NaN;
		else
			return Math.sqrt(aux);
	}

	public String toString() {
		return "sqrt(x^4 - x^2 + 1)";
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
