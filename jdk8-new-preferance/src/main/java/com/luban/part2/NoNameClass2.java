package com.luban.part2;

public class NoNameClass2 {

    public static void main(String[] args) {
        NoNameClass2 noNameClass = new NoNameClass2();
        noNameClass.test("logic code", (String val)->{
            System.out.println(val);
        });
    }

    public void test(String val1, MyCallBack callBack){
        System.out.println("逻辑代码: "+val1);
        callBack.callback("回调代码：callback");
    }
}