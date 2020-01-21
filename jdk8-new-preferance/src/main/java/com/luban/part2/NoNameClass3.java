package com.luban.part2;

import java.util.function.Consumer;
import java.util.function.Function;

public class NoNameClass3 {

    public static void main(String[] args) {
        NoNameClass3 noNameClass = new NoNameClass3();
        noNameClass.test1("logic code",(String name)->{
            Kzhou kzhou = new Kzhou();
            kzhou.setName("kzhou");
            kzhou.setPassword("11111");
            return kzhou;
        });
        noNameClass.test2("logic code",(Kzhou kzhou)->{
            System.out.println("消费了kzhou");
        });
    }

    /**
     * 接收一个输入参数，返回一个结果 Function
     */
    public void test1(String val1, Function<String,Object> function){
        System.out.println("逻辑代码: "+val1);
        Object o = function.apply("kzhou");
        System.out.println(o.toString());

    }
    /**
     * 接收一个输入参数，无返回结果 Consumer
     */
    public void test2(String val1, Consumer<Kzhou> consumer){
        System.out.println("逻辑代码: "+val1);
        Kzhou kzhou = new Kzhou();
        consumer.accept(kzhou);
    }
    /**
     * 接收一个输入参数，返回一个布尔  Predicate
     */
   /* public void test3(String val1, MyCallBack callBack){
        System.out.println("逻辑代码: "+val1);
        callBack.callback();
    }*/
    /**
     * 接无参数，返回一个结果 Supplier
     */
    /*public void test4(String val1, MyCallBack callBack){
        System.out.println("逻辑代码: "+val1);
        callBack.callback();
    }*/
}
