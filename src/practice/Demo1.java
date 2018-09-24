package practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		Workbook w = WorkbookFactory.create(new File("./data/PracticeBook1.xls"));
		Cell c = w.getSheet("sheet1").getRow(1).getCell(1);
		String v = c.getStringCellValue();
		System.out.println(v);
	}
}