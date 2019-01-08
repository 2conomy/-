package chap5;

public class SortTest {
public static void main(String[] args) {

	// 명령라인 정수 입력, 개수 5~10개
	// 입력된 정수 데이터를 배열에 저장 -> 결과 출력 
	// 배열을 오름차순 정렬 -> 결과 출력 
	
	int args1[] = new int[10];
	System.out.print("정렬 전 = ");
	for(int i = 0; i < args.length; i++ ) {
		args1[i] = Integer.parseInt(args[i]);
		System.out.print(args1[i] + " ");
	}
	System.out.println();
	
	System.out.print("정렬 후 = ");
	for(int i = 0; i < args1.length; i++) {
		for(int j = 1; j < args1.length; j++) {
			if(args1[j-1] > args1[j]) {
				int temp = args1[j-1];
				args1[j-1] = args1[j];
				args1[j] = temp;
			}
		}
		System.out.print(args1[i] + " ");
	}
	
}
}
