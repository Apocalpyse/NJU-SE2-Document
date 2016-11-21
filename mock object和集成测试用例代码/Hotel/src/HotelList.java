
public class HotelList {
	String orderName;
	int orderTime;
	String evaluate;

    public void addHotelLineItem(HotelLineItem oli){
    	orderName=oli.orderName;
    	orderTime=oli.orderTime;
    	evaluate=oli.evaluate;
    }
}
