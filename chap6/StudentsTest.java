package chap6;

public class StudentsTest {
public static void main(String[] args) {

	int args3 = Integer.parseInt(args[3]);
	int args4 = Integer.parseInt(args[4]);
	
	//a.toUpperCase() : a의 모든 영문자를 대문자로 바꾸기 
	Students stu = new Students(args[0], args[1], args[2].toUpperCase(), args3, args4);
	
//	switch(stu.courseName) {
//		case "자바프로그래밍":
//			stu.returnFee = (double)(args3 * 0.25) + (double)args4;
//			System.out.println("이름=" + stu.studName);
//			System.out.println("소속=" + stu.dept);
//			System.out.println("과목명=" + stu.courseName);
//			System.out.println("교육비=" + stu.courseFee + "원");
//			System.out.println("부가금=" + stu.tax + "원");
//			System.out.println("환급금=" + (int)stu.returnFee + "원");
//			break;
//		case "JDBC프로그래밍":
//			stu.returnFee = (double)(args3 * 0.2) + (double)args4;
//			System.out.println("이름=" + stu.studName);
//			System.out.println("소속=" + stu.dept);
//			System.out.println("과목명=" + stu.courseName);
//			System.out.println("교육비=" + stu.courseFee + "원");
//			System.out.println("부가금=" + stu.tax + "원");
//			System.out.println("환급금=" + (int)stu.returnFee + "원");
//			break;
//		case "JSP프로그래밍":
//			stu.returnFee = (double)(args3 * 0.15) + (double)args4;
//			System.out.println("이름=" + stu.studName);
//			System.out.println("소속=" + stu.dept);
//			System.out.println("과목명=" + stu.courseName);
//			System.out.println("교육비=" + stu.courseFee + "원");
//			System.out.println("부가금=" + stu.tax + "원");
//			System.out.println("환급금=" + (int)stu.returnFee + "원");
//			break;
//		default:
//			System.out.println("잘못 입력되었습니다.");
//	}
	
	String a = "자바프로그래밍";
	String b = "JDBC프로그래밍";
	String c = "JSP프로그래밍";
	
	if (stu.courseName.equals(a)) {		//s1 == s2 : 주소값이 같은가를 비교 
		stu.returnFee = (double)(args3 * 0.25) + (double)args4;
	} else if (stu.courseName.equalsIgnoreCase(b)) {
		stu.returnFee = (double)(args3 * 0.2) + (double)args4;
	} else if (stu.courseName.equalsIgnoreCase(c)) {
		stu.returnFee = (double)(args3 * 0.15) + (double)args4;
	} else {
		System.out.println("잘못 입력되었습니다.");
		return; //메소드를 중단하라.
	}
	System.out.println("이름=" + stu.studName);
	System.out.println("소속=" + stu.dept);
	System.out.println("과목명=" + stu.courseName);
	System.out.println("교육비=" + stu.courseFee);
	System.out.println("부가금=" + stu.tax);
	System.out.println("환급금=" + stu.returnFee);
	
		
}
}
