import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class URL_connection {

	public static void main(String[] args) {
		String path = System.getProperty("user.home")+"/Desktop/Azedine/bean_3.xml";
		System.out.println(path);
		try {
			// il faut installer le serveur web 
			//url 
			URL url = new URL("test.txt");
			System.out.println(URLEncoder.encode(path,"UTF-8"));
			System.out.println(URLEncoder.encode(path, "UTF-16"));
			System.out.println(url.getPort());
			System.out.println(url);
			//ouvrirla connection avec la resource 
			URLConnection url_connection = url.openConnection();
			InputStream flux = url_connection.getInputStream();
			int taille_flux = url_connection.getContentLength();
			for (;taille_flux !=0; taille_flux --) {
				System.out.println((char)flux.read());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}