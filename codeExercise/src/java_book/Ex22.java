package java_book;

public class Ex22 {
	public static void main(String[] args) {
//		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
//		
//		System.out.println("model : " + dmbCellPhone.model);
//		System.out.println("color : " + dmbCellPhone.color);
//		System.out.println("channel : " + dmbCellPhone.channel);
//		
//		dmbCellPhone.powerOn();
//		dmbCellPhone.bell();
//		dmbCellPhone.sendVoice("여보세요?");
//		dmbCellPhone.receiveVoice("안녕하세요 홍길동입니다.");
//		dmbCellPhone.sendVoice("네, 반갑습니다.");
//		dmbCellPhone.hangUp();
//		
//		dmbCellPhone.turnOnDmb();
//		dmbCellPhone.changeChannelDmb(12);
//		System.out.println("model : " + dmbCellPhone.model);
//		dmbCellPhone.powerOff();
		
		S24 s24 = new S24("갤럭시S24", "마블 그레이");
		s24.powerOn();
		s24.bell();
		System.out.println("model : " + s24.model);
		System.out.println("color : " + s24.color);
		s24.sendVoice("여보세요?");
		s24.receiveVoice("안녕하세요 홍길동입니다.");
		s24.sendVoice("네, 반갑습니다.");
		s24.sendText("S24입니다.");
		s24.powerOff();
		
		System.out.println("");
		
		S24Ultra s24Ultra = new S24Ultra("갤럭시S24Ultra", "오닉스 블랙");
		s24Ultra.powerOn();
		s24Ultra.bell();
		System.out.println("model : " + s24Ultra.model);
		System.out.println("color : " + s24Ultra.color);
		s24Ultra.sendVoice("여보세요?");
		s24Ultra.receiveVoice("안녕하세요 홍길동입니다.");
		s24Ultra.sendVoice("네, 반갑습니다.");
		s24Ultra.drawing();
		s24Ultra.powerOff();
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

class S24 extends CellPhone {
	public S24(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void sendText(String msg) {
		System.out.println(msg + ", 해당 텍스트를 전송합니다.");
	}
}

class S24Ultra extends CellPhone {
	public S24Ultra(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void drawing() {
		System.out.println("그림 그리기 기능을 실행합니다.");
	}
}

//class DmbCellPhone extends CellPhone {
//	int channel;
//	
//	public DmbCellPhone(String model, String color, int channel) {
//		this.model = model;
//		this.color = color;
//		this.channel = channel;
//	}
//	
//	void turnOnDmb() {
//		System.out.println("channel " + channel + "번 DMB 방송 수신 시작");
//	}
//	void changeChannelDmb(int channel) {
//		this.channel = channel;
//		System.out.println("channel " + channel + "번으로 변경");
//	}
//	void turnOffDmb() {
//		System.out.println("DMB 방송 수신 종료");
//	}
//}