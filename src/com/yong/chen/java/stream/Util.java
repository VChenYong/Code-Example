package com.yong.chen.java.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Util {

	public static <T> void printlnList(List<T> myList) {
		System.out.print(myList.stream().map(num -> num.toString()).collect(Collectors.joining(",", "[", "]")));
		System.out.println();
	}

}
