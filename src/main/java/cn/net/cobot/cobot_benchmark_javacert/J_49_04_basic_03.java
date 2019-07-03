package cn.net.cobot.cobot_benchmark_javacert;
import java.net.InetAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.SSLSocket;

class HashMetaData {
  private Map<SSLSocket, InetAddress> m = Collections.synchronizedMap(
      new HashMap<SSLSocket, InetAddress>());
 
  public void storeTempConnection(SSLSocket sock, InetAddress ip) {
    m.put(sock, ip);	//not compliant 
  }
 
  public void removeTempConnection(SSLSocket sock) {
    m.remove(sock); 
  }
}