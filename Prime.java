// PRIME NUMBER OR NOT (1 or khud ke table mai ata ho)(1,3,5,7,9....)
//Q. write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
package loops;
import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        boolean isPrime=true;
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
            if(n<2){
                isPrime=false;
            }
        System.out.println("isPrime "+isPrime);  //1,31,32
    }
}
