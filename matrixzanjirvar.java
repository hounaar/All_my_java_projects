package programin.desktop.java.koligari;
import java.util.Scanner;
public class matrixzanjirvar{
    public static int Munimult(){
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
       
      
        int m[][] = new int [n][n];
        for(int i=0;i<=n;i++){
            m[i][i]=0;
        }
        for(int ghotr = 1;ghotr<=n-1;ghotr++){
            for(int i=1;i<n-ghotr;i++){
                int j = i + ghotr;
                int k;
                int d[] = new int[k];
                if(k<=j-1 || k>=i){
                m[i][j] = m[i][k] + m[k+1][j] + (d[i-1]*d[k]*d[j]);
                
            }else{
                return 0;
            }
        }
    }
    return m[1][n];
}
    public static void main(String[] args) {
       int res =  Munimult();
       System.out.print("res is :"+ Munimult());
    }
}