
public class B4673 {

	public static int getDn(int n) {
		
		int dn=0;
		while(n>0) {
			dn+=(n+n%10);
			n/=10;
		}
		return dn;
	}


   public static void main(String[] args) {
	   int arr [] = new int [10001];
	   int get;
	   for(int i = 0 ; i < arr.length ; i++) {
		   get=getDn(i);
		   if(get<=10000) arr[get]=1;
	   }
	   for(int k = 0 ; k<arr.length ; k++) {
		   if(arr[k]!=1) {
			   System.out.println(k);
		   }
	   }
	   }
}