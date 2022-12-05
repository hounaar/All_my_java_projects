package programin.desktop.java.koligari;
import java.util.Scanner;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
public class zaribedojomleye extends fib{
    public static int zarib(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter n & k ");
        int n = in.nextInt();
        int k = in.nextInt();
        int z[][] = new int[n][k];
        for(int i = 0; i<=n; i++){
            for(int j = 0;j< n-i ; j++){
                if(k == 0 || k == n){
                    return z[i][j] = 1;
                }
                else{
                  return z[i-1][j-1] + z[i-1][j];
                }
                
            }
        }
        return z[n][k];

    }
   
    public static void main(String[] args) {
        zarib();
    }
}