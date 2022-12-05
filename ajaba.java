package programin.desktop.java.koligari;
import java.util.Scanner; 

public class ajaba {

	public static int dig(int num) { 

		if ((num >= 0) && (num < 10)) { 
			return 1; 
		}
		else {
			return 0; 
	} 
	}
	public static int fmainFunction (int num, int secnum) throws Exception { 

		if (num == 0) { 
			return secnum; 
		} else { 
			secnum = fmainFunction (num / 10, secnum); 
		} 

		if (num % 10 == secnum % 10) {  
			return secnum / 10; 
		} else { 
			return 0;

				} 

	} 

	public static int smainfunction(int num) throws Exception { 

		if (num < 0) {
            num = (-num); 
        }
		int secnum = (num); 
		return fmainFunction(num, secnum); 
	} 

	public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("adad bede");
		int n = in.nextInt(); 
		System.out.println(n);

		try { 
			smainfunction(n); 
			System.out.println("in adad Gharineye hastesh"); 

		} catch (Exception e) { 
			System.out.println("asn gharine nisesh"); 
		} 
	
	} 


}
