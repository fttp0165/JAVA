package excelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellUtil {
	
	public static void readFile(String fileName)throws IOException{
		InputStream is =new FileInputStream(new File(fileName));
		XSSFWorkbook wb =new XSSFWorkbook(is);
		
		
	}
}
