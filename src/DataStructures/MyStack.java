package DataStructures;

import java.util.ArrayList;

public class MyStack {
	static ArrayList<Integer> stack = new ArrayList<Integer>();
	static int maxsize;
	
	public MyStack() {
		// TODO Auto-generated constructor stub
	}
	public static void CreateRandom() {
		int n = (int)Math.floor(Math.random()*(8-3+1)+3);
		stack.clear();
    	for (int i = 0; i < n; i++) {
    		int j = (int)Math.floor(Math.random()*(99-0+1)+0);
    		stack.add(j);
    	}
	}
	public static void push(int value) {
		stack.add(value);
	}
	public static void pop() {
		stack.remove(stack.size());
	}
	
	public static ArrayList<Integer> getStack() {
		return stack;
	}
	public static void setStack(ArrayList<Integer> stack) {
		MyStack.stack = stack;
	}
	public static int getSize() {
		return stack.size();
	}
	public static  boolean isFull() {
		if (stack.size() == maxsize) {
			return true;
		}
		return false;
	}
	public static  boolean isEmpty() {
		if (stack.size() == 0) {
			return true;
		}
		return false;
	}
}
