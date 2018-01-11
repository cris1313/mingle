package demo.excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by owen on 2017/12/6.
 */
public class Shares {
    public static void main(String[] args) {
        String file = "C:\\Users\\owen\\Desktop\\test\\down.xlsx";
        try {
            read(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(String file) throws IOException {
        InputStream is = new FileInputStream(file);
        Workbook wb = new XSSFWorkbook(is);
        Sheet sheet = wb.getSheetAt(0);

        int rows = sheet.getLastRowNum();
        Row row = sheet.getRow(3);
        int cols = row.getPhysicalNumberOfCells();

        System.out.println(rows + " " + cols);

        Map<Integer, Integer> map = new HashMap<>();
        double[][] array = new double[rows + 3][cols + 3];

        for (int i = 2; i < rows; i++) {
            Row row1 = sheet.getRow(i);
            for (int j = 2; j < cols; j++) {
                if (row1==null) continue;
                double percent = Double.parseDouble(row1.getCell(j).toString());
                array[i][j] = percent;
            }
        }
        for (int i = 2; i < cols; i++) {
            map.put(i, 0);
            for (int j = 2; j < rows; j++) {
                if (array[j][i] <= -10)
                    map.put(i, map.get(i) + 1);
            }
        }
        //遍历这个map
        for (int i = 2; i < 100; i++) {
            System.out.println(sheet.getRow(1).getCell(i) + " " + map.get(i));
        }
        wb.close();

    }
}
