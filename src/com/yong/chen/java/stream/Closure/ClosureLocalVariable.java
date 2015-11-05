package com.yong.chen.java.stream.Closure;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.yong.chen.java.stream.Util;

public class ClosureLocalVariable {

	public static void main(String[] args) {
		List<Integer> myList = IntStream.range(1, 11).boxed()
	            .collect(Collectors.toList());
		
		System.out.print("myList  -> ");
		Util.printlnList(myList);
		
		MyWrapClass wrap = new MyWrapClass(5);

		List<Integer> greaterThanFive = myList.stream().filter(x -> x > wrap.getMyValue()).collect(Collectors.toList());

		wrap.setMyValue(9);

		List<Integer> greaterThanNine = myList.stream().filter(x -> x > wrap.getMyValue()).collect(Collectors.toList());

		
		System.out.print("greaterThanFive ->");
		Util.printlnList(greaterThanFive);

		System.out.print("greaterThanNine -> ");
		Util.printlnList(greaterThanNine);


	}

}
