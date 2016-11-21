
public interface RoomBLService_Stub implements RoomBLService{
	String roomType;//房间类型
	int roomTotalNumber;//房间总数量
	int roomAccessNumber;//可预定的房间数量
	int roomPrice;//房间价格
	
	public RoomBLService_Stub(String rt,int rtn,int ran,int rp){
		roomType=rt;
		roomTotalNumber=rtn;
		roomAccessNumber=ran;
		roomPrice=rp;
	}
	public void changeRoom(RoomVO vo){
		roomType="单人房";
		roomTotalNumber=13;
		roomAccessNumber=5;
		roomPrice=199;
	}
	public void addRoom(RoomVO vo){
		roomType="双人房";
		roomTotalNumber=8;
		roomAccessNumber=3;
		roomPrice=398;
	}
}
