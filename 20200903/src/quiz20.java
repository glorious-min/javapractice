import java.util.Scanner;

public class quiz20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		System.out.println(" ÅÂ¾î³­ ÇØ¸¦ ÀÔ·ÂÇÏ¼¼¿ä ");
		int a = sc.nextInt();
		
		int b = a%12;
		
		switch(b) {
		case 1 : System.out.println("´ß¶ìÀÔ´Ï´Ù  ");
		break;
		
		
		case 2 : System.out.println("°³¶ìÀÔ´Ï´Ù  ");
		break;
		case 3 : System.out.println("µÅÁö¶ìÀÔ´Ï´Ù  ");
		break;
		case 4 : System.out.println("Áã¶ìÀÔ´Ï´Ù  ");
		break;
		case 5 : System.out.println("¼Ò¶ìÀÔ´Ï´Ù  ");
		break;
		case 6 : System.out.println("È£¶ûÀÌ¶ìÀÔ´Ï´Ù  ");
		break;
		case 7 : System.out.println("Åä³¢¶ìÀÔ´Ï´Ù  ");
		break;
		case 8 : System.out.println("¿ë¶ìÀÔ´Ï´Ù  ");
		break;
		case 9 : System.out.println("¹ì¶ìÀÔ´Ï´Ù  ");
		break;
		case 10: System.out.println("¸»¶ìÀÔ´Ï´Ù  ");
		break;
		case 11 : System.out.println("¾ç¶ìÀÔ´Ï´Ù  ");
		break;
		case 0 : System.out.println("¿ø¼şÀÌ¶ìÀÔ´Ï´Ù  ");
		break;
		
		
		

	}

}}
