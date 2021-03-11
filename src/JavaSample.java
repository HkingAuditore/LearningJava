import Unit.Hero;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;

public class JavaSample {
    public static void Print(String content) {
        System.out.println(content);
    }


    public static void main(String[] args) {
       CalculateAverage();
    }

    private static boolean CalculateAverage() {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        try {
            Print("a:");
            a = scanner.nextInt();
            Print("b:");
            b = scanner.nextInt();
            Print("c:");
            c = scanner.nextInt();

        }catch (Exception e){
            Print("错误的输入，请输入整数！");
            return false;
        }
        Print("" + JavaSample.GetAverage(a,b,c));
        return true;
    }


    private static double GetAverage(int ... args){
        double result = 0;
        Arrays.stream(args).forEach(x -> result += x);
        return Arrays.stream(args).average().getAsDouble();
    }
}
