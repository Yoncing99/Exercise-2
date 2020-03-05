import java.util.Scanner;
public class PrintReverse{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ：");
        String a = sc.nextLine();
        String total = " ";

        for(int i=a.length()-1;i>=0;i--){
            total+=a.charAt(i);
        }
        System.out.println("Reverse string is : "+total);
    }
}