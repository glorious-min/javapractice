import java.util.Scanner;

public class Student {
	
	String name ;
	int kor;
	int eng;
	int mat;
  
	Scanner sc = new Scanner(System.in);
	public String setName(String name) {
	name = sc.nextLine();
	return name;
	}
	
	public String getName() {
	return name;
	}
	
	public int setKor(int kor) {
		return kor;
	}
	
	public int setEng(int eng) {
		return eng;
		
	}
	
	public int setMat(int kor) {
		return mat;
	}
	
	public int getTotal() {
		return  kor+ eng + mat;
	}
	
	public double getAverage() {
		return (kor + eng+ mat)/3;
	}
	
}
