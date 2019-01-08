package chap4;

public class AlphaConversion {
public static void main(String[] args) {
	
//	while(true) {
//		1. 난수 발생시(1-200범위)
//		2. 65-90사이면 (대문자이면) 'A'를 'a'로 변경합니다 출력 +32 
//		3. 97-122사이면 (소문자이면) 'a'를 'A'로 변경합니다 출력 -32
//		4. 1-50 이거나 150-200 사이면 종
//	}
		
	
	while(true) {
		int number = (int)(Math.random() * 200) + 1;
		System.out.println(number);
		if(number >= 65 && number <= 90) {
			System.out.println("'" + (char)number + "'를 " + "'" + (char)(number + 32) + "'로 변경합니다");
		} else if(number >= 97 && number <= 122) {
				System.out.println("'" + (char)number + "'를 " + "'" + (char)(number - 32) + "'로 변경합니다");
		} else if(number <= 50 || number >=150) {
			break;
		}
	}

}
}
