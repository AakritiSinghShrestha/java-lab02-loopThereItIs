package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String number="";
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                int product = i * j;
                if(product < 10){
                    number += "  " + product + " ";
                } else {
                    number += " " + product + " ";
                }
                number+="|";
            }
            number+="\n";
        }

        return number;
    }

    public static String getLargeMultiplicationTable() {
        int i,j;
        String number="";
        int product;
        for(i=1;i<=10;i++){
            for(j=1;j<=10;j++){
            product=i*j;
                if(product<10){
                    number +="  "+product+" ";
                }else if(product>=10 && product<100){
                    number +=" "+product+" ";
                }else{
                    number +=product+" ";
                }
                number +="|";
            }
                number+="\n";
        }
        return number;
    }

    public static String getMultiplicationTable(int tableSize) {

        int i,j;
        String number="";
        int product;
        for(i=1;i<=20;i++){
            for(j=1;j<=20;j++){
                product=i*j;
                if(product<10){
                    number +="  "+product+" ";
                }else if(product>=10 && product<100){
                    number +=" "+product+" ";
                }else{
                    number +=product+" ";
                }
                number +="|";
            }
            number+="\n";
        }
        return number;
    }
}
