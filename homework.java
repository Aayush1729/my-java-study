import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("give 1 - +,2- -,3 - *,4 - /, 5- % :");
        int c = sc.nextInt();
        int sum = a + b ;
        int product = a * b ;
        int diff = a-b;
        float div = a/b;
        int mod = a%b;

        if (c == 1 )
            System.out.println(sum);
        else if ( c== 2)
            System.out.println(diff);
        else if ( c== 3)
            System.out.println(product);
        else if (c==4)
            System.out.println(div);
        else if (c==5)
            System.out.println(mod);
        else
            System.out.println("invalid operation");



    }
}
