package chap5;

public class EqualTest {
public static void main(String[] args) {

	int i = 10;
	int j = 10;
	double d= 10.0;
	String s1 = "java";
	String s2 = "java";
	//참조타입 변수 : "new" 키워드를 사용해 데이터를 저장
	//String : new 사용 or new 없이 둘 다 가능 
	String s3 = new String("java");
	String s4 = new String("java");
	String s5 = new String("JAVA");
	
	System.out.println(i == j);//기본타입끼리만 형변환 가능 
	System.out.println(i == d);
	System.out.println(s1 == s2);//true
	System.out.println(s3 == s4);//false '==' 연산자는 stack 영역의 값을 비교. s3의 stack값과 s4의 stack값이 다르기 때문에 false이다(heap값은 같지만)
	//
	System.out.println(s3.equals(s4));//true
	System.out.println(s1.equals(s3));//true
	System.out.println(s3.equals(s5));//false
	System.out.println(s3.equalsIgnoreCase(s5));//true
	System.out.println(!s1.equals(s3));//false 맨 앞에 !를 붙이면 not
	
	String s = null;//문자열이 없다 
	System.out.println(s.equals(1));//NullPointerException 오류 발생 
	
	
}
}
