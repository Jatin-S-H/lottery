import java.util.Random;
import java.util.Scanner;
public class lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a two digit number");
        int a = sc.nextInt();
        if(a>99 || a<0){
            System.out.println("the given input is not valid");
        }  
        else{
            Random ra = new Random();
            int r = ra.nextInt(10);
            int r1 = ra.nextInt(10);
            System.out.println("Lottery number: "+r1+""+r);
            int b = a/10;
            int c = a%10;
            if(c == r1 && b == r){
                System.out.println("Exact match,reward: $10,000");
            }
            else if(c == r && b == r1){
                System.out.println("not exact match,reward: $3,000");
            }
            else if (c == r || c==r1 || b == r || b == r1) {
                System.out.println("some digits match,reward: $1,000");
            }
            else{
                System.out.println("better luck next time");
            }
        }
    }
}
