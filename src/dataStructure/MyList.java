package dataStructure;
import java.util.Arrays;

public class MyList<E> extends DataStructure {
	private static final int DEFAULT_CAPACITY = 10;

	public MyList() {	
		elements = new int[DEFAULT_CAPACITY];		
	}
	
	public MyList(int[] elements) {
		this.elements = Arrays.copyOf(elements, elements.length);
	}
	
	// Method to extend the size of the list
	private void extendCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
	
	// Insert method
	public void InsertElement(int e) {
		if (maxSize == elements.length) {
            extendCapacity();
        }
        elements[maxSize] = e;	
        maxSize ++;
	}
	
	// Remove method
	public int RemoveElement(int i) {
        int item = elements[i];
        int numElements = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElements ) ;
        maxSize--;
        return item;
	}
	
	// Get Size of list
    public int maxSize() {
        return maxSize;
    }
    
    // Method to check if the list is empty or not
    public Boolean isEmpty() {
        return (elements[0] == 0);
    }
    
    // Method get element at index i
    public int get(int i) {
        return elements[i];
    }
    
    // Method get index of seachValue
    public int search(int searchValue) {
        for (int i = 0; i < this.elements.length; i++){
           if(get(i) == searchValue){
               return i;
           }
        }
        return -1;
    }
    

}
