package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poi_excels {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("firstSheet");
		Row row0 = sheet0.createRow(1);
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		
		cellA.setCellValue("F1 cell");
		cellB.setCellValue("S1 cell");
		
		File f = new File("./src/main/java/props/xyz.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		
		System.out.println("File must be created");
		
		workbook.close();
	}
}
