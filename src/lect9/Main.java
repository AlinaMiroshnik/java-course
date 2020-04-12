package lect9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner myInput = new Scanner(System.in);
        try {
            int a = myInput.nextInt();
            int b = myInput.nextInt();
            try {
                int area = main.squareRectangle(a, b);
                System.out.println("Area :" + area);
            } catch (Exception e) {
                System.out.println("You entered negative value");

            }
        } catch (InputMismatchException e) {
            System.out.println("You entered non numeric value");
        }
    }

    private int squareRectangle(int a, int b) throws Exception{
        if(a<0 || b>0){
            throw new Exception();
        }
        else {
            return a*b;
        }
    }
}



