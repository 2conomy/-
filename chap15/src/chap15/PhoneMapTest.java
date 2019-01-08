package chap15;

import java.util.HashMap;
import java.util.Set;

public class PhoneMapTest {
public static void main(String[] args) {

	String[] p1 = {"010-2222-3333", "02-3429-6666", "031-222-9999", "kim@multi.com"};
	String[] p2 = {"010-6789-2345", "051-234-5678", "song@multi.com"};
	String[] p3 = {"010-5555-3333", "031-567-4321", "jun@multi.com"};
	
	HashMap<String, String[]> map = new HashMap<String, String[]>(); //map은 <키, 값>으로 구성. 값은 String[]으로 가능.
	map.put("김태리", p1);
	map.put("송혜교", p2);
	map.put("전지현", p3);
	map.put("이자바", p1);
	
	Set<String> keys = map.keySet(); //모든 키(이름) 얻기
	for(String k : keys) { //모든 이름 조회 
		String[] result = map.get(k);
		System.out.print(k + " - ");
		for (String s : result) { //각 이름당 키-전화번호목록 
			System.out.print(s + " - ");
		}
		System.out.println();
	}
	
}
}
