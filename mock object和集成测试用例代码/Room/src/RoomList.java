
public class RoomList{
	String orderStyle;
	int orderNumber;
	int orderArrive;
	int orderleave;
    double price;

    public void addRoomLineItem(RoomLineItem oli){
    	orderStyle=oli.orderStyle;
    	orderNumber=oli.orderNumber;
    	orderArrive=oli.orderArrive;
    	orderleave=oli.orderleave;
        price=oli.price;
    }
}
