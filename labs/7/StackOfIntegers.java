public class StackOfIntegers {
	//Data Fields
	private int[] elements;
	   private int size;
	   public StackOfIntegers() {
	    this(16);
	 }
	   public StackOfIntegers(int capacity) {
	    elements = new int[capacity];
	 }
	   public int push(int value) {
	    if (size >= elements.length) {
	     int[] temp = new int[elements.length * 2];
	     System.arraycopy(elements, 0, temp, 0, elements.length);
	     elements = temp;
	   }
	    return elements[size++] = value;
	 }
	   //pop
	   public int pop() {
	    return elements[--size];
	 }  
	 //peek
	   public int peek() {
	    return elements[size - 1];
	 }
	 //empty
	   public boolean empty() {
	    return size == 0;
	 }
	   //Get Size
	   public int getSize() {
	    return size;
	 }
	 }
