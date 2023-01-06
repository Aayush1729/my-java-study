import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class Ayush {
    public static void main(String[] args) {
//        System.out.println("Ayush is here How are you");
//        System.out.println("what are you doing");
//        String name = "Ayush";
//        String neighbour = "Mannvit";
//        // data types primitive types
//        byte age = 30;
//        int phone = 1234567890;
//        long phone2 = 12345678900L; // check the difference
//        float pi = 3.14F ;
//        char letter = '@';
//        boolean iisAdult = false;
//        //PRIMITIVE DATA TYPES
            int roll_no = 65;
            char letter = 'a';
            float marks = 454646.45343f;
            double largeDecimalNumbers = 3252363454.23456;
            long LargeIntegers = 2234567234565432L ;
            boolean check = false;

//        // non primitive types
//        String name1 = "ayush";
//        System.out.println(name.length());
//        System.out.println(name.charAt(0));
//        //replace
//        String name2 = name.replace("u","r");//if different letter other than the given string is given in the old then it will not show any error
//        System.out.println(name2);
//        String name3 = name.replace("s","g");
//        System.out.println(name3);
//        int[] marks = new int[3];//arrays having three
//        marks[0] = 97;
//        marks[1]= 98;
//        marks[2] = 95;
//        //-------------------------------------------------------------------------------------------------------------
//        System.out.println(marks[2]); //it will give '0' as output because it is an integer type array and we have not given any value to it so it will throw garbage value
//
//        System.out.println(marks[0]);// it will give assigned value as output i.e. '97'
//        // output
//        //0
//        //97
//        boolean[] marks1 = new boolean[5];
////        marks1[0]=
//
//        System.out.println(marks1[1]);// here as there is bollean function therefore it will give 'false' as output
//        //initialisation
//        //-------------------------------------------------------------------------------------------------------------
//        int[] marks0 = new int[3];//arrays having three
//        marks0[0] = 97;
//        marks0[1]= 98;
//        marks0[2] = 95;
//        //length
//        System.out.println(marks0.length); // output : 3
//
//        //sort
//        //first we have to talk about "Arrays" class of arrays in which there is a function called ".sort"
//        System.out.println(marks0[0]);//output :97
//        Arrays.sort(marks0); // first we have to import a package called "import java.util.Arrays"
//        System.out.println(marks0[0]);//output :95
//        //-------------------------------------------------------------------------------------------------------------
//        System.out.println();
//        // 2D Arrays
//        int[] marks5 = {97,98,95};
//
//        int[][] finalMarks = {{12,14,15},{24,25,26}};
//        System.out.println(finalMarks[0][0]);
//        System.out.println(finalMarks[1][0]);
//        System.out.println(finalMarks[0][2]);
//        System.out.println(finalMarks[1][2]);
        //output
        //12
        //24
        //15
        //26
        //-------------------------------------------------------------------------------------------------------------
        //Casting
//        System.out.println();
//        double price = 100.00;
//        double finalprice = price + 18;
//        System.out.println(finalprice); //output : 118.0
//
//        int p = 100;
//        int fp = p + (int)18.18;
//        System.out.println(fp); // output : 118 ""Explicit casting ""
        //-------------------------------------------------------------------------------------------------------------
        //constants
//        System.out.println();
//        int age1 = 30;
//        age1 = 31;
//        age1 = 32;
//
//        //final keyword
//        float PI = 3.14F;
//        PI = 1.1F;
//
//        final float pie = 3.14F;
//        //pie = 1.1F;
        // ERROR : cannot assign value to a final variable
        //-------------------------------------------------------------------------------------------------------------
        //operators
//        System.out.println();
//        int a = 1;
//        int b = 2;
//        int sum = a+b;
//        int div0 = a/ b;
//        double div = a / b;
//        System.out.println(sum);
//        System.out.println(div0);
//        System.out.println(div);
//
//        System.out.println();
//
//        int num = 1;
//        num++;
//        System.out.println(num);//2
//        System.out.println(num++);//2
//        System.out.println(num);//3
        //System.out.println(num++);//3
//        System.out.println(++num);//4
//        System.out.println(num);//4
//        System.out.println(--num);//3
//        //num =3
//        System.out.println(num--);//3
//        System.out.println(num);//2
        //-------------------------------------------------------------------------------------------------------------
//        // now we will talk about "Math" class
//        System.out.println(Math.max(5,6));//6
//        System.out.println(Math.min(5,6));//5
//        System.out.println(Math.random());//0.8203040515387033 long form
//        System.out.println((int)Math.random());// 0 will always give 0
//        System.out.println((int)(Math.random()*100));//95 will give a random 2 digit no

        //-------------------------------------------------------------------------------------------------------------
        //input
        // first we have to import a package called " import java.util.Scanner;
//        Scanner sc = new Scanner(System.in);
        // scanner class ke andar ek nextInt naam ka ek function hota  hai jisse hum integer input le sakte hai
//        System.out.println("Input Your Age : ");
//        Float age2 = sc.nextFloat();//input 42.32
//        System.out.println(age2);// output 42.32

//        System.out.println("input your name :");
//        String name4 = sc.next();// input : ayush is a bad boy
//        System.out.println(name4);// output : ayush
//        System.out.println("input string");
//        String name5 = sc.nextLine();
//        System.out.println(name5);// WHY IT IS NOT TAKING THE INPUT ONCE AGAIN

        //OUTPUT
        //input your name :
        //ayush
        //ayush
        //input string
        //

        // EXPECTED OUTPUT
        //input your name :
        //ayush
        //ayush
        //input string
        //ayush is a bad boy
        //ayush is a bad boy

        //-------------------------------------------------------------------------------------------------------------
        // comparison operators
        // a == b
        // a != b
        // a > b
        // a < b
        // a <= b
        // a >= b

        //-------------------------------------------------------------------------------------------------------------
        //conditional statements
//        boolean isSunUp = true;
//        if (isSunUp == true)
//            System.out.println("day");
//        else
//            System.out.println("night");
//
//        int age9 = 30;
//        if (age9 > 18)
//            System.out.println("can vote");
//        else
//            System.out.println("can't vote");
        //-------------------------------------------------------------------------------------------------------------
        // logical operators
        //&&
//        int x = 30;
//        int y = 40;
//        if (x<50 && y<50)
//            System.out.println("both less than 50");
//        if (x>10 && y>10)
//            System.out.println("both conditions satisfied");
//        // logical or "||"
//        if (x>50 || y< 50 )
//            System.out.println("At least any one condition should be satisfied");
        //---------      -----------    -------------     ------------     -------------      ----------------
//        boolean isAdult = true;
//        if (isAdult)// this is the short form of "if (isAdult == true)"
//            System.out.println("is adult");
//        if (!isAdult)
//            System.out.println("not adult");
//        else
//            System.out.println("may");
        //output
        //is adult
        //may

//        boolean isAdult = false;//see the difference in previous
//        if (isAdult)// this is the short form of "if (isAdult == true)"
//            System.out.println("is adult");
//        if (!isAdult)
//            System.out.println("not adult");
//        else
//            System.out.println("may");
        //output:
        //not adult
        //-------------------------------------------------------------------------------------------------------------
        // conditional statements
//        Scanner scn = new Scanner(System.in);
//        //pen = 10rs,notebook = 50rs
//        int cash = scn.nextInt();
//        if (cash <10) {
//            System.out.println("you cannot buy anything \n hello there ");
//            System.out.println(" get more cash");
//        }
//        if (cash>=10 && cash<40)
//            System.out.println("can get 1 thing");
//        else System.out.println("can get both");

        //-------------------------------------------------------------------------------------------------------------
        //conditional statements - SWITCH
        //conditional statements - SWITCH
//        int day = 2; //1- MOnday,2-Tuesday...
//
//        switch (day) {
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            default:
//                System.out.println("wed - sun");
//        }

        //-------------------------------------------------------------------------------------------------------------
        //LOOPs

//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);

        //1-100
//        for (int i =1 ; i <= 100; i = i +1){
//            System.out.println(i);
//        }

        //100-1
//        for (int ii=100; ii>=1;ii=ii-1){
//            System.out.println(ii);
//        }
        //while loop
//        int j = 100;
//        while ( j>= 1){
//            System.out.println(j);
//            j = j-1 ;
//        }
//        //do while
//        int k = 100;
//        do {
//            System.out.println(k);
//            k = k-1;
//        } while(k>=1);
        //--------------------------
        //problem
//        Scanner scnr = new Scanner(System.in);
//        int number = 0;
//
//        do {
//            System.out.println("input number");
//            number = scnr.nextInt();
//            System.out.print("here is your number");
//            System.out.println(number);
//        } while (number >= 0);
//        System.out.println("THE END");
        //-------------------------------------------------------------------------------------------------------------
        //BREAK & CONTINUE
//        int i = 0;
//            while(true){
//                if (i==3){
//                    i=i+1;// Think why i = i+1 is written here
//                    continue;
//                }
//                System.out.println(i);
//                i = i+1;
//                if (i>5){
//                    break;
//                }
//            }
        //-------------------------------------------------------------------------------------------------------------
        //EXCEPTION HANDLING
//        int[] marks = {78,89,65};
//        try{
//            System.out.println(marks[5]);
//        } catch(Exception exception){
//            //do something after catching
//        }
//        System.out.println("the name is Ayush");
        //-------------------------------------------------------------------------------------------------------------
        //Functions & Methods

    }
}
