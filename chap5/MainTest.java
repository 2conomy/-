package chap5;

public class MainTest {
public static void main(String[] args) {

	System.out.println("입력변수의 갯수 = " + args.length);
	for(int i = 0; i < args.length; i++) {
		System.out.println("입력변수 = " + args[i]);
	}
	//외부 입력 데이터는 다양하기 때문에 처음에는 String으로 통일해서 받음 
	//String -> int
	//String은 기본타입이 아니라 형변환연산자 사용 불가능 
	//그래서 라이브러리로 바꿔야 한다 
	//Integer.parseInt("100") -> String데이터를 정수로 변경한 결과 
	System.out.println(args[0] + args[1]);
	int first = Integer.parseInt(args[0]);
	int second = Integer.parseInt(args[1]);
	System.out.println(first + second);
	
	double third = Double.parseDouble(args[2]);
	System.out.println(third + third);
	
}
}
