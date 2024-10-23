package DataStructures;

import java.util.ArrayList;

public class MyQueue {
	static ArrayList<Integer> queue = new ArrayList<Integer>();
	static int maxsize;
	
	public MyQueue() {
		// TODO Auto-generated constructor stub
	}
	public static void CreateRandom() {
		int n = (int)Math.floor(Math.random()*(8-3+1)+3);
		queue.clear();
    	for (int i = 0; i < n; i++) {
    		int j = (int)Math.floor(Math.random()*(99-0+1)+0);
    		queue.add(j);
    	}
	}
	public static void enqueue(int value) {
		queue.add(value);
	}
	public static void dequeue() {
		queue.remove(0);
	}
	
	public static ArrayList<Integer> getQueue() {
		return queue;
	}
	public static void setQueue(ArrayList<Integer> queue) {
		MyQueue.queue = queue;
	}
	public static int getSize() {
		return queue.size();
	}
	public static  boolean isFull() {
		if (queue.size() == maxsize) {
			return true;
		}
		return false;
	}
	public static  boolean isEmpty() {
		if (queue.size() == 0) {
			return true;
		}
		return false;
	}

}
