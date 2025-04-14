package com.thetestingacademy.ex11_09042025_DataDrivenTesting_Part_1;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel {

    static Workbook book;
    static Sheet sheet;

    public static String SHEET_PATH = System.getProperty("user.dir")+ "/src/test/resources/TestData.xls";

    public static Object[][] getTestDataFromExcel(String sheetName) throws IOException {

        FileInputStream file = null;
        try {
            file = new FileInputStream(SHEET_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        book = WorkbookFactory.create(file);
        sheet = book.getSheet(sheetName);

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                data[i][j] = sheet.getRow(i+1).getCell(j).toString();

            }
        }

        return data;
    }

//    public static Object[][] getTestDataFromSQL(String sheetName){
//
//        return null;
//    }

    @DataProvider
    public Object[][] getData() throws IOException {
         return getTestDataFromExcel("Sheet1");
        // return getTestDataFromSQL("Sheet1");
    }

}

