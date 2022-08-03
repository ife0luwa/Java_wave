package Java_Network_Programming.HighLevelAPIs;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class UriExample {
    public static void main(String[] args) {

        try {
            String mail = "https://twitter.com/Covenant____/media";
            String link = "db://username:password@myserver.com:5000/catalogue/phones?os=android#samsung";
            URI uri = new URI(mail);

            URL myUrl = uri.toURL();
            System.out.println("URL: " + myUrl);

//            System.out.println("Scheme: " + uri.getScheme());
//            System.out.println("Scheme-specific-part: " + uri.getSchemeSpecificPart());
//            System.out.println("Authority: " + uri.getAuthority());
//            System.out.println("User info: " + uri.getUserInfo());
//            System.out.println("Host: " + uri.getHost());
//            System.out.println("Port: " + uri.getPort());
//            System.out.println("Path: " + uri.getPath());
//            System.out.println("Query: " + uri.getQuery());
//            System.out.println("Fragment: " + uri.getFragment());

        } catch (URISyntaxException e) {
            e.getMessage();
        } catch (MalformedURLException e) {
            System.out.println("URL error: "+ e.getMessage());
        }
    }
}
