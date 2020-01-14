package aplineproject;

public class APLine {
	int a, b, c;
	public APLine(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getXIntercept() {
		return ((float)-c)/a;
	}
	
	public double getYIntercept() {
		return ((float)-c)/b;
	}
}
