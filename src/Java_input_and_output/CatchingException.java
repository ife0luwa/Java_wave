package Java_input_and_output;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CatchingException {
    public static void main(String[] args) {
        try {
            int result = divideEAFP();
        } catch (ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down!");
        }

    }

    public static int divideLBYL (int x, int y) {
        if( x != 0 && y != 0) {
            return x / y;
        }
        else return 0;
    }

    public static int divideEAFP () {
       // try {
           int x = getIntEAFP();
           int y = getIntEAFP();
            System.out.println("x is " + x + ", y is " + y);
            return x / y;
//        }catch (NoSuchElementException e) {
//            throw new NoSuchElementException("no suitable input");
//        } catch(ArithmeticException e) {
//            throw new ArithmeticException("attempt to divide by zero");
//        }
    }

    public static int getIntEAFP () {
        Scanner s = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 9: ");
       // try {
            return s.nextInt();
//        } catch (InputMismatchException e) {
//            throw new InputMismatchException("no suitable input");
        }


}
