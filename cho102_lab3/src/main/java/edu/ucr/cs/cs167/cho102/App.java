package edu.ucr.cs.cs167.cho102;


import java.util.function.Function;

public class App
{
    //PART 2
    public static void printEvenNumbers(int from, int to) {
        System.out.printf("Printing numbers in the range [%d,%d]\n", from, to);
        for (int i = from; i <= to; ++i){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void printNumbersDivisibleByThree(int from, int to){
        System.out.printf("Printing numbers in the range [%d,%d]\n", from, to);
        for (int i = from; i <= to; ++i){
            if (i%3 == 0){
                System.out.println(i);
            }
        }
    }

    //PART 3
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
    Function<Integer, Boolean> filter = x -> x%2==0;

    //PART 4
    Function<Integer, Boolean> divisibleByFive = new Function<Integer, Boolean>() {
        @Override
        public Boolean apply(Integer x) {
            return x % 5 == 0;
        }
    };
    Function<Integer, Boolean> divisibleByTen = x -> x % 10 == 0;

    //PART  5
    public static void printNumbers(int from, int to, int base) {
        Function<Integer, Boolean> divisibleByBase = x -> x%base==0;
        System.out.printf("Printing numbers in the range [%d,%d]\n", from, to);
        for(int i=from; i <= to; i++){
            if(divisibleByBase.apply(i)){
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


            //PART 5
            int base = Integer.parseInt(args[2]);
            printNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]), base);

            //PART 2
            /*if (Integer.parseInt(args[2]) == 2) {
                printEvenNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            }
            else {
                printNumbersDivisibleByThree(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            }
             */

        }
    }
}
