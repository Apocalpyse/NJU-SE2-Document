
public class HotelLineItem {
	 String orderName;
	 int orderTime;
	 String evaluate;
	   
	 public HotelLineItem(MockOrder mo){
		 orderName=mo.orderName;
		 orderTime=mo.orderTime;
		 evaluate=mo.evaluate;
	 }
}
