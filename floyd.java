package programin.desktop.java.koligari;
import java.util.Scanner;
public class floyd {
    public static Number[][] floyd_algo(Number[][] d) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n");
        int n =in.nextInt();
        Number [][] w;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                for(int k=0;k<=n;k++){
                    int d[][] = new int[i][j];
                    d[i][j] = d[i][k]+d[k][j];

                }
            }
        }
        return d;
    }
    public static void main(String[] args) {
        floyd_algo(d);
    }

}