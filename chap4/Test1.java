package chap4;

public class Test1 {
public static void main(String[] args) {

	//1~10 사이 난수 발생 
	//난수 개수에 따라 *모양
	
	int total = (int)(Math.random() * 10) + 1;
	for(int j = 1; j <= total; j++) {
		for(int k = 1; k <= j; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	

}
}
