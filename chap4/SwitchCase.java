package chap4;

public class SwitchCase {
public static void main(String[] args) {
	
	int day = 31; // day의 값은 28, 30으로 바뀔 수 있음
	// day 31이면 1,3,5,7,8,10,12월
	// day 30이면 4,6,9,11월 
	// day 28이면 2월 
	switch(day) {   						        //day를 알아볼거
	case 28:                                	    //혹시 day가 28이야?
		System.out.println("2월은 28일까지 있습니다.");  //그렇다면 이걸 출력해
		break;										//더이상 수행할게 없으면 break; 
		
		//첫번째 조건이 맞는데 break가 없으면 두번째 조건부터는 검사를 안하고 다 출력 
		
	case 30:  															//day가 30이면 
		System.out.println("4,6,9,11월은 " + day + "일까지 있습니다.");		//이걸 출력
		break;
	
	case 31:															//day가 31이면  
		System.out.println("1,3,5,7,8,10,12월은 " + day + "일까지 있습니다."); //이걸 출력
		break;
		
	default:
		System.out.println("해당 월은 존재하지 않습니다.");  //어떤 케이스에도 들어가지 않는다면 출력 
	}
	
}
}
