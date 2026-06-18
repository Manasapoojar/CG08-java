package com.tnsif.lambdaexpression;

@FunctionalInterface
interface Addition{
	int sum(int a, int b);
}

public class Add {
	public static void main(String[] args) {
		Addition a = (x,y)-> x+y;
		System.out.println(a.sum(10, 20));
	}

}
