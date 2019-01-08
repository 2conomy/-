package chap15;

import java.util.ArrayList;

class SameSentence{
	
	String[] compare(ArrayList<String> list1, ArrayList<String> list2){
		
		ArrayList<String> resultList = new ArrayList<String>();
	
		if (list1.size() == list2.size()) {
			for(int i = 0; i < list1.size(); i++) {
				if(list1.get(i).equals(list2.get(i))) {
					resultList.add(list1.get(i));
				}
			}
		} else {
			if (list1.size() > list2.size()) {
				int j = list2.size();
				for (int k = 0; k < j; k++) {
					if(list1.get(k).equals(list2.get(k))) {
						resultList.add(list1.get(k));
					}
				}
			} else if (list1.size() < list2.size()) {
				int j = list1.size();
				for (int k = 0; k < j; k++) {
					if(list1.get(k).equals(list2.get(k))) {
						resultList.add(list1.get(k));
					}
				}
			}
		}
		String[] result = new String[0]; //resultList에 있는 결과를 넣기 위한 String 배열 생성 
		result = resultList.toArray(result); //result값에 null을 빼기 위해 메소드 toArray를 사용 -> resultList에 null값을 제외하고 추가 
		return result; //result : null 포함 
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
public class SameSentenceTest {
public static void main(String[] args) {
	
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("자바는 객체지향 언어입니다");
	list1.add("우리는 키트리에서 자바를 배우는 중입니다");
	list1.add("오늘은 컬렉션 프레임워크를 배우죠! ");
	list1.add("내일은 입출력과 네트워크를 배울 예정입니다 ");
	
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("자바는 객체지향 언어입니다");
	list2.add("우리는 kitri에서 자바를 배우는 중입니다");
	list2.add("오늘은 콜렉션 프레임워크를 배우죠! ");
	list2.add("내일은 입출력과 네트워크를 배울 예정입니다 ");
	
	ArrayList<String> list3 = new ArrayList<String>();
	list3.add("자바는 객체지향 언어입니다");
	list3.add("우리는 kitri에서 자바를 배우는 중입니다");
	list3.add("오늘은 콜렉션 프레임워크를 배우죠! ");

	SameSentence ss = new SameSentence();
	
	String[] result1 = ss.compare(list1, list2);
	String[] result2 = ss.compare(list1, list3);
	
	for(int i = 0; i < result1.length; i++) { 
		System.out.println(result1[i]);
	}
	for(int i = 0; i < result2.length; i++) {
		System.out.println(result2[i]);
	}
	
}
}