
public class RoomBLService_Driver {
	public void drive(RoomBLService roomBLService){
		RoomPO roomPO=roomBLService.getRoom(123);
		If(roomPO==RoomlPO.roomtype){
			System.out.println("Succeed\n");
		}
		RoomPO roomPO2=RoomBLService.changeRoom(room);
		If(hotelPO2==RoomPO){
			System.out.println("Succeed\n");
		}
		RoomPO hotelPO3=roomBLService.addRoomhotel(room);
		If(hotelPO2==RoomPO){
			System.out.println("Succeed\n");
		}
	}
}

public class Client{
	public static void main(String[] args){
		RoomBLService roomController=new RoomController();
		RoomBLService_Driver driver=new HotelBLService_Driver(roomController);
		driver.drive(roomController);
		
	}
}
