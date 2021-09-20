package com.bridgelabz.LineComp;
import java.util.Objects;
import java.util.Scanner;
class LineCompEquality {
    double lengthOfLine;
    LineCompEquality(){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Lets create object by giving in the Co-Ordinates");
        int Xone=scannerObj.nextInt();
        int Yone=scannerObj.nextInt();
        int Xtwo=scannerObj.nextInt();
        int Ytwo=scannerObj.nextInt();
        this.lengthOfLine =(double) Math.sqrt( ( ( Xtwo - Xone ) * ( Xtwo - Xone ) )
                + ( ( Ytwo - Yone ) * ( Ytwo - Yone ) ) );
    }
    public static void main(String[] args) {
        LineCompEquality lengthLOne = new LineCompEquality() ;
        LineCompEquality lengthLTwo = new LineCompEquality() ;
        double lineOne = lengthLOne.lengthOfLine;
        double lineTwo = lengthLTwo.lengthOfLine;
        System.out.println(lineOne);
        System.out.println(lineTwo);
        if(Objects.equals(lineOne, lineTwo)) {
            System.out.println("The two lines are equal");
        }
        else {
            System.out.print("The two lines are not equal");
        }
    }
}
