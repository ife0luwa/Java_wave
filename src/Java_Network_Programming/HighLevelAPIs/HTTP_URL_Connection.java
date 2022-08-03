package Java_Network_Programming.HighLevelAPIs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class HTTP_URL_Connection {
    public static void main(String[] args) {
        try {
            URL myUrl = new URL("https://en.wikipedia.org/wiki/List_of_HTTP_header_fields");

            HttpURLConnection myConnection = (HttpURLConnection) myUrl.openConnection();
            myConnection.connect();
            myConnection.setRequestMethod("GET");
            System.out.println("here");
            myConnection.setRequestProperty("User agent", "Chrome");
            myConnection.setConnectTimeout(30000);

            int responseCode = myConnection.getResponseCode();
            System.out.println("Response code: " + responseCode);

            if(responseCode != 200) {
                System.out.println("Error occurred while loading page");
                return;
            }

            BufferedReader inputData = new BufferedReader(new InputStreamReader(myConnection.getInputStream()));
            String line;

            while ((line = inputData.readLine()) != null) {
                System.out.println(line);
            }

            inputData.close();







        } catch (MalformedURLException e) {
            System.out.println("Url error: " + e.getMessage());
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
