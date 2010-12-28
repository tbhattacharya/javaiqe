/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiqe_test;

import com.iqengines.javaiqe.IQEApi;
import com.iqengines.javaiqe.IQEApi.IQEQuery;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Vincent
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String KEY = "936891a7e7d94c0f9a3ae3a4f58f1a61";
        final String SECRET = "e00368a0243647d0a81355d6fd36994f";

        /*
         * An API object is initialized using the API key and secret
         */
        iqe = new IQEApi(KEY, SECRET);

        /*
         * You can quickly query an image and retrieve results by doing:
         */

        //upload1();
        
        File test_file = new File("img/biere1.jpg");
        
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

    public static void upload1() {
        ArrayList<File> images = new ArrayList();
        images.add(new File("img/biere1.jpg"));
        String name = "Biere Anja";
        String custom_id = "anja_0001";
        String meta = "{'jahr': 2005, 'marque': 'Art & Image'}";

        //System.out.println("Upload : " + iqe.upload(images, name, custom_id, meta, true, null));
        System.out.println("Upload : " + iqe.upload(images, name));
    }

    public static void upload2() {
        ArrayList<File> images = new ArrayList();
        images.add(new File("img/upload/training/training_montre1.jpg"));
        images.add(new File("img/upload/training/training_montre2.jpg"));
        images.add(new File("img/upload/training/training_montre3.jpg"));
        images.add(new File("img/upload/training/training_montre4.jpg"));

        String name = "Anja's Rosendahl Uhr";
        String custom_id = "anja0002";
        String meta = "{'jahr': '2010'}";

        //System.out.println("Upload : " + iqe.upload(images, name, custom_id, meta, true, null));
        System.out.println("Upload : " + iqe.upload(images, name));
    }

    public static void upload3() {
        ArrayList<File> images = new ArrayList();
        images.add(new File("img/IMG_7406.jpg"));
        String name = "Vincent's pioneer";
        System.out.println("Upload : " + iqe.upload(images, name));
    }

    public static void uploadJSON() {
        ArrayList<File> images = new ArrayList();
        images.add(new File("img/IMG_7406.jpg"));
        String name = "Vincent's pioneer";

        System.out.println("Upload : " + iqe.upload(images, name));
    }

    private static IQEApi iqe = null;

}
