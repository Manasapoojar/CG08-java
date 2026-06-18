package com.tnsif.lambdaexpression;

@FunctionalInterface
interface Subtraction{
	int sub(int a, int b);
}

public class MainSub {
	public static void main(String[] args) {
		Subtraction s = (x,y) -> x-y;
		System.out.println(s.sub(80,20));
	}

}
