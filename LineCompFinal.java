package com.bridgelabz.LineComp;
import java.awt.*;
import java.util.Scanner;
class LineCompFinal {
    double lengthOfLine;
    public static void main(String[] args) {
        LineCompFinal lineOne= new LineCompFinal();
        LineCompFinal lineTwo= new LineCompFinal();
        lineOne.computeIt();
        lineTwo.computeIt();
        Double line1= lineOne.lengthOfLine;
        Double line2 = lineTwo.lengthOfLine;
        System.out.println("length of line1 with given points is "+ line1);
        System.out.println("length of line2 with given points is "+ line2);
        int compare=line1.compareTo(line2);
        System.out.println(compare);
        if (compare== 0) System.out.println("Two lines are Equall");
        if (compare < 0) System.out.println("line2 is greater");
        if (compare > 0) System.out.println("line1 is greater");
    }
    double computeIt(){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Lets create object by giving in the Co-Ordinates");
        Point P = new Point();
        Point Q = new Point();
        P.x = scannerObj.nextInt();
        P.y = scannerObj.nextInt();
        Q.x = scannerObj.nextInt();
        Q.y = scannerObj.nextInt();
        lengthOfLine =Math.sqrt(( ( Q.x - P.x ) * ( Q.x - P.x ) )
                + ( ( Q.y - P.y ) * ( Q.y - P.y ) ) );
        System.out.println(lengthOfLine);
        return lengthOfLine;
    }
}