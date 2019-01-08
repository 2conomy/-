package chap6;
public class Students {

	String studName; //학생이름 
	String dept; //소속 
	String courseName; //과정명 
	int courseFee; //교육비 
	int tax; //부가금 
	double returnFee; //환급금 

	Students(String studName, String dept, String courseName, int courseFee, int tax) {
		this.studName = studName;
		this.dept= dept;
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.tax = tax;
	}
	
}
