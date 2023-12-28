package br.com.ivirson.math;

import br.com.ivirson.exceptions.UnsupportedMathOperationException;

public class MathUtils {
	
	public static Double sum(String a, String b) {
		if (!Utils.isNumeric(a) || !Utils.isNumeric(b)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return Utils.convertToDouble(a) + Utils.convertToDouble(b);
	}
	
	public static Double subtraction(String a, String b) {
		if (!Utils.isNumeric(a) || !Utils.isNumeric(b)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return Utils.convertToDouble(a) - Utils.convertToDouble(b);
	}
	
	public static Double multiplication(String a, String b) {
		if (!Utils.isNumeric(a) || !Utils.isNumeric(b)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return Utils.convertToDouble(a) * Utils.convertToDouble(b);
	}
	
	public static Double division(String a, String b) {
		if (!Utils.isNumeric(a) || !Utils.isNumeric(b)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return Utils.convertToDouble(a) / Utils.convertToDouble(b);
	}
	
	public static Double average(String a, String b) {
		if (!Utils.isNumeric(a) || !Utils.isNumeric(b)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return (Utils.convertToDouble(a) + Utils.convertToDouble(b)) / 2;
	}
	
	public static Double squareRoot(String a) {
		if (!Utils.isNumeric(a)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return Math.sqrt(Utils.convertToDouble(a));
	}

}
