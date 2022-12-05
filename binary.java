package programin.desktop.java.koligari;
import java.util.Scanner;
public class binary {
    public static void binarykey() {
        Scanner inp=new Scanner(System.in);
        int a;
        String b="";
        System.out.print("ye adad bede binarish konm");
        int n=inp.nextInt();
        while(n!=0)
        {
        // محاسبه باقیمانده عدد ورودی تقسیم بر دو
        a=n%2;
        b=a+b;
        n=n/2;
        }
        System.out.println(b);
    }
    public static void main(String[] args) {
        binarykey();
    }

}