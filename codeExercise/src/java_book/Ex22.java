package java_book;

public class Ex22 {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("model : " + dmbCellPhone.model);
		System.out.println("color : " + dmbCellPhone.color);
		System.out.println("channel : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("안녕하세요 홍길동입니다.");
		dmbCellPhone.sendVoice("네, 반갑습니다.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		System.out.println("model : " + dmbCellPhone.model);
		dmbCellPhone.powerOff();
	}
}

class CellPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("Power On");
	}
	
	void powerOff() {
		System.out.println("Power Off");
	}
	
	void bell() {
		System.out.println("Bell Ring");
	}
	
	void sendVoice(String msg) {
		System.out.println("Send Message : " + msg);
	}
	void receiveVoice(String msg) {
		System.out.println("Recieve Message : " + msg);
	}
	void hangUp() {
		System.out.println("Hang Up");
	}
}

class DmbCellPhone extends CellPhone {
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("channel " + channel + "번 DMB 방송 수신 시작");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("channel " + channel + "번으로 변경");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신 종료");
	}
}