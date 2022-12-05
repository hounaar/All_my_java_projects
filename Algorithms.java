package programin.desktop.java.koligari;
import java.util.Scanner;
public class Algorithms{
    // برخی جاها به صورت شبه کدن
    // اولی جستجوی ترتیبی
    public static int binary_search(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int s[] = new int[n];
        System.out.println("Enter N :");
        int location = 1;
        while(location<=n){
            if(s[location] == x){
                return location;
            }
            else if(s[location] < x){
                System.out.println("X aint in S array");
                return 0;
            }else if(s[location] > x){
                System.out.println("X aint in S array");
                return 0;
            }
            
        }
        return 0;
    }
    // جیتجوی غ بازگشتی دودویی
    public static int Binary_search(){
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        int s[] = new int[n];
        int low = i.nextInt();
        int high =i.nextInt();
        int x = i.nextInt();
        int mid = (low + high) / 2;
        while(low < high){
            if(s[mid]==x){
                System.out.println("The X is in the middle of the array");
                return mid;
            }else if(x < s[mid]){
                high = mid - 1;
                System.out.println("The x is in the left side of the array");
                return high;
            }
            else{
                low = mid + 1;
                System.out.println("The X is in right side of the array");
                return low;
            }
        }
        return 0;
    }
    //جستجوی دودویی روش بازگشتی
    // zamani = TETA(lgn)
    public static void Binary_ftreturn(){
        Scanner j = new Scanner(System.in);
        int n = j.nextInt();
        int s[] = new int[n];
        int low = j.nextInt();
        int x = j.nextInt();
        int high = j.nextInt();
        int mid = (high + low)/2;
        if(low>high){
            System.out.println("Plz Enter again");
            
        }
        else{
            if(x == s[mid]){
                System.out.println("The X is in the mid of the array");
                
            }
            else if(x < s[mid]){
                System.out.printf("%d , %d , %d , %d ",s,x,low,mid-1);
            }
            else{
                System.out.printf("%d , %d , %d , %d ",s,x,mid+1,high);
            }
        }
        
    }
    // مجموع عناصر آرایه
    public static int Array_sum(){
        int result = 0;
        Scanner k=new Scanner(System.in);
        int n = k.nextInt();
        int s[] = new int[n];
        for(int i =1;i<n;i++){
            s[i]+=result;
            System.out.printf("%d ",result);
            
        }
        return result;
    }
    //مرتب سازی تعویضی
    public static void exchange(){
     Scanner f = new Scanner(System.in);
     int n=f.nextInt();
     int s[] = new int[n];
     for(int i = 1;i<n-1;i++){
         for(int j=i+1;j<n;j++){
             if(s[j]<s[i]){
             s[i] = s[j];
             System.out.printf("%d , %d ",i,j);
         }
        }   
         
    }
     //return s;
    }
  // ضرب ماتریسی ساده
  public static void MatrixMultSimple(){
      Scanner r = new Scanner(System.in);
      int n =r.nextInt();
      int b[][] = new int[6][6];
      int a[][] = new int[5][6];
      for(int i = 1 ;i<n;i++){
          for(int j = 1;j<n;j++){
              int c[][] = new int[0][0];
              for(int k = 1;k<n;k++){
                  c[i][j] = a[6][6]*b[5][6];
                  System.out.print(c);
              }
            }
          
      }
      //return c;
      
  }
  //دنباله فیبوناچی
  public static int[] fib(){
      Scanner a = new Scanner(System.in);
      int n = a.nextInt();
      int f[] = new int[n];
      f[0] = 0;
      if(n>0){
          f[1] = 1;
          for(int i = 2;i<n;i++){
               f[i] = f[i-1] + f[i-2];
               System.out.printf("%d %d",f,i);
          }
      }
      return f;
  }
  // مرتب سازی ادغامی - 2 زیر ارایه و به صورت بهینه برای کاهش حافظه
  public static void mergesort(int[] s2, int low2, int mid2) {
      Scanner m = new Scanner(System.in);
      int n = m.nextInt();
      int s[] = new int[n];
      int low =  m.nextInt();
      int high = m.nextInt();
      if(low<high){
          int mid = (low+high)/2;
          mergesort(s,low,mid);
          mergesort(s,mid+1,high);
          merge();

      }
  }
  // zamani : teta(nlgn)
  public static void merge(){
      Scanner p = new Scanner(System.in);
      int n = p.nextInt();
      int s[] = new int[n];
      int U[] = new int[n];
      int low = p.nextInt();
      int high = p.nextInt();
      int mid = (low+high)/2;
      int i = low;
      int k = low;
      int j = mid + 1;
      while(i<=mid && j<= high){
          if(s[i]<s[j]){
              U[k] = s[i];
              i++;
          }else{
              U[k] = s[j];
              j++;
          }
          k++;
      }
      if(i>mid){
          s[j] = U[k];
            }
            else{
                s[i] = U[k];
                U[low] = U[high];
            }

  }
  // usual onspect = n-1
  //worst conspect = teta(n POWER 2)
  // average conspect = teta(nlgn)
  public static void quik(int[] s2, int low2, int i) {
      Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int s[] = new int[n];
      int low = in.nextInt();
      int high = in.nextInt();
      if(low<high){
         int pivotitem = quiksort(s,low,high);
         quik(s,low,pivotitem-1);
         quik(s,pivotitem+1,high);
      }
  }
  public static int quiksort(int[] s2, int low2, int high2) {
      Scanner o = new Scanner(System.in);
      int n = o.nextInt();
      int s[] = new int[n];
      int low = o.nextInt();
      int high  =o.nextInt();
      int pivotitem = low;
      int i = low;
      for(int j = 1+low;j<=n;j++){
          if(s[j]<pivotitem){
              i++;
              s[i] = s[j];
          }
      }
      pivotitem = low;
      s[low] = s[pivotitem];
      return pivotitem;
  }
  //ضرب اتريس استراسن
  // zarb & zam = teta(n power of 2.81)
  public static void Esteransen(){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[][] = new int[n][n];
      int b[][] = new int[n][n];
      int limit = in.nextInt(); // آستانه
      if(n<limit){
          int c[][] = new int[n][n];
          c[n][n] = a[n][n] *b[n][n];
        
      }else{
          // partion a ,b into a11,a12,a21,a22 ;
          // b -> b11,b12,b21,b22;
      }
      // با توجه به روابط داده شده توسط استاد
    
      //return c;
  }
  
  


  


}