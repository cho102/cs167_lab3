package edu.ucr.cs.cs167.cho102;

/**
 * Hello world!
 *
 */
import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class App
{
    static class IsEven implements Function<Integer, Boolean> {
        @Override
        public Boolean apply(Integer x) {
            return x % 2 == 0;
        }
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
            if (Integer.parseInt(args[2]) == 2) {
                printEvenNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            }
            else {
                printNumbersDivisibleByThree(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            }
        }
        System.out.println( "Hello World!" );
    }
}
