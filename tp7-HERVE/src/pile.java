
public class pile<T> {
	private T data = null;
	private pile<T> next;

	public pile() {
		data = null;
		next = null;
	}

	private pile(T data, pile<T> next) {
		this.data = data;
		this.next = next;
	}

	public void push(T data) {
		pile newpile = new pile(data, this.next);
		next = newpile;
	}

	public T peek() {
	    if (next == null) {
	    	return null;
	    } else {
	    	return next.data;
	    }
	}

	public T pop() {
		if (next == null) {
			return null;
		}
		T toBeReturned = next.data;
		this.next = next.next;
		return toBeReturned;
	}

	public int countRecursive() {
		if (next == null) {
			return 0;
		} else {
			return 1+ next.countRecursive();
		}
	} 

	public static void main(String[] args) {
	pile<Integer> myPile = new pile<Integer>();
	
	myPile.push(5);
	myPile.push(7);
	System.out.println("countRecursive= " + myPile.countRecursive());
		

	}

}
