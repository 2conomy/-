package chap4;

public class Test2 {
public static void main(String[] args) {
	
	//학생 12
	
	int cntOfStu = 12;
	int cntOfBooks = 13;
	
	
	//지역{}변수 : {}사이에 선언된 변수는 {}안에서만 유용.
	//result를 먼저 선언하고 -> if문 안에서 result 값을 바꿔준 다음에 -> 구문이 완전히 끝난 후 result를 출력하면 해결!
	
	String result = "";
	if(cntOfBooks > cntOfStu) {
		int share = cntOfBooks / cntOfStu;
		int remain = cntOfBooks % cntOfStu;
		result =
			"1명의 학생당 " + share
			+ "권씩 가질 수 있습니다."
			+ " 남아있는 책은 " + remain + "권입니다.";
	}
	
	else {
		result = "나눠줄 수 없습니다.";
	}
	
	//result가 선언되지 않은 이유
	//if문 안에서 선언된 변수는 if가 끝나면 변수가 메모리에서 사라진다.
	//그렇기 때문에 if문 전에 변수를 선언한 후 if문 안에서 변수를 바꾸는 방법으
	
	System.out.println(result);
	}

}
