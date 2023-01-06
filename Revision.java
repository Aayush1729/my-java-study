public class Revision {
    public static void main(String[] args) {
        //print the pattern
        //*****
        //*   *
        //*   *
        //*****

//        int n=4;
//        int m = 5;
//        for(int i = 1; i<=n; i++){
//            for(int j = 1 ; j<=m;j++){
//
//                if (i==1||j==1||i==n||j==m){
//                    System.out.print("*");
//
//                }else System.out.print(" ");
//            }
//            System.out.println();
//        }
        //-------------------------------------------------------------------------------------------------------------
//        1
//        12
//        123
//        1234
//        12345
//        int n=5;
//        for (int i = 1 ; i<=5 ; i++){
//            for(int j = 1 ; j<=n ; j++){
//                if (j<=i)
//                    System.out.print(j);
//            }
//            System.out.println();
//        }


        //-------------------------------------------------------------------------------------------------------------
//        12345
//        1234
//        123
//        12
//        1
        int n=5;
        for (int i = 5 ; i>=1 ; i--){
            for(int j = 1 ; j<=n ; j++){
                if (j<=i)
                    System.out.print(j);
            }
            System.out.println();
        }


    }

}
