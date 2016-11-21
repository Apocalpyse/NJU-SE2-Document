/**
 * Created by 常德隆 on 2016/11/6.
 */

public class MockRoom {
    String roomType;
    int roomNumber;


    public MockRoom(String type,int number){
        roomType=type;
        roomNumber=number;
    }

    public MockRoom getRoom(String type,int number){
        return new MockRoom(type,number);
    }
}
