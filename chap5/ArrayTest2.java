package chap5;

public class ArrayTest2 {
public static void main(String[] args) {

	int scores[] = new int[5];
	
	//최대값과 최소값 구하기

	int sum = 0;
	int avg = 0;
	for(int i = 0; i < scores.length; i++) {
		scores[i] = (int)(Math.random() * 100) + 1;
		System.out.print(scores[i]+" ");	
	}
	
	int max = 0;
	for(int j = 0; j < scores.length; j++) {
		if(max < scores[j]) {
			max = scores[j];
		}
	}
	System.out.println("\n최대값 = " + max);
	
	int min = 101;
	for(int j = 0; j < scores.length; j++) {
		if(min > scores[j]) {
			min = scores[j];
		}
	}
	System.out.println("최소값 = " + min);
	
	//max변수 없이 최대값 구하기 (최대값이 배열의 첫번째 요소가 되도록)
	
	for(int i = 1; i < scores.length; i++) {
		if(scores[0] < scores[i]) {
			int temp = scores[0];
			scores[0] = scores[i];
			scores[i] = temp;
		}
	}
	System.out.println("scores[0] = " + scores[0]);
	
	for(int i = 1; i < scores.length; i++) {
		if(scores[0] > scores[i]) {
			int temp = scores[0];
			scores[0] = scores[i];
			scores[i] = temp;
		}
	}
	System.out.println("scores[0] = " + scores[0]);
	
	
}
}
