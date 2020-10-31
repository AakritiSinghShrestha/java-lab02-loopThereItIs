package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String star="*";
        String number="";
        for(int i=1;i<numberOfRows;i++){
            for(int j=1;j<=i;j++){
                number += star;
            }
            number +="\n";
        }
        return number;
    }

    public static String getRow(int numberOfStars) {
        String star="*";
        String number ="";
        for(numberOfStars=0;numberOfStars<20;numberOfStars++) {
            number += star;
        }
        return number;
    }

    public static String getSmallTriangle() {
        int i,j;
        String star ="*";
        String number ="" ;
        for(i=0;i<4;i++){
        for(j=0;j<=i;j++) {
        number += star;
        }
        number +="\n";
        }
        return number;
    }

    public static String getLargeTriangle() {
        int i,j;
        String star="*";
        String number="";
        for(i=0;i<9;i++){
            for(j=0;j<=i;j++){
                number += star;
            }
            number +="\n";
        }
        return number;
    }
}
