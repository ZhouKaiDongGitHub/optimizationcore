package com.luban.part2;

import java.util.function.Consumer;
import java.util.function.Function;

public class NoNameClass4 {

    public static void main(String[] args) {
        NoNameClass4 noNameClass = new NoNameClass4();
        Consumer<String> consumer  = s -> System.out.println(s);
        consumer.accept("kzhou");
    }

    public void test1(String val1, Consumer consumer){
        System.out.println("逻辑代码: "+val1);
        consumer.accept("kzhou");
    }
}
