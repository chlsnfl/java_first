package sec05.chapter05;

public class StringEqualsExam {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2가 참조하는 주소는 같다");
		}else {
			System.out.println("strVar1과 strVar2가 참조하는 주소는 다르다");
		}

		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4가 참조하는 주소는 같다");
		}else {
			System.out.println("strVar3과 strVar4가 참조하는 주소는 다르다");
		}
		//문자열의 내용 연산은 equals를 이용한다
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4가 참조하는 주소는 같다");
		}
	}
	

}
