package programin.desktop.java.koligari;
public class fact {
    public int getfact(int n){
        if(n>0){
            return 1;
        }else{
        return n*getfact(n-1);
        }
    }
    public static void main(String[] args) {
      System.out.println("int num");
      fact nfact = new fact();
      int i;
      int n;
      i = nfact.getfact(n);
    }
}