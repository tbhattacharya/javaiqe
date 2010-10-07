import java.io.File;

import com.iqengines.javaiqe.IQEApi;
import com.iqengines.javaiqe.IQEApi.IQEQuery;


public class test_api {

	public static void main(String[] args) {
		final String KEY = "936891a7e7d94c0f9a3ae3a4f58f1a61";
		final String SECRET = "e00368a0243647d0a81355d6fd36994f";
		
		/*
		 * An API object is initialized using the API key and secret
		 */
		IQEApi iqe = new IQEApi(KEY, SECRET);
		
		/*
		 * You can quickly query an image and retrieve results by doing:
		 */
		File test_file = new File("img/palerider.jpg");
		
		// Query
		IQEQuery query = iqe.query(test_file);
		System.out.println("query.result : " + query.getResult());
		System.out.println("query.qid : " + query.getQID());
		
		// Update
		String update = iqe.update();
		System.out.println("Update : " + update);
		
		// Result
		String result = iqe.result(query.getQID(), true);
		System.out.println("Result : " + result);
	}

}
