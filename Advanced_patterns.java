public class Advanced_patterns {
    public static void main(String[] args) {
        int n = 4 ;

        for (int i = 1 ; i<=n ; i++){
            for ( int j = 1 ; j <=8 ; j++){
                if (j<=i||(j+i)>=9){
                    System.out.print("*");


                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
