package sec05.ch06;

public class ArrayExam04 {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("프로그램 사용법 ");
			System.out.println("java ArrayExam04 숫자1 숫자2");
			System.exit(0);
		}
		
		String st1 = args[0];
		String st2 = args[1];
		
		int num1 = Integer.parseInt(st1);
		int num2 = Integer.parseInt(st2);
		int result = num1+num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}

}
