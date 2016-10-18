
public class HotelBLService_Driver {
	public void drive(HotelBLService hotelBLService){
		HotelPO hotelPO=hotelBLService.getHotel(hotel);
		If(hotelPO==HotelPO){
			System.out.println("Succeed\n");
		}
		HotelPO hotelPO2=hotelBLService.changehotel(hotel);
		If(hotelPO2==HotelPO){
			System.out.println("Succeed\n");
		}
		HotelPO hotelPO3=hotelBLService.addEvaluate(3366,"服务太好了");
		If(hotelPO2==HotelPO.ArrayList<evaluation>){
			System.out.println("Succeed\n");
		}
	}
}

public class Client{
	public static void main(String[] args){
		HotelBLService hotelController=new HotelController();
		HotelBLService_Driver driver=new HotelBLService_Driver(hotelController);
		driver.drive(hotelController);
		
	}
}
