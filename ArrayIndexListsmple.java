class ArrayIndexListsmple {
   int [] A;	      // array storing the elements of the indexed list
   int capacity = 5;  // initial length of array A
   int size = 0;

	public ArrayIndexListsmple() {
    A =  new int[capacity]; // the compiler may warn, but this is OK
  }


   public int size() {
       return size;
     }
     /** Returns whether the indexed list is empty. */
     public boolean isEmpty() {
       return size() == 0;
  }
  protected void checkIndex (int r, int n){
    if (r<0|| r>= n)
    System.out.print ("Illegal index:" + r);
  }
    /** Returns the element stored at the given index. */
  public int get(int r)
   {
  	checkIndex(r, size());
  	return A[r];
  }
  /** Replaces the element stored at the given Index**/
  public int set(int r, int e)
    {
  	checkIndex(r, size());
  	int temp= A[r];
  	A[r]=e;
  	return temp;
  }

    /** Inserts an element at the given index. */
    public void add(int r, int e)
      {
      checkIndex(r, size() + 1);
      if (size == capacity) {		// an overflow
        capacity *= 2;
        int[]B=new int[capacity];
        for (int i=0; i<size; i++)
    	B[i] = A[i];
      }
      for (int i=size-1; i>=r; i--)	// shift elements up
        A[i+1] = A[i];
      A[r] = e;
      size++;
    }
    /** Removes the element stored at the given index. */
    public int remove(int r)
      {
      checkIndex(r, size());
      int temp = A[r];
      for (int i=r; i<size-1; i++)	// shift elements down
        A[i] = A[i+1];
      size--;
      return temp;
    }

public static void main(String[] args) {
		ArrayIndexListsmple L= new ArrayIndexListsmple();
		








			//L.add( 0,55);
			System.out.println("----------------------");

		for (int a = 0; a < 5; a++) {
		            System.out.println(" befor any Operation ["+ a +"]=" +L.get(a));
        }
        System.out.println("befor remove index (3)=" + L.get(3));
		



ut.println("After remove and set operations ["+ a +"]=" +L.get(a));
        }

	}

}