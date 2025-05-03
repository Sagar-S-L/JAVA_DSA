package AdvancedPatterns;

public class HalfPyramid {
    
    public static void main(String[] args) {
        int totRow=5;
        int totCol=5 ;
        for(int row=1;row<=totRow;row++){
            for(int col=1;col<=totCol;col++){
                if(col<=totRow-row){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
