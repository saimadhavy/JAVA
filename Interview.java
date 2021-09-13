import java.util.Scanner;
public class Interview {
    public static void main(String[] args) {

        //LOOPS
        //1.
        /*System.out.print("Enter any number:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for(int i =1;i<n;i++){
            sum = i+sum;
        }
        System.out.println(sum);*/


        //2.
        /*Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int s =0;
        System.out.println("last number:"+a%10);
        for(int i =0;i<a;i++){
            s = a%10;
            a = a/10;
        }
        System.out.print("first number:"+a);*/


        //3.
        /*Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0;
        while(a>0){
            int x = a%10;
            sum=sum+x;
            a = a/10;

        }
        System.out.println("The sum all digits is: "+sum);*/


        //4.
        /*Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int pro = 1;
        while(a>0){
            int x = a%10;
            pro=pro*x;
            a = a/10;

        }
        System.out.println("The product all digits is: "+pro);*/


        //5.
        /*Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int first=0;
        int last=a%10;

        for(int i =0;i<=a;i++)
        {
             a=a/10;
             first=a;
        }
        System.out.println(first);
        System.out.println(last);*/


        //6.
        /*Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sr = (int) Math.sqrt(x);
        if (x >= 0) {
            if (x != sr*sr) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }*/

        //7.
        /*Scanner scan = new Scanner(System.in);
        int pa = scan.nextInt();
        int w =pa;
        int rev=0;
        while(pa>0){
            int q = pa%10;
            rev = q + rev*10;
            pa = pa/10;

        }
        if(rev==w){
           System.out.println("yes");}*/


        //8.






















    }
}






























