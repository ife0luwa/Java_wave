package Java_Network_Programming.HighLevelAPIs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class ReadFromUrl {
    public static void main(String[] args) {
        try {
            URL myUrl = new URL("https://twitter.com/Covenant____/media");

            /* Alternative way to read from a URL */
            URLConnection urlConnection = myUrl.openConnection();
            urlConnection.connect();


            /* read twitter headers */
            Map<String, List<String>> twitterHeaderFields = urlConnection.getHeaderFields();
            for(Map.Entry<String, List<String>> eachHeader : twitterHeaderFields.entrySet()) {
                String eachHeaderKey = eachHeader.getKey();
                List<String> eachHeaderValue = eachHeader.getValue();
                System.out.println("***** key: " + eachHeaderKey);
                for(String value : eachHeaderValue) {
                    System.out.println("*** value: " + value);
                }
            }


//            BufferedReader outputData = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//            String myData = "";
//            while(myData != null) {
//                myData = outputData.readLine();
//                System.out.println(myData);
//            }
//            outputData.close();


//            BufferedReader outputData = new BufferedReader(new InputStreamReader(myUrl.openStream()));
//            String myData = "";
//            while(myData != null) {
//               myData = outputData.readLine();
//                System.out.println(myData);
//            }
//            outputData.close();

        } catch (MalformedURLException e) {
            System.out.println("Url error: " + e.getMessage());
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
