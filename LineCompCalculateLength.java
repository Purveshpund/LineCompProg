package com.bridgelabz.LineComp;
import java.util.Scanner;
class LineCompCalculateLength {
    double lengthOfLine;
    LineCompCalculateLength (){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Lets create object by giving in the Co-Ordinates");
        int Xone=scannerObj.nextInt();
        int Yone=scannerObj.nextInt();
        int Xtwo=scannerObj.nextInt();
        int Ytwo=scannerObj.nextInt();
        this.lengthOfLine = Math.sqrt( ( ( Xtwo - Xone ) * ( Xtwo - Xone ) )
                + ( ( Ytwo - Yone ) * ( Ytwo - Yone ) ) );
    }
    public static void main(String[] args) {
        LineCompEquality lengthLOne = new LineCompEquality();
        System.out.println("length of line with given points is "+ lengthLOne.lengthOfLine);
    }
}
