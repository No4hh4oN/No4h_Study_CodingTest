package java_book;

public class Ex29 {
	public static void main(String[] args) {
		Car3 car = new Car3();
		
		for(int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			
//			switch (problemLocation){
//			case 1: {
//				System.out.println("앞 왼쪽 HankookTire로 교체");
//				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
//				break;
//			}
//			case 2: {
//				System.out.println("앞 오른쪽 HankookTire로 교체");
//				car.frontRightTire = new HankookTire("앞오른쪽", 13);
//				break;
//			}
//			case 3: {
//				System.out.println("뒤 왼쪽 HankookTire로 교체");
//				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
//				break;
//			}
//			case 4: {
//				System.out.println("앞 왼쪽 HankookTire로 교체");
//				car.backRightTire = new HankookTire("뒤오른쪽", 17);
//				break;
//			}
//			}
//			
//			객체 배열로 만듦
			switch (problemLocation){
			case 1: {
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.tires[0]= new HankookTire("앞왼쪽", 15);
				break;
			}
			case 2: {
				System.out.println("앞 오른쪽 HankookTire로 교체");
				car.tires[1] = new HankookTire("앞오른쪽", 13);
				break;
			}
			case 3: {
				System.out.println("뒤 왼쪽 HankookTire로 교체");
				car.tires[2] = new HankookTire("뒤왼쪽", 14);
				break;
			}
			case 4: {
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.tires[3] = new HankookTire("뒤오른쪽", 17);
				break;
			}
			}

			System.out.println("--------------------------");
		}
	}
}

class Car3 {
//	Tire frontLeftTire = new Tire("앞왼쪽", 6);
//	Tire frontRightTire = new Tire("앞오른쪽", 2);
//	Tire backLeftTire = new Tire("뒤왼쪽", 3);
//	Tire backRightTire = new Tire("뒤오른쪽", 4);
//
//	객체 배열
	Tire[] tires = {
			new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른쪽", 4)
	};
	
	int run() {
		System.out.println("자동차가 달립니다.");
//		if(frontLeftTire.roll() == false) {
//			stop(); return 1;
//		}
//		
//		if(frontRightTire.roll() == false ) {
//			stop(); return 2;
//		}
//		if(backLeftTire.roll() == false) {
//			stop(); return 3;
//		}
//		
//		if(backRightTire.roll() == false) {
//			stop(); return 4;
//		}
//		객체 배열
		for(int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return(i+1);
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}

class Tire {
    public int maxRotation;          // 최대 회전수(타이어 수명)
    public int accumulatedRotation; // 누적 회전수
    public String location;          // 타이어의 위치

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " Tire 수명: " + 
                               (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " Tire ***");
            return false;
        }
    }
}

class HankookTire extends Tire {
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " HankookTire 수명: " + 
                               (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " HankookTire 핑크 ***");
            return false;
        }
    }
}

class KumhoTire extends Tire {
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " KumhoTire 수명: " + 
                               (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " KumhoTire 핑크 ***");
            return false;
        }
    }
}


