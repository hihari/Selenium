package edureka.co;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class Test    {
	
	
	
	
	public static void main(String[] args) throws IOException  {

		FileInputStream fs;
		HSSFWorkbook wb;
		

			fs = new FileInputStream("/Users/haribabuchidipothu/Documents/Selenium/DataEng.xls");
			wb = new HSSFWorkbook(fs);

		

			HSSFSheet ws = wb.getSheet("Test");
			int totalRow = ws.getLastRowNum();
			System.out.println(totalRow);
			int totalCol = ws.getRow(0).getLastCellNum();
			System.out.println(totalCol);
			String[][] dataset = null;
			for (int i = 1; i < totalRow+1; i++) {

				
				dataset = new String[totalRow + 1][totalCol];
				for (int j = 0; j < totalCol; j++) {
					dataset[i][j] = ws.getRow(i).getCell(j).getStringCellValue();
					System.out.println(dataset[i][j]);
				}
			}

			
			
		

		}

	
		
		
		
		
		
	}
		
		
	
	
	
