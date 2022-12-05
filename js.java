package programin.desktop.java.koligari;
import java.util.Scanner;
public class js{
    public static void func() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int m = in.nextInt();
        int n =in.nextInt();
        int s[][] = new int[n][m];
        for(int j=0;j<m;j++){
            s[n-1][j] = 0;
            for(int i=0;i<n-1;i++){
                s[n-1][j] +=s[i][j];
                System.out.printf("%d ",s[n-1][j]);
            }
            
        }

    }



    public static void main(String[] args) {
     func();
    }
} 