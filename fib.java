package programin.desktop.java.koligari;
import java.util.Scanner;
public class fib{
    public static int fibonachi(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter n : \n");
        int n = in.nextInt();
        int f[] = new int [n];
        f[0]=0;
        if(n>0){
            f[1]=1;
        for(int i=2;i<=n;i++){
            f[i] = f[i-1] + f[i-2];
            System.out.print(f[0] + f[1] + f[i]);
        } 
    }
        return f[n];
}
    
    public static void main(String[] args) {
       fibonachi();
    }
    
}
