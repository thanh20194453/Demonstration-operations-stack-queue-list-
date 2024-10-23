package dataStructure;
import java.util.Arrays;

public class Queue extends DataStructure {
	private int front; // Point to first element in queue
	private int rear;  // Point to last element in queue
	private int size;  // Current size of the queue
	
	
	// Constructor to initialize a queue
	public Queue(int i) {
		// TODO Auto-generated constructor stub
		maxSize = i;
		elements = new int[maxSize];
		front = 0;
		rear = -1;
		size = 0;
	}
	
	public Queue(int maxSize, int front, int rear, int size, int[] elements ) {
		// TODO Auto-generated constructor stub
		this.maxSize = maxSize;
		this.front = front;
		this.rear = rear;
		this.size = size;
		this.elements = Arrays.copyOf(elements, elements.length);
	}
	
	// Method to dequeue the front element in Queue
	public void DequeueElement() {
		this.elements[front] = 0;
		int tmp = elements[0];
		for (int i = 0; i < elements.length - 1; i++) {
			elements[i] = elements[i+1];			
		}
		elements[elements.length - 1] = tmp;
		front = 0;
		rear = rear - 1;
		size--;
	}
	
	// Method to add element to the queue
	public void EnqueueElement(int e) {
		rear = (rear + 1); 
		elements[rear] = e;
		size++;
	}
	
    // Method to check if the queue is empty or not
    public Boolean isEmpty() {
        return (getSize() == 0);
    }

    // Method to check if the queue is full or not
    public Boolean isFull() {
        return (getSize() == maxSize);
    }
	
	public int peek() {
		return elements[front];
	}
	
	public int getFront() {
		return front;
	}

	public int getRear() {
		return rear;
	}

	public int getSize() {
		return size;
	}

}
