package com.thetestingacademy.ex11_09042025_DataDrivenTesting_Part_1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataDrivenTesting {

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
              new  Object[]{"admin@gmail.com","pass123"},
              new Object[]{"admin123@gmail.com","pass123"}
        };

    }

    @Test(dataProvider = "getData")
    public void loginTest(String email, String password){
        System.out.println(email + " | " + password);
    }


}
