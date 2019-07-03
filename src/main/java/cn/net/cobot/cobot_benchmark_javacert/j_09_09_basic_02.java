package cn.net.cobot.cobot_benchmark_javacert;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

//check type:java

public class j_09_09_basic_02 {

	// Class Page is defined separately.
	// It stores and returns the Page name via getName()
	Page[] pageBuff = new Page[111];

	public synchronized boolean func_09_09_basic_02_bad(Socket socket, String pageName) throws IOException {
		// Get the output stream to write the Page to
		ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

		// Find the Page requested by the client
		// (this operation requires synchronization)
		Page targetPage = null;
		for (Page p : pageBuff) {
			if (p.getName().compareTo(pageName) == 0) {
				targetPage = p;
			}
		}

		// Requested Page does not exist
		if (targetPage == null) {
			return false;
		}

		// Send the Page to the client
		// (does not require any synchronization)
		out.writeObject(targetPage);                             //not compliant

		out.flush();
		out.close();
		return true;
	}
}
class Page{
	public void page() {
	}
	public String getName(){return "";}
}