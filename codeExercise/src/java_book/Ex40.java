package java_book;


public class Ex40 {
	public static void main(String[] args) {
		Car5 car = new Car5(100);
		Class<? extends Car5> clazz = car.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}
}

class Car5 {
	int speed = 0;
	
	public Car5(int speed) {
		this.speed = speed;
	}
}
