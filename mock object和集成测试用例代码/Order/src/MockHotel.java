/**
 * Created by 常德隆 on 2016/11/6.
 */
public class MockHotel {
    String hotelName;
    int[] hotelPhone;
    String hotelLocation;

    public MockHotel(String name,int[] phone,String location){
        hotelName=name;
        hotelPhone=phone;
        hotelLocation=location;
    }

    public MockHotel getHotel(String name,int[] phone,String location){
        return new MockHotel(name,phone,location);
    }
}
