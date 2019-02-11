package com.toolAnt.dataFactory;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println(Test.class.getResource("/"));
        LocalUtil lu = LocalUtil.getInstance();
        List<String> list = lu.getCities("中国", "广东");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }
    }
}
