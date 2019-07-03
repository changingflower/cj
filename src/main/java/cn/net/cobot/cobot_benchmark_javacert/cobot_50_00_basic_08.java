package cn.net.cobot.cobot_benchmark_javacert;
//check type:java
public class cobot_50_00_basic_08 {
	
	private ViewPager pager;
	
	public void setViewPager(ViewPager pager) {
		 OnPageChangeListener pageListener = null;
		 this.pager = pager;
		 if (pager.getAdapter() == null) {
			 throw new IllegalStateException("ViewPager does not have adapter instance.");
		 }
		 pager.setOnPageChangeListener(pageListener);	//not compliant
	}
	
	public ViewPager getPager() {
		return pager;
	}

}

class OnPageChangeListener{}


class ViewPager{
	
	public void setOnPageChangeListener(OnPageChangeListener pageListener){};
	
	public String getAdapter(){
		return "adapter";
	};
	
}
