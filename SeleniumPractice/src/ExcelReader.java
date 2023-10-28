import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("./TestData/TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		int sheetsCount = wb.getNumberOfSheets();
		
		for (int i=0 ;i<sheetsCount;i++) {
			if (wb.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = wb.getSheetAt(i);
				
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				
				Iterator<Cell> ce = firstrow.cellIterator();
				
				int k=0 ;
				int coloumn = 0;
				
				while(ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcase"))
					{
						coloumn = k;
						
					}
					k++;
				}
				System.out.println(coloumn);
				
				while(rows.hasNext()) {
					Row r = rows.next();
					if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("purchase")) {
						
						Iterator<Cell> cv = r.cellIterator();
						while(cv.hasNext()) {
							System.out.println(cv.next().getStringCellValue());
						}
						
					}
					
				}

				
				
			}
		}
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rowNo = sh.getLastRowNum();
		
				
	}
}
