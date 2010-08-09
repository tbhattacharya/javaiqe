import java.io.File;

import com.iqengines.javaiqe.IQEApi;
import com.iqengines.javaiqe.IQEApi.IQEQuery;


public class test_api {

	public static void main(String[] args) {
		final String KEY = "YOUR KEY";
		final String SECRET = "YOUR SECRET";
		
		/*
		 * An API object is initialized using the API key and secret
		 */
		IQEApi iqe = new IQEApi(KEY, SECRET);
		
		/*
		 * You can quickly query an image and retrieve results by doing:
		 */
		File test_file = new File("wine.jpg");
		
		// Query
		IQEQuery query = iqe.query(test_file);
		System.out.println("query.result : " + query.getResult());
		System.out.println("query.qid : " + query.getQID());
		
		// Update
		String update = iqe.update();
		System.out.println("Update : " + update);
		
		// Result
		String result = iqe.result(query.getQID());
		System.out.println("Result : " + result);
	}

}
