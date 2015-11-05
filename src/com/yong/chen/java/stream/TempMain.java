package com.yong.chen.java.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TempMain {
	static int index = 0;
	static int initial = 100;

	public static void main(String[] args) {

//		This restriction is relaxed a bit in Java 8. It’s possible to refer to variables that aren’t
//		final ; however, they still have to be effectively final .
		
		
//		A variable or parameter whose value is never changed after it is initialized is effectively final.
		List<Integer> test001 = Arrays.asList(1, 1, 1, 1, 1).stream().map(x -> getEffectiveFianl(x))
				.collect(Collectors.toList());

		test001.forEach(System.out::println);

	

	}

	public static int getEffectiveFianl(int value) {
		index = index + 1;
		return initial * index + value;
	}
}
