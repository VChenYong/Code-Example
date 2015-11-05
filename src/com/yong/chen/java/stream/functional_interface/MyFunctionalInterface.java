package com.yong.chen.java.stream.functional_interface;

//An interface is considered a functional interface if it contains one and only one abstract method with no default implementation

//
//No assertion is made about the possibility for this interface to declare static fields or many defenders methods. It means that a functional interface can
//
//1.1have one abstract method and many defenders methods and static fields
//2. have one abstract method and inherit defenders from parent interfaces and static fields
public interface MyFunctionalInterface {
	String staticVar = "static var in SAM";

	void myFunctionApply();

	default void description() {
		System.out.println("I am " + this + "with " + staticVar);
	}
}