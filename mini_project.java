import java.util.Scanner;
public class mini_project {
    public static void main(String[] args) {
        int orgnum = (int)(Math.random()*100);
        int usernumber=0;
        do {
            System.out.println("Guess the number(1-100) : ");
            Scanner sc = new Scanner(System.in);
            usernumber = sc.nextInt();
            if (orgnum == usernumber){
                System.out.println("Wooho... You have guessed the correct number");
                break;
            } else if (usernumber > orgnum) {
                System.out.println("this number is too large");

            }
            else
                System.out.println("this number is too small");


        } while(usernumber >= 0);

        System.out.print("my number was : ");
        System.out.println(orgnum);



    }
}
