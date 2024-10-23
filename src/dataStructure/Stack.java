package dataStructure;
import java.util.*;
public class Stack extends DataStructure {
	private int top;
	
	//
	public Stack(int i) {
		maxSize = i;
		elements = new int[maxSize];
		top = -1;	
	}
	// Generate constructor
	public Stack(int maxSize, int[] stackArray, int top) {
		this.maxSize = maxSize;
		this.elements = stackArray;
		this.top = top;
	}
	
	// Method to push element into stack
	public void pushElementStack(int j) {
		elements[++top] = j;
	}
	
	// Method to remove top element in stack
	public int popElementStack() {
		elements[top] = 0;
		return elements[top--];
	}
	
	// Method return top element in stack
	public int peek() {
        return elements[top];
    }
	
	// Check if stack is empty or not
	public boolean isEmpty() {
		return (top == -1);
	}
	
	// Check if stack is full of elements or not
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	public int getTop() {
		return top;
	}

}
