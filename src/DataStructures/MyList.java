package DataStructures;

import java.util.ArrayList;

public class MyList {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static int maxsize;
	
	public MyList() {
		// TODO Auto-generated constructor stub
	}
	public static void CreateRandom() {
		int n = (int)Math.floor(Math.random()*(8-3+1)+3);
		list.clear();
    	for (int i = 0; i < n; i++) {
    		int j = (int)Math.floor(Math.random()*(99-0+1)+0);
    		list.add(j);
    	}
	}
	public static void insert(int index, int value) {
		list.add(index,value);
	}
	public static void remove(int index) {
		list.remove(index);
	}
	
	public static ArrayList<Integer> getList() {
		return list;
	}
	public static void setList(ArrayList<Integer> list) {
		MyList.list = list;
	}
	public static int getSize() {
		return list.size();
	}
	public static void reset() {
		list = new ArrayList<Integer>();
	}
	public static  boolean isFull() {
		if (list.size() == maxsize) {
			return true;
		}
		return false;
	}
	public static  boolean isEmpty() {
		if (list.size() == 0) {
			return true;
		}
		return false;
	}
}
