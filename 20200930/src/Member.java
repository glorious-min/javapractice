
public class Member {
	String name;
	int age;
	String address;
	
	public Member(String name, int age,String address) {
		this.name =name;//this�� ������ ������ ���� ������� �ʾƼ� ���� �⺻������ ��µȴ� 
	    this.age = age;
		this.address = address;
	}
	
	public String toString() {
		return ("�̸�:"+name+"����:"+age+"�ּ�:"+address);
	}	
}
