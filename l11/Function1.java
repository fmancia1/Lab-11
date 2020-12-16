




public class Function1 extends Function {

	@Override
	public double fnValue(double x) {
		if (x==0.0)
			return Double.NaN;
		else
			return 0.8 * Math.PI * Math.pow(x, 2) + (800/x);
	}

	public String toString() {
		return "0.8 * PI * x^2 + (800/x)";
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
