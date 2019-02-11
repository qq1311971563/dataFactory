package com.toolAnt.dataFactory;

import org.junit.Test;

public class FieldFactoryTest {

    @Test
    public void genName() {
        for (int i = 0; i < 10; i++) {
            System.out.println(FieldFactory.genName());
        }
    }

    @Test
    public void genName1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(FieldFactory.genName(0) + "-----" + FieldFactory.genName(1));
        }
    }

    @Test
    public void genEmail(){
        for (int i = 0; i < 10; i++) {
            System.out.println(FieldFactory.genEmail(4,10));
        }
    }

    @Test
    public void genAddress(){
        for (int i = 0; i < 100; i++) {
            System.out.println(FieldFactory.genAddress());
        }
    }
    @Test
    public void getAddress(){

    }
}