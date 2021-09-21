package DataDriverRshetty.DataDrivenExcelRShetty;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderByMe {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook("D:\\SeleniumWorkspace\\DataDrivenExcelRShetty\\TestData.xlsx");
		int totalsheets = workbook.getNumberOfSheets();
		System.out.println("Total sheets are:" + " " + totalsheets);
		XSSFSheet sheet = workbook.getSheet("C++");

		Iterator<Row> rows = sheet.iterator();
		Row firstrow = rows.next();
		Iterator<Cell> cellvalue = firstrow.cellIterator();
		int k = 0;
		int col = 0;
		while (cellvalue.hasNext()) {
			if (cellvalue.next().getStringCellValue().equalsIgnoreCase("Salary")) {

				col = k;
				System.out.println("Salary column is at: " + " " + col + "st index");

			}
			k++;

		}
		while (rows.hasNext()) {
			Row r = rows.next();

			if (r.getCell(col).getNumericCellValue() == 400000)

			{
				Iterator<Cell> cellu = r.cellIterator();
				while (cellu.hasNext()) {
					System.out.println("Cell value of shlok column and shree row is:" + " " + cellu.next());
				}
			}
		}
	}
}