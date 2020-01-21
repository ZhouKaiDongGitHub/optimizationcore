package com.luban.part2;

public class NoNameClass {

    public static void main(String[] args) {
        NoNameClass noNameClass = new NoNameClass();
        noNameClass.test("logic code", new MyCallBack() {
            public void callback(String val) {
                System.out.println(val);
            }
        });
    }

    public void test(String val1, MyCallBack callBack){
        System.out.println("逻辑代码: "+val1);
        callBack.callback("回调代码：callback");
    }
}
