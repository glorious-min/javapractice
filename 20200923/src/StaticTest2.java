
public  class StaticTest2 {
	
	int i = 10;
	
	public static  int go() {
		int i = 1;
		//System.out.println(this.i);
		System.out.println(i);
		return i;
	}
	
	public static int goStatic() {
		int j =2;
		int m =3;
		
		System.out.println(j);
		System.out.println(m);
		return j;
		return m; //(unreachable code) �޼ҵ�� ������ �ϳ����� ������ , 
		// return�� �޼ҵ带 �����ϴ� ����� �켱�̱� ������ ������ ���� �ڵ带 ���� �Ұ����ϴ� 
		// ���ڵ�� 1232���� ����ϰ� ������ ?? 
	}
	
	public static void main (String[] args) {
		StaticTest2 st = new StaticTest2();
		st.go();
		
		//main�޼ҵ忡�� �ٷ� ���� ���� 
		System.out.println(goStatic());
		
		//main �޼ҵ忡�� �ٷ� ���� �Ұ��� 
		System.out.println(go());
		
		//static���� this��� �Ұ��� 
		//System.out.println(this.i);
		
	}
}

