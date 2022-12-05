package programin.desktop.java.koligari;
import java.util.Scanner;
// Recursive Java program to 
// check if the number is 
// palindrome or not 
import java.io.*; 
class GFG 
{ 

// recursive function that 
// returns the reverse of digits 
static int rev(int n, int temp) 
{ 
	// base case 
	if (n == 0) {

    	return temp; 
    }
	// stores the reverse 
    // of a number 
  
    while( n != 0 )
    {
        temp = temp * 10;
        temp = temp + n%10;
        n = n/10;
    }

	return rev(n / 10, temp); 
} 

// Driver Code 
public static void main (String[] args) 
{ 
    Scanner p = new Scanner(System.in);
    int n = p.nextInt();
	int temp = rev(n, 0); 
	
	if (temp == n) 
		System.out.println("yes"); 
	else
		System.out.println("no" ); 
} 
} 

// This code is contributed by anuj_67. 
