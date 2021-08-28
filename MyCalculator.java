package week3.Day2;

public class MyCalculator extends Calculator {

	public static void main(String[] args) {

	MyCalculator calObj = new MyCalculator();
	calObj.add(40, 50, 10);
	calObj.sub(10,7);
	calObj.mul(4.3d, 2.8d);
	calObj.divide(10.5f, 2.0f);
	}

}
