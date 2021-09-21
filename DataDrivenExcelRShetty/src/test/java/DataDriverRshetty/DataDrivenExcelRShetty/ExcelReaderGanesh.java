package DataDriverRshetty.DataDrivenExcelRShetty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class ExcelReaderGanesh {

	public ArrayList<String> Excelreader(String TestcaseName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		XSSFWorkbook workbook = new XSSFWorkbook("D:\\SeleniumWorkspace\\DataDrivenExcelRShetty\\TestData.xlsx");
		int totalsheets = workbook.getNumberOfSheets();
		XSSFSheet sheet = workbook.getSheet("Cities");

		Iterator<Row> rows = sheet.iterator();
		Row firstrow = rows.next();
		Iterator<Cell> firstrowCell = firstrow.cellIterator();
		int k = 0;
		int col = 0;
		while (firstrowCell.hasNext()) {
			if (firstrowCell.next().getStringCellValue().equalsIgnoreCase("Satara")) {
				col = k;
			}
			k++;
		}
		while (rows.hasNext()) {
			Row r = rows.next();
			if (r.getCell(col).getStringCellValue().equalsIgnoreCase(TestcaseName)) {

				Iterator<Cell> c = r.cellIterator();
				while (c.hasNext()) {

					Cell cellT = c.next();
					if (cellT.getCellType() == CellType.STRING) {

						a.add(cellT.getStringCellValue());

					} else {

						a.add(NumberToTextConverter.toText(cellT.getNumericCellValue()));

					}
				}

			}
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		ExcelReaderGanesh abc = new ExcelReaderGanesh();

		ArrayList data = abc.Excelreader("Mhaswad");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		System.out.println(data.get(4));
		// driver.findelement(By.xpath("hsbhbs")).sendkeys(data.get(0));

	}
}