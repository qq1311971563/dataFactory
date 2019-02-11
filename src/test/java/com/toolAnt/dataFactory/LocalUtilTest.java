package com.toolAnt.dataFactory;

import org.junit.Test;

import java.util.List;

public class LocalUtilTest {

    LocalUtil lu = LocalUtil.getInstance();

    @Test
    public void getCountry() {
        forOut(lu.getCountry());
    }

    @Test
    public void getProvinces() {
        forOut(lu.getProvinces("中国"));
    }

    @Test
    public void getCities() {
        forOut(lu.getCities("中国", "广东"));
        System.out.println();
        forOut(lu.getCities("中国", "陕西"));
        System.out.println();
        forOut(lu.getCities("中国", "香港"));
        System.out.println();
    }

    @Test
    public void getAreas() {
        forOut(lu.getAreas("中国", "陕西", "西安"));
        System.out.println();
        forOut(lu.getAreas("中国", "陕西", "渭南"));
        System.out.println();
        forOut(lu.getAreas("中国", "香港", "香港"));
    }

    private void forOut(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}