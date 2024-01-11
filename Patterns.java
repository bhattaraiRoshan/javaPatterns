public class Patterns{


    public static void hellow_Rectangle (int n, int o){

        for(int r=1; r<= n; r++){

            for(int c=1; c<=o; c++){

                if(r==1|| r== n|| c==1|| c== o){
                    System.out.print("*" + "");
                }else{
                    System.out.print(" ");
                }

                
            }
            System.out.println();
        }

    }

    public static void inverted_Rotated_haldPyramid (int n){

        for(int i=1; i<=n; i++){

            // spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<= i ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void inverted_halfPyramid (int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<= n- i + 1 ; j++){
                System.out.print(j);
            }

            System.out.println();
        }

    }

    public static void floyd_Triangle (int n) {

        int ch = 1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){

                System.out.print(ch);
                ch++;

            }

            System.out.println();
        }

    }

    public static void zero_One_Trinangle (int n){

        for(int i=1; i<= n; i++){

            for(int j= 1; j<= i; j++){

                if((i+j)%2 == 0){
                    System.out.print(1 + " ");
                } else{
                    System.out.print(0 + " ");
                }
            }

            System.out.println();
        }
    }

    public static void butterfly_Pattern (int n){

        for(int i = 1; i<= n; i++){

            for(int j = 1; j<= i ; j++){
                System.out.print("*");
            }

            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }


        for(int i = n; i>=1 ; i--){

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<= i ; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void solid_Rhombus (int n){

        for(int i =2; i<= n; i++){

            // space
            for(int j=1; j<= (n-i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j<= n; j++){
                System.out.print("*" + " ");
            }

           

            System.out.println();
        }
    }

    public static void hollow_Rhombus(int n){

        for(int i=1; i<=n; i++){

            for(int j=1; j<= (n-i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=n; j++){

                if(i==1 || i==n || j == 1 || j == n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond (int n) {

        for(int i =1; i <= n; i++){

            for( int j=1; j<= (n-i); j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<= 2*i -1 ; j++){
                System.out.print("*");
            }

            for(int j =1 ; j<= (n-i); j++){
                System.out.print(" ");
            }
           
            System.out.println();
        }

        for(int i = n; i>=1; i--){

             for( int j=1; j<= (n-i); j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<= 2*i -1 ; j++){
                System.out.print("*");
            }

            for(int j =1 ; j<= (n-i); j++){
                System.out.print(" ");
            }
           
            System.out.println();

        }
    }

    public static void main (String args[]){

        hellow_Rectangle(4, 5);
        inverted_Rotated_haldPyramid(4);
        inverted_halfPyramid(5);
        floyd_Triangle(4);
        zero_One_Trinangle(6);
        butterfly_Pattern(4);
        solid_Rhombus(8);
        hollow_Rhombus(5);
        diamond(4);

    }
}