package com.Prammiter;

//import org.omg.CORBA.Object;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.print("name:" + name + ";  age :" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"hujjiang", 10},
                {"hujjiang", 20},
                {"hujjian1g", 30}};
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.print("test1方法  name:" + name + " agr:" + age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.print("test2方法  name:" + name + " agr:" + age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"hujiang", 33}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"hujiang", 44}
            };


        }
        return result;
    }
}