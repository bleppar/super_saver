import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileSender {

	private static final String host = "localhost";
	
	private static final int port = 4700;

	
	public static String getHost() {
		return host;
	}


	public static int getPort() {
		return port;
	}


	public static void main(String[] args) {
		File fileToSend;
		InputStream fileStream = new BufferedInputStream(fileToSend);

		Socket connection = new Socket(host, port);
		OutputStream out = connection.getOutputStream();
	}
}
