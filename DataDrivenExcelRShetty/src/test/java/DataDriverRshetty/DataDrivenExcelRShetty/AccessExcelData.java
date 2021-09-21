package DataDriverRshetty.DataDrivenExcelRShetty;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AccessExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook = new XSSFWorkbook("D:\\SeleniumWorkspace\\DataDrivenExcelRShetty\\TestData.xlsx");
		System.out.println("Total avaialable sheets are in excel : " + " " + workbook.getNumberOfSheets());
		int totalSheets = workbook.getNumberOfSheets();
		System.out.println("Total sheets stored in veriable :" + " " + totalSheets);
		for (int i = 0; i < totalSheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("Ruby")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				// Identifying the Textcases column by scanning the entire first row
				Iterator<Row> row = sheet.iterator();
				Row firstrow = row.next();
				Iterator<Cell> cellvalue = firstrow.cellIterator();
				System.out.println(cellvalue.next());
				int k = 0;
				int column = 0;
				while (cellvalue.hasNext()) {
					Cell celllabel = cellvalue.next();
					if (celllabel.getStringCellValue().equalsIgnoreCase("Testcases")) {
						System.out.println(celllabel);
						column = k;

					}
					k++;
				}
				System.out.println("Testcases column number is :" + " " + column);
				// once column is identify then scan the entire testcase column to find all the values
				while (row.hasNext()) {
					Row r = row.next();

					if (r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase")) {
						// Grab all the values of purchase column
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							System.out.println("All the values of purchange column is " + " " + cv.next().getStringCellValue());
						}

					}

				}
			}

		}
	}
}
