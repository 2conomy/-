package chap15;

import java.util.HashSet;
import java.util.Iterator;

public class LottoSetTest {
public static void main(String[] args) {

	//로또 번호 난수 추출 프로그램 (1-45 난수 6개) 
	//HashSet으로 
	
	HashSet<Integer> lotto = new HashSet<Integer>();
	
	while(true) {
		int ran = (int)(Math.random() * 45) + 1;
		//System.out.println((lotto.size() + 1) + ":" + ran);
		
		lotto.add(ran);
		if(lotto.size() == 6) break;
	}
	
	Iterator<Integer> iterator = lotto.iterator();
	while(iterator.hasNext()) { //set 내부 다음 데이터의 존재 여부를 판단 
		Integer element = iterator.next();
		System.out.println(element);
	}
	
	System.out.println("--------------------");
	for(Integer i : lotto) {
		System.out.println(i);
	}
	
	
	
}
}
