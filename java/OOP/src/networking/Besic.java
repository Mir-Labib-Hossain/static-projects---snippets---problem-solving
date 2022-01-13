package networking;
import java.net.MalformedURLException; 
import java.net.URL; 
public class Besic { 
  public static void main(String[] args) throws MalformedURLException { 
        URL url = new URL("https://www.facebook.com/settings?tab=location#java"); 

        System.out.println("URL is          " + url.toString()); 
        System.out.println("protocol is     " + url.getProtocol()); 
        System.out.println("authority is    " + url.getAuthority()); 
        System.out.println("file name is    " + url.getFile()); 
        System.out.println("host is         " + url.getHost()); 
        System.out.println("path is         " + url.getPath()); 
        System.out.println("port is         " + url.getPort()); 
        System.out.println("default port is " + url.getDefaultPort()); 
        System.out.println("query is        " + url.getQuery()); 
        System.out.println("ref is          " + url.getRef()); 
    } 
 }
