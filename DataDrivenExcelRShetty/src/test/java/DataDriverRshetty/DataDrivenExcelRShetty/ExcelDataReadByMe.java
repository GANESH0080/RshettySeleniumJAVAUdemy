package DataDriverRshetty.DataDrivenExcelRShetty;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReadByMe {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook("D:\\SeleniumWorkspace\\DataDrivenExcelRShetty\\TestData.xlsx");
		int totalsheets = workbook.getNumberOfSheets();
		System.out.println("Total sheets are :" + " " + totalsheets);
		for (int i = 0; i < totalsheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("Java"))

			{
				XSSFSheet sheets = workbook.getSheetAt(i);
				Iterator<Row> rows = sheets.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> cv = firstrow.cellIterator();
				int column = 0;
				int k = 0;
				while (cv.hasNext()) {
					Cell cellvalue = cv.next();
					if (cellvalue.getStringCellValue().equalsIgnoreCase("Shlok")) {

						column = k;
						System.out.println("Shlok coumn is avaialbe at :" + column);
					}
					k++;
				}
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase("Shree")) {
						Iterator<Cell> cellu = r.cellIterator();
						while (cellu.hasNext()) {
							System.out.println(
									"Cell value of shlok column and shree row is:" +" "+ cellu.next().getStringCellValue());
						}
					}
				}

			}

		}
	}
}
