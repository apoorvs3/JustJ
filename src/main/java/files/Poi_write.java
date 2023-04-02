package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poi_write {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("firstSheet");

		for (int rows = 0; rows < 10; rows++) {
			Row row = sheet0.createRow(rows);
			for (int cols = 0; cols < 10; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue(Math.random()*100);
			}
		}
		File f = new File("./src/main/java/props/xyz.xlsx");
		FileOutputStream fis = new FileOutputStream(f);
		workbook.write(fis);
		
		workbook.close();
	}
}
