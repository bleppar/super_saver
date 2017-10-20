import java.net.ServerSocket;
import java.net.Socket;

public class FileReciever {
	
	int port=4700;
	ServerSocket serverSoc;
	Socket connection;
	
	try{
	ServerSocket serverSoc = new ServerSocket(port);

	Socket connection = serverSoc.accept();
}
catch(Exception e){
	e.printStackTrace();
}
}
}