
public class RoomLineItem {
	String orderStyle;
	int orderNumber;
	int orderArrive;
	int orderleave;
    double price;
    public RoomLineItem(MockOrder mo){
    	orderStyle=mo.orderStyle;
    	orderNumber=mo.orderNumber;
    	orderArrive=mo.orderArrive;
    	orderleave=mo.orderleave;
    }
    public RoomLineItem(MockPromotion mp){
        price=mp.price;
    }
}
