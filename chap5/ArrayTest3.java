package chap5;

public class ArrayTest3 {
public static void main(String[] args) {

	int scores[] = new int[5]; //한 번 만든 배열의 길이는 변경이 불가능 
	for(int i = 0; i < scores.length; i++) {
		scores[i] = (i+1)*10;
		System.out.print(scores[i] + " ");
	}
	System.out.println();
	//이전 배열 내용들은 삭제됨 -> 주소가 바뀌기 때문 -> 삭제가 되기 전에 복사를 해야 된
	int scores2[] = new int[10];		//5개를 추가해서 10개를 만드는 것이 아니라 새로운 곳에 10개를 만드는 것  
	
	System.arraycopy(scores, 0, scores2, 0, scores.length);
	//scores의 0번 인덱스부터 - scores2의 0번 인덱스부터 - 5개를 복사하겠다.
	
//	for(int i = 0; i < scores2.length; i++) {
//		System.out.print(scores2[i] + " ");
//	}
	
	//향상된 for문
	
	for(int score : scores2) {
		System.out.print(score + " ");
	}
}
}
