package programin.desktop.java.koligari;
import java.util.Scanner;
public class ipman{
    public static int moratabsaziSari(){
        Scanner in = new Scanner(System.in);
        int s[] = {4,13,10,2,11};
        int low = in.nextInt();
        int high = 5;
        int NoghteyeMehvar = s[low];
        int i = NoghteyeMehvar;
        for(int j = low+1 ; j<=high ; j++){
            if(s[j]<NoghteyeMehvar){
                i++;
                s[i] = s[j]; 
            }
        }
        NoghteyeMehvar = i;
        s[low] = s[NoghteyeMehvar];
        return NoghteyeMehvar;


    }
    public static void main(String[] args) {
        moratabsaziSari();
    }
}


