package dataStructure;
import java.util.Arrays;
public abstract class DataStructure {
	protected int maxSize;
	protected int[] elements;

	public DataStructure() {
		// TODO Auto-generated constructor stub
	}
	
	public void sort() {
		Arrays.sort(getElements());
	}
	
	public int[] getElements() {
		return elements;
	}
	
	public int size() {
		return elements.length;	
	}
	
	public int maxSize() {
		return maxSize;
	}

}



