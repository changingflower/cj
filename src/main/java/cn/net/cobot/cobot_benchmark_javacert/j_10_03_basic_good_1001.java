package cn.net.cobot.cobot_benchmark_javacert;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;

//check type:java
public class j_10_03_basic_good_1001 {
	
	private Reference PendingGenerationMarker = null;
	
    public void main(String[] args) {
    	Map<String, Object> cache = new HashMap<String, Object>();
        synchronized (cache) {
            do {
            	String key = args[0];
                Object value = cache.get(key);
                if (value instanceof Reference) {
                	Proxy proxy = (Proxy) ((Reference) value).get();
                    if (proxy != null)
                        return;
                }

                if (value == PendingGenerationMarker) {
                    try {
                        cache.wait();
                    } catch (InterruptedException e) {
                    }
                } else {
                    cache.put(key, PendingGenerationMarker);
                    break;
                }
            } while (true);
        }
    }
}
class Reference{
	
	public Object get(){
		return null;
	}
	
}