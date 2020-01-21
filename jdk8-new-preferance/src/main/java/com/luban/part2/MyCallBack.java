package com.luban.part2;

public interface MyCallBack {
    void callback(String val);
    default Kzhou testDefaultMethod(){
        Kzhou kzhou = new Kzhou();
        kzhou.setName("luban");
        kzhou.setPassword("11111");
        return kzhou;
    }
}
