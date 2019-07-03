package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
//import cn.net.cobot.cobot_java_checker.rule.cobot_08_00.RecyclerView;

public class cobot_50_00_basic_05 {
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		OnScrollListener ol = new OnScrollListener();
		RecyclerView mList = null;
		mList.setOnScrollListener(ol);	//not compliant
	}
	
}


class OnScrollListener{}

class RecyclerView{
	public void setOnScrollListener(OnScrollListener ol){};
}