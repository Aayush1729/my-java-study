public class patterns {
    public static void main(String[] args) {
        //*****
        //*****
        //*****
        //*****

//        int i,j;
//        for (i=0;i<4;i++){
//            for(j=0;j<5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //--------------------------------------------------------------------------------------------------------------


        //*****
        //*   *
        //*   *
        //*****

//        int n = 4;
//        int m = 5;
//        // inner loop
//        for (int i = 1 ; i<=n; i++){
//            for (int j = 1 ; j<=m; j++){
//                if(i==1||j==1||i==n||j==m){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }


        //--------------------------------------------------------------------------------------------------------------



        //*
        //**
        //***
        //****
        //*****


//        int n =5;
//        int m=5;
//
//        for (int i = 1; i<=n; i++){
//
//            for(int j = 1 ; j<=m; j++){
//                if(j<=i)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//
//            }
//            System.out.println();
//        }

        //OR--------------------------------------------

//        int n = 5;
//        for (int i = 1 ; i<=n ; i++){
//            for(int j = 1 ; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//

        //--------------------------------------------------------------------------------------------------------------

        //****
        //***
        //**
        //*

//        int n = 5 ;
//        for (int i=n ; i>=0;i--){
//            for (int j=1 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //--------------------------------------------------------------------------------------------------------------

        //   *
        //  **
        // ***
        //****

//        int n=5;
//        int m =5;
//        for (int i = 1;i<=n;i++){
//            for(int j = 1 ; j<= m ; j++){
//                if (j<=n-i){
//                    System.out.print(" ");
//                }else System.out.print("*");
//
//            }
//            System.out.println();
//        }

        //--------------OR--------------------------
//        int n = 5;
//        for (int i =1; i<=n; i++){
//
//            for (int j =1 ; j<=n-i ; j++){
//                System.out.print(" ");
//            }
//
//            for (int j = 1 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //--------------------------------------------------------------------------------------------------------------

        //1
        //12
        //123
        //1234

//        int n = 5;
//        for (int i = 1 ; i<=n ; i++){
//
//            for (int j =1 ; j<=i ; j++ ){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //--------------------------------------------------------------------------------------------------------------
        //12345
        //1234
        //123
        //12
        //1

//        int n = 5;
//        for ( int i = 5 ; i>=0 ; i--){
//            for ( int j = 1 ; j<=i ; j++){
//
//                System.out.print(j);
//            }
//            System.out.println();
//
//        }

        //--------------------OR-------------



        //--------------------------------------------------------------------------------------------------------------
//        1
//        23
//        456
//        78910
//        1112131415

//        int n=5;
//        int number = 1 ;
//
//        for(int i = 1 ; i <=5 ;i++){
//            for(int j = 1 ; j <=i ; j++){
//                System.out.print(number+" ");
//                number = number +1;
//            }
//            System.out.println();
//        }

        //-------------------------------------------------------------------------------------------------------------
//        1
//        01
//        101
//        0101
//        10101
        int n =  5 ;
        for (int i= 1 ; i<=n ; i++){
            for (int j = 1 ; j<=i;j++){
                if ((j+i)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }


            }
            System.out.println();
        }


    }
}
