package DataDriverRshetty.DataDrivenExcelRShetty;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelGanesh {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook("D:\\SeleniumWorkspace\\DataDrivenExcelRShetty\\TestData.xlsx");
		int totalsheets = workbook.getNumberOfSheets();
		System.out.println("Total sheets are:" + " " + totalsheets);
		XSSFSheet sheet = workbook.getSheet("Selenium");

		Iterator<Row> row = sheet.iterator();
		Row firstrow = row.next();
		Iterator<Cell> Firstrowcell = firstrow.cellIterator();
		int k = 0;
		int col = 0;
		while (Firstrowcell.hasNext()) {
			if (Firstrowcell.next().getStringCellValue().equalsIgnoreCase("Salunkhe")) {
				col = k;

			}
			k++;
		}
		System.out.println(col);
		
		while(row.hasNext())
		{
			Row rowsit  = row.next();
			if(rowsit.getCell(col).getStringCellValue().equalsIgnoreCase("Bagal"))
			{
				Iterator<Cell> cel = rowsit.cellIterator();
				while (cel.hasNext()) {
					System.out.println(cel.next().getStringCellValue());
				}
			}
			
			
		}

	}

}
