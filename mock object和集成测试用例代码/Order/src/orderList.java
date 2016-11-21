/**
 * Created by 常德隆 on 2016/11/6.
 */
public class orderList {
    String customerName;
    int[] customerPhone;
    String hotelName;
    int[] hotelPhone;
    String hotelLocation;
    String roomType;
    int roomNumber;
    double price;

    public void addOrderLineItem(orderLineItem oli){
        customerName=oli.customerName;
        customerPhone=oli.customerPhone;
        hotelName=oli.hotelName;
        hotelPhone=oli.hotelPhone;
        hotelLocation=oli.hotelLocation;
        roomType=oli.roomType;
        roomNumber=oli.roomNumber;
        price=oli.price;
    }
}
