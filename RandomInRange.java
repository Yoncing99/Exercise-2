import java.util.Scanner;
import java.util.Random;
public class RandomInRange{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer 1：");
        int min = sc.nextInt();
        System.out.println("Enter integer 2：");
        int max = sc.nextInt();
        
        if(min>max){
            System.out.println("integer 1 is greater than integer 2 =0");
        }else{
            System.out.println("integer 2 is greater than integer 1");
            random(min,max);
        }
    }

    public static void random(int min,int max){
        Random in = new Random();
        int range = max-min+1;
        System.out.println("Random integer : "+in.nextInt(range));

        //system.out.println((int)(Math.random()*(max-min+1))+low);
    }
}