package All_Script;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_Drivan_Testing {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs =new FileInputStream("F:\\Manual Assignment_TC.xlsx"); 
		Workbook book = WorkbookFactory.create(fs);
		Sheet sh = book.getSheet("Functional Testing");
		Row ro = sh.getRow(50);
	   Cell cel = ro.getCell(7);
	    double value = cel.getNumericCellValue();
	   System.out.println(value);
		
	

	}

}
