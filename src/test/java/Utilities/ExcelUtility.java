package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelUtility {

    public static ArrayList< ArrayList< String > > getListData(String path, String sheetName, int columnCount){
        ArrayList< ArrayList< String > > tablo=new ArrayList<>();

        Workbook workbook=null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook= WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sayfa=workbook.getSheet(sheetName);

        for (int i = 0; i < sayfa.getPhysicalNumberOfRows(); i++) {

            ArrayList<String> satirData=new ArrayList<>();
            for (int j = 0; j < columnCount; j++) {
                satirData.add( sayfa.getRow(i).getCell(j).toString());
            }

            tablo.add(satirData);
        }

       return tablo;
    }

    // TODO:Bize verilen path, scenario, browserTipi, zaman   parametreleri ile
    // yeni bir excele bütün raporu yazacak, dosyanın varlığını veya yokluğu kontrol etmeyi google'dan bul!

    public static void writeExcel(String path, Scenario scenario, String browserName, String time) {

        File f=new File(path);

        if (!f.exists()){
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Sayfa1");
            Row newRow = sheet.createRow(0);

            Cell newCell = newRow.createCell(0);
            newCell.setCellValue(scenario.getName());

            newCell = newRow.createCell(1);
            newCell.setCellValue(scenario.getStatus().toString());

            newCell = newRow.createCell(2);
            newCell.setCellValue(browserName);

            newCell = newRow.createCell(3);
            newCell.setCellValue(time);

            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();  // hafıza boşaltıldı
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        else
        {
            FileInputStream inputStream= null;
            Workbook workbook=null;
            try {
                inputStream = new FileInputStream(path);
                workbook= WorkbookFactory.create(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Sheet sheet=workbook.getSheetAt(0);

            int rowCount = sheet.getPhysicalNumberOfRows(); // 6 satır var  0-5
            Row newRow = sheet.createRow(rowCount);

            Cell newCell = newRow.createCell(0);
            newCell.setCellValue(scenario.getName());

            newCell = newRow.createCell(1);
            newCell.setCellValue(scenario.getStatus().toString());

            newCell = newRow.createCell(2);
            newCell.setCellValue(browserName);

            newCell = newRow.createCell(3);
            newCell.setCellValue(time);

            try {
                inputStream.close();
                FileOutputStream outputStream=new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();  // hafıza boşaltıldı
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList< ArrayList< String > > tablo =
                getListData("src/test/java/ApachePOI/resource/ApacheExcel2.xlsx","testCitizen", 4);

        System.out.println("tablo = " + tablo);
    }
}
