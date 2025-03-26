package com.transport.heavyvehical.patterns;

public class Patterns {

    public static void getPattern(){
//        getRightHalfPyramidPattern();
//        getHollowSquarePattern();
        getRhombusPattern();
    }

   /*
    **
    ***
    ****/
    public static void getRightHalfPyramidPattern() {
        for(int i=1; i <= 5 ; i++)
        {
            for(int j=1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /****
     *  *
     *  *
     ****/
    public static void getHollowSquarePattern(){

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if( i == 2 || i == 3 || i == 4){
                    if(j==2 || j == 3 || j==4) {
                        System.out.print(" ");
                        continue;
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void getRhombusPattern(){
        for(int i =1; i <=5 ;i++){
            for(int j = 1;   j <= 10 ; j ++) {
                if(j < i || j >i+5) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



