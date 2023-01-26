package edu.ucr.cs.cs167.cho102;


import java.util.function.Function;

public class App
{
    static class IsEven implements Function<Integer, Boolean> {
        @Override
        public Boolean apply(Integer x) {
            return x % 2 == 0;
        }
    }
    static class IsDivisibleByThree implements Function<Integer, Boolean> {
        @Override
        public Boolean apply(Integer x) {
            return x % 3 == 0;
        }
    }

    public static Function<Integer, Boolean> filter = x -> x==2 ;
    public static void printNumbers(int from, int to, Function<Integer, Boolean> filter) {
        System.out.printf("Printing numbers in the range [%d,%d]\n", from, to);
    }

    public static void printEvenNumbers(int from, int to) {
        System.out.printf("Printing numbers in the range [%d,%d]\n", from, to);
        for (int i = from; i < to; ++i){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void printNumbersDivisibleByThree(int from, int to){
        System.out.printf("Printing numbers in the range [%d,%d]\n", from, to);
        for (int i = from; i < to; ++i){
            if (i%3 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main( String[] args )
    {
        if (args.length !=3) {
            System.err.println("Error: At least three parameters expected, from, to, and base.");
            System.exit(-1);
        }
        else {
            printNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]), filter);
            /*if (Integer.parseInt(args[2]) == 2) {
                printEvenNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            }
            else {
                printNumbersDivisibleByThree(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            }
             */
        }
        System.out.println( "Hello World!" );
        System.out.print(new IsEven().apply(5));
    }
}
