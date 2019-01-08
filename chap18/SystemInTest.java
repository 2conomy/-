package chap18;

import java.io.IOException;

public class SystemInTest {
public static void main(String[] args) {
	
	System.out.println("입력");
	try {
		int result = 0;
		//ctrl + z
		while( (result = System.in.read()) != -1)
		System.out.print((char)result);
	} catch(IOException e) {
		System.out.println(e.getMessage());
	}
		
	
		
		

}
}
