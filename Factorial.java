import java.util.Scanner;
//defining the class
public class Factorial {
    public static long Calculatefactorial(int n){
        int fact=1;
        if (n==0 || n==1){
            return 1;     //base case
        }
        for (int i=2;i<=n;i++){
            fact*=i;
        }           
        return fact;       //recursive case
    }

    public static void main(String[] args) {
      //creating object of scanner
        Scanner sc=new Scanner(System.in);
      //taking input
        System.out.print("Enter a number:");  
        int num= sc.nextInt();
        sc.close();  //closing 
        if (num>=0){
        System.out.print("Factorial of "+num+ " is : "+Calculatefactorial(num)); //print result
        } else{
            System.out.println("Negative numbers don't have Factorial...");
        }
    }
}
