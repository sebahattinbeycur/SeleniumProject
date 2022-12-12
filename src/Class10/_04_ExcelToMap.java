package Class10;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class _04_ExcelToMap {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("Sheet1");

        //Pre-requisite: Before I start looping data (cells) first I need to identify total number of ROWS & COLUMNS

        int rows = sheet1.getPhysicalNumberOfRows();                // <--- Retrieve total number of the ROWS in a given sheet
        System.out.println("rows = " + rows);
        int columns = sheet1.getRow(0).getLastCellNum();        // <--- Retrieve total number of the COLUMNS in a given sheet
        System.out.println("columns = " + columns);

        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 1; i < rows; i++) {                       // Must start from row 1, because row 0 is for Header which we get it manually
            for (int j = 0; j < columns; j++) {
                String key = sheet1.getRow(0).getCell(j).toString();
                String value = sheet1.getRow(i).getCell(j).toString();
                map.put(key, value);
            }

//                System.out.println(key + ": " + value);          // todo 2nd way
//            }
//                System.out.println();                                // todo 2nd way
//            }
//            System.out.println(map);                             // todo 1st way

            Set<Map.Entry<String, String>> entries = map.entrySet();
            for (Map.Entry<String, String> entry : entries){
//                System.out.println(entry);
                System.out.println(entry.getKey() + ": " + entry.getValue());     // todo 3rd way
            }
            System.out.println();                                                 // todo 3rd way
        }
    }
}
