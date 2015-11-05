package com.yong.chen.java.stream.Closure;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.yong.chen.java.stream.Util;

public class ClosureInstanceVariable {

	public static int instancevariable = 5;

	public static void main(String[] args) {

		List<Integer> myList = IntStream.range(1, 11).boxed().collect(Collectors.toList());

		System.out.print("myList  -> ");
		Util.printlnList(myList);

		List<Integer> greaterThanFive = myList.stream().filter(x -> x > instancevariable).collect(Collectors.toList());

		instancevariable = 9;

		List<Integer> greaterThanNine = myList.stream().filter(x -> x > instancevariable).collect(Collectors.toList());

		System.out.print("greaterThanFive ->");
		Util.printlnList(greaterThanFive);

		System.out.print("greaterThanNine -> ");
		Util.printlnList(greaterThanNine);

	}

}
