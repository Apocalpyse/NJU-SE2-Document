
public interface RoomBLService {
	//获取房间信息
	public RoomVO getRoom(long id);
	//改变房间信息
	public void changeRoom(RoomVO vo);
	//永久性改变房间信息，例如扩建
	public void addRoom(RoomVO vo);
}
