package java_book;

public class Ex33 {
	public static void main(String[] args) {
		Key key1 = new Key(3);
		Key key2 = new Key(5);
		Key key3 = key1;
				
		System.out.println("k1.hashCode : " + key1.hashCode());
		System.out.println("k2.hashCode : " + key2.hashCode());
		System.out.println("k3.hashCode : " + key3.hashCode());
	}
}

class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
}