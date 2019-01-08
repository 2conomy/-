package chap18;

import java.util.Scanner;

class BoardVO{
	int seq; 
	String title;
	String contents;
	int viewcount;
	BoardVO(int seq, String title, String contents, int viewcount) {
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.viewcount = viewcount;
	}
	public String toString() {
		return "번호=" + seq + " 제목=" + title
				+ " 내용=" + contents + " 조회수=" + viewcount;
	}
}
class BoardDAO {
	//출력 : 번호=1 제목=게시물저장 내용=1개의 게시물을 저장합니다 조회수=0 (toString 메소드 사용)
	public void insertBoard(BoardVO vo) {
		System.out.println(vo + "===> 게시물 저장을 완료했습니다.");
	}
}
public class BoardTest {
public static void main(String[] args) {
	//1.게시물저장
	//2.게시물수정
	//3.게시물조회 
	System.out.println("게시물 정보를 입력하세요.");
	
	//Scanner 생성
	//한줄 내용 입력
	//split 메소드 사용 -> 번호:제목:내용:조회수
	//입력받은 내용을 BoardVO 객체로 생성 
	//BoardDAO 객체를 생성
	//inserBoard 메소드 호출(BoardVO 객체)
	
	Scanner sc = new Scanner(System.in);
	String word = sc.nextLine();
	System.out.println(word);
	String seq1 = word.split(":")[0];
	String title1 = word.split(":")[1];
	String contents1 = word.split(":")[2];
	String viewcount1 = word.split(":")[3];
	int seq2 = Integer.parseInt(seq1);
	int viewcount2 = Integer.parseInt(viewcount1);
	
	BoardVO aa = new BoardVO(seq2, title1, contents1, viewcount2);
	BoardDAO bb = new BoardDAO();
	bb.insertBoard(aa);
}
}

//1:게시물저장:1개의 게시물을 저장합니다:0
