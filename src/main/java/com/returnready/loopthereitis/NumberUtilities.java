package com.returnready.loopthereitis;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String number="";
        for(int i=start; i<stop;i++){
        if(i % 2 == 0) {
            number += i;

        }
}
        return number;
    }


    public static String getOddNumbers(int start, int stop) {
        String number="";
        //int j =0;
        for(int i=start; i<stop;i++){
            if(i % 2 != 0) {
                number += i;

            }
        }
        return number;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String number ="";
        int j=0;
        for(int i=start;i<stop;i+=step)
        {
                j = (int) Math.pow(i,2);
                number +=j;
                j=0;
        }
        return number;
    }

    public static String getRange(int start) {
        StringBuilder number = new StringBuilder();
        for(int i=0;i<start;i++){
            number.append(i);
        }
        return number.toString();
    }

    public static String getRange(int start, int stop) {
        String number ="";
        for(int i=start;i<stop;i++){
            number +=i;
         }
        return number;
    }


    public static String getRange(int start, int stop, int step) {
        String number ="";
        for(int i=start;i<stop;i+=step){
            number+=i;
        }
        return number;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
       int j=0;
       String number = "";
        for(int i=start ;i<stop;i+=step){
          j+=Math.pow(i,exponent) ;
          number +=j;
          j=0;
        }
        return number;
    }
}
