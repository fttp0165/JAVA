package excelRead;

import java.io.IOException;
import java.util.List;

public class testDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName ="D:\\Program Files\\JAVA\\tmp\\read.xlsx";
		String WfileName ="D:\\Program Files\\JAVA\\tmp\\write.xlsx";
		DataHelp dataHelp =new DataHelpImp();
		List<String[]> list = dataHelp.getData();
		
		try {
			ExcellUtil.readFile(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ExcellUtil.writeFile(WfileName,list);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Write Exvel end");

	}

}
