
public class Cal {

	//1. ���ϱ� 
	public int plus(int num1 , int num2) { //���ϰ���
	
	int result = num1+num2;
	return result;
	}
	
	public int minus(int num1 , int num2 ) { // ���⿡�� ���� �ް� 
		
		int result = num1 -num2; // �Ű��������� ���ϱ�  // ���⿡�� ó���ϰ� 
		return result; //���⿡�� ��ȯ�Ѵ� 
		//return = num1 -num2 �ε� �ٲܼ� �ִ� ! �޼ҵ� ȣ���Ѱ����� ���� 
		// ����Ʈ ���� �����͸� minus(�޼ҵ带 �θ�������) �κ����� 
		
	}
	
	public int multiple (int num1 , int num2) {
		int result = num1*num2;
		return result;// ��Ʈ�ڷ����� ������ �ݵ�� �ؾ��Ѵ� 
	}
	
	
	
	public double devide (int num1 , int num2 ) {
		double result = 0.0;
		if(num2 == 0)
			System.out.println("0���� ������ �����ϴ�");
		else {
		result = ((double)num1)/((double)num2);
		//double result = ((double)num1)/ num2 ; �� ������ ! 
		//double temp = (double)(num1/num2) ���ϸ� �ȵ� 
		// ����ȯ �����ϰ� ����� �ؾ��Ѵ�
		}
		return result; 
				
	}
}
