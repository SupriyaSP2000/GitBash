package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcel {

	public static void main(String[] args) throws Throwable {
		
		//step1:- path connection
				FileInputStream fis = new FileInputStream("C:\\Users\\SUPRIYA PERIYASAMY\\Desktop\\QSpiders\\Java Selenium\\TestData.xlsx");
				
				//step2:- excel sheet in read mode
				Workbook book = WorkbookFactory.create(fis);
				
				//step3:- control on the sheet
				Sheet sheet = book.getSheet("Sheet1");
				
				//step4:- control on the row
				Row row = sheet.createRow(5);
				
				//step5:- control on the cell
				Cell cell = row.createCell(2);
				
				cell.setCellValue("TeatYantra");
				
				//Excel in Write mode:-
				FileOutputStream fes = new FileOutputStream("C:\\Users\\SUPRIYA PERIYASAMY\\Desktop\\QSpiders\\Java Selenium\\TestData.xlsx");
				book.write(fes);
				book.close();
	}
}
