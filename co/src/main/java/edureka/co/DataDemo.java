package edureka.co;

import java.io.FileInputStream;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


class ExcelUtils{
	static FileInputStream fs;
	static HSSFWorkbook bk;
	
public static void setExcelfile(){

	try {
		fs= new FileInputStream("/Users/haribabuchidipothu/Documents/Selenium/DataEng.xls");
		 bk = new HSSFWorkbook(fs);
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
						} 
	}

public static String getCellData(int rowNum, int colNum, String sheetName) throws Exception{
	
	try {
		HSSFSheet s1 = bk.getSheet("Data");
		String cellData = s1.getRow(rowNum).getCell(colNum).getStringCellValue();
		return cellData;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return "";
	}
}

public static int getRowCount(String sheetName){
	HSSFSheet s1 = bk.getSheet("Data");
	int irowCount =s1.getLastRowNum();
	return irowCount;
}


public static int getTestcaseStart(String sTestcase, int colNum, String sheetName) throws Exception{
	int iStrartRow=0;
	
	int rowCount = ExcelUtils.getRowCount(sTestcase);
	for (; iStrartRow<=rowCount; iStrartRow++){
		if (ExcelUtils.getCellData(iStrartRow, colNum, sheetName).equalsIgnoreCase(sTestcase)){
			return iStrartRow;
		}
		
	}
	return iStrartRow;
}

public static int getTestcaseLast(String sTestcase, int colNum, String sheetName) throws Exception{
	int iTestCaseStart =ExcelUtils.getTestcaseStart(sTestcase, colNum, sheetName);
	
	int rowCount = ExcelUtils.getRowCount(sTestcase);
	for (int i =iTestCaseStart; i<=rowCount; i++){
		if (!ExcelUtils.getCellData(i, colNum, sheetName).equalsIgnoreCase(sTestcase)){
			int iLastRow = i;
			return iLastRow;
		}
		
	}
	int iLastRow  =rowCount;
	return iLastRow;
}



}


public class DataDemo {

	public static void main(String[] args) throws Exception{
		// /Users/haribabuchidipothu/Documents/Selenium/DataEng.xlsx 
		try{
		
			ExcelUtils.setExcelfile();
			String cVal =ExcelUtils.getCellData(2, 1, "Data");
//			int iStart =ExcelUtils.getTestcaseStart("Sel_TC1", 0, "Data");
//			int iLast =ExcelUtils.getTestcaseLast("Sel_TC1", 0, "Data");
//			System.out.println("Test case Start row "+iStart);
//			System.out.println("Test case Last row "+iLast);
			System.out.println(cVal);
			}
			catch(Exception e){
				e.printStackTrace();
							}

		

	}

}
