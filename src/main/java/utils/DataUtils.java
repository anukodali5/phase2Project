package utils;

import java.io.File;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class DataUtils {

	public static String getTestData(String sheetName, String fieldName) throws Exception {
		// System.out.println("our execution env is :" + System.getProperty("env"));
		String result = "unable to access data";

		String datFilePath = System.getProperty("user.dir") + File.separator + "resources" + File.separator
				+ "TestDataStage.xlsx";

		try {
			Fillo fillo = new Fillo();

			Connection connection = fillo.getConnection(datFilePath);

			String query = "select * from " + sheetName + " where ID='" + fieldName + "'";

			Recordset resultSet = connection.executeQuery(query);

			while (resultSet.next()) {
				result = resultSet.getField("Value");
			}

			resultSet.close();
			connection.close();
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

	/*
	 * @Test public void testdataextraction() throws Exception {
	 * 
	 * System.out.println(getTestData("Config", "BaseUrl"));
	 * 
	 * }
	 */

}
