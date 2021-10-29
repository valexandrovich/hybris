package com.hybris.valexandrovich.java_se.lecture_57_58;

import com.hybris.valexandrovich.Logger;

public class Application {
    public static void main(String[] args) {

        Logger.addLine("------- " + Application.class.getName() + " -------");
        Human tom = new Human();
//        tom.walk();

        Robot wale = new Robot();
//        wale.walk();

        walker(() -> System.out.println("Custom object walking ... "));
        walker(() -> Logger.addLine("Custom object walking ... "));

        Walkable aBlockOfCode = new Walkable() {
            @Override
            public void walk() {
                System.out.println("Custom object walking ... ");
                System.out.println("The object tripped ... ");
                Logger.addLine("Custom object walking ... ");
                Logger.addLine("The object tripped ... ");
            }
        };
        aBlockOfCode.walk();

        ALambdaInterface helloVar = () -> {
            System.out.println("Hello there .. ");
            Logger.addLine("Hello there .. ");
        };
        helloVar.someMethod();

        Calculate sumVar = (a, b) -> a + b;
        System.out.println(sumVar.compute(4, 6));
        Logger.addLine(String.valueOf(sumVar.compute(4, 6)));


        Calculate nonZeroDivider = (a, b) -> {
            if (b == 0) {
                return 0;
            } else {
                return a / b;
            }
        };
        System.out.println(nonZeroDivider.compute(10, 5));
        Logger.addLine(String.valueOf(nonZeroDivider.compute(10, 5)));

        MyGenericInterface<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println(reverse.work("Vehicle"));
        Logger.addLine(reverse.work("Vehicle"));

        MyGenericInterface<Integer> factorialNum = (num) -> {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(factorialNum.work(10));
        Logger.addLine(String.valueOf(factorialNum.work(10)));
    }

    static void walker(Walkable walkable) {
        walkable.walk();
    }
}

interface Calculate {
    int compute(int a, int b);
}

interface StringWorker {
    String work(String str);
}

interface NumberWorker {
    int compute(int num);
}

interface MyGenericInterface<T> {
    T work(T var);
}
