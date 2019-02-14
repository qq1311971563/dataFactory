package com.toolAnt.dataFactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptionUtilTest {

    @Test
    public void MD5() {
        System.out.println(EncryptionUtil.MD5("123456"));
        System.out.println(EncryptionUtil.MD5("a12390!"));
        System.out.println(EncryptionUtil.MD5("xiuxian100."));
        System.out.println(EncryptionUtil.MD5("29393"));
        System.out.println(EncryptionUtil.MD5("1230404"));
        System.out.println(EncryptionUtil.MD5("19970817..0"));
        System.out.println(EncryptionUtil.MD5("shangui..o"));
    }
}