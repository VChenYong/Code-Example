package com.yong.chen.java.stream.functional_interface;

public class LambdaInstance {

	public static MyFunctionalInterface createLambda() {
		return () -> {
			System.out.println("default");
		};
	}

	public static MyFunctionalInterface createStatefullLambda(String input) {
		return () -> {
			System.out.println("input = " + input);
		};
	}

	public static void main(String[] args) {
		MyFunctionalInterface funtionOne = LambdaInstance.createLambda();
		MyFunctionalInterface functionTwo = LambdaInstance.createStatefullLambda("statefull");

		System.out.println("\n");
		funtionOne.myFunctionApply();
		funtionOne.description();
		functionTwo.myFunctionApply();
		functionTwo.description();
		System.out.println("");
	}

}
