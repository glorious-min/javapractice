
public class LibraryQuiz3rightanswerx {

	
	public static void main(String[] args) {

		int reader = 2; // ����� ��
		int day = 1; // ����
		int book = 300000; // å�� ��

		while (true) {
			book -= reader * 30;
			if (day % 10 == 0) {
				reader *= 2;
			}
			if (book <= 0) {
				break;
			}
			day++;
		}
		System.out.println(day + " " + reader);
	} // �̰� �� �Ǵ°��� ???

}
