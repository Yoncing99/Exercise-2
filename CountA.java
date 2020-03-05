import java.util.Scanner;
public class CountA{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ：");
        String a = sc.nextLine();
        int sum =0;
        for(int i=0;i<a.length();i++){
            if (a.charAt(i)=='A'){
                sum++;
            }
        }
        System.out.println("The num of times the character'A' is found : "+sum);
    }
}