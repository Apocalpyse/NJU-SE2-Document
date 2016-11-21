
public class MockOrder {
	String orderName;
	int orderTime;
	String evaluate;


	 public MockOrder(String name,int time,String eva){
		 orderName=name;
		 orderTime=time;
	     evaluate=eva;
	 }

	 public MockOrder getOrder(String name,int time,String eva){
		 return new MockOrder(name,time,eva);
	 }
}
