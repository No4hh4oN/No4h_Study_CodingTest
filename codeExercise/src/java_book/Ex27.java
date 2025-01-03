package java_book;

public class Ex27 {
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		
		myCar.setSpeed(-20);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(40);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}

class Car2 {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
