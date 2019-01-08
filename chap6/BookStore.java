package chap6;

class Book {
	
	private String title;
	private int price;
	
	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	Book() {
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

class BookMgr {
	
/*	BookMgr 클래스의 제약조건 
	1. 책(Book) 객체 여러 개를 저장할 수 있는 
	책 목록(booklist)이라는 배열을 필드변수로 가져야 한다. 
	2. 책 목록(booklist)이라는 배열 변수를 
	초기화하는 생성자를 작성해야 한다. 
	3. 책 목록을 화면에 출력하는 printBookList() 
	메서드가 있어야 한다. 
	4. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. */
	
	Book booklist[]; //Book이라는 참조타입을 가진 booklist[] 배열타입 
	
	public BookMgr(Book booklist[]) {
		this.booklist = booklist;
	}
	
	public void printBookList() {
		for(int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	
	int sum = 0;
	public void printTotalPrice() {
		for(int j = 0; j < booklist.length; j++) {
			sum += booklist[j].getPrice();
		}
		System.out.println(sum);
	}
	
}

public class BookStore {
	public static void main(String[] args) {
		
		Book booklist[] = new Book[5];

		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		
		BookMgr mgr = new BookMgr(booklist);
		System.out.println("=== 책 목록 ===");
		mgr.printBookList();
		System.out.println("");
		System.out.println("=== 책 가격의 총합 ===");
		mgr.printTotalPrice();
		

		
	}
}



/*
[실행결과]
=== 책 목록 ===
Java Program
JSP Program
SQL Fundamentals
JDBC Program
EJB Program

=== 책 가격의 총합 ===
전체 책 가격의 합 : 132000*/