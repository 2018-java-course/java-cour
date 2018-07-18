/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.IOException;

/**
 *
 * @author claudio
 */
public class ExceptionTest {

    static double division(double num, double den) throws MyException, IOException {
        if (den == 0.0) {
            throw new MyException("Division by zero!!! :(");
        }
        System.out.println("in division dopo aver lanciato l'eccezione");

        if ("ciao".equals("bye")) {
            throw new YourException();
        }

        int a = 7 / 0; // this throws an ArithmeticException (that is a RuntimeException)

        return (num * a) / den;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            division(2.0, 0.0);
        } catch (YourException ex) {
            // YourException is subclass of MyException,
            // must be catched _before_ it!
            System.out.println(ex);
        } catch (MyException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println("dentro IOException");
            System.out.println(ex);
        } catch (ArithmeticException are) {
            System.out.println("dentro ArithmeticException");
            System.out.println(are);
        } catch (Exception ex) {
            System.out.println("Non dovrebbe mai accadere, ma non si sa mai...");
            System.out.println(ex);
        }
        System.out.println("Sono ancora vivo!");
    }

    private static class MyException extends IOException {

        public MyException(String division_by_zero_) {
            super(division_by_zero_);
        }

        @Override
        public String toString() {
            return super.getClass() + " yo!";
        }
    }

    private static class YourException extends MyException {

        public YourException() {
            super("YourException");
        }
    }
}
