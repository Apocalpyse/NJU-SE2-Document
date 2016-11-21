/**
 * Created by 常德隆 on 2016/11/6.
 */
public class orderLineItem {
    String customerName;
    int[] customerPhone;
    String hotelName;
    int[] hotelPhone;
    String hotelLocation;
    String roomType;
    int roomNumber;
    double price;

    public orderLineItem(MockCustomer mc){
        customerName=mc.customerName;
        customerPhone=mc.customerPhone;
    }

    public orderLineItem(MockHotel mh){
        hotelName=mh.hotelName;
        hotelPhone=mh.hotelPhone;
        hotelLocation=mh.hotelLocation;
    }
    public orderLineItem(MockRoom mr){
        roomType=mr.roomType;
        roomNumber=mr.roomNumber;
    }
    public orderLineItem(MockPromotion mp){
        price=mp.price;
    }
}
