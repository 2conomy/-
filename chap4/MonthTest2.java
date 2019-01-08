package chap4;

public class MonthTest2 {
public static void main(String[] args) {

	int month = (int)(Math.random() * 12) + 1; //1부터 12까지 랜덤 출력 
	// 1 3 5 7 8 10 12 중 하나이면 "31일까지 존재합니다." 
	// 4 6 9 11 중 하나이면 "30일까지 존재합니다."
	// 2면 "28일까지 존재합니다." 
	
	// case 뒤에는 무조건 숫자만 
	// case 1이면 쭈욱 내려가서 case 12의 조건문과 만나고 break;
	switch(month) {
	case 1 :
	case 3 :
	case 5 :
	case 7 :
	case 8 :
	case 10 :
	case 12 :
		System.out.println(month + "월은 31일까지 존재합니다.");
		break;
		
	case 4 :
	case 6 :
	case 9 :
	case 11 :
		System.out.println("30일까지 존재합니다.");
		break;
		
	//case 2말고 default를 써도 된다.
	default :
		System.out.println("28일까지 존재합니다.");
	//마지막에는 break;를 안써도 된다.
	}
	
	
}
}
