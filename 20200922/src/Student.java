
public class Student {

	String name;
	int kor;
	int eng;
	int mat;
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMat(int mat) {
		this.mat =mat;
	}
	
	public int getTotal() {
		return kor + eng + mat ;
	}
    
	public double getAverage() {
		return (double)getTotal()/3;
	}
}
