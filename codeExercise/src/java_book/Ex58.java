package java_book;

public class Ex58 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread =  new Thread(beepTask);
		thread.start();
		
		for(int i = 0; i< 5; i++) {
			System.out.println("똥");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

class BeepTask implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
