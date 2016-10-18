
public class WebworkerBLService_Driver {
	public void drive(){
		WebworkerBLService.getAccount(CustomerPO po1);
		if(search(po1.ID)!=Null)System.out.println("customer exist!\n");
		//注册成功
		WebworkerBLService.addHotel(HotelPO po3);
		if(search(po3.ID)!=Null)System.out.println("hotel exist!\n");
		//酒店添加成功
		
	}
}
public class Client{
	public static void main(String[]args){
		WebworkerBLService webController=new WebworkerController();	
		WebworkerBLService_Driver driver=new WebworkerBLService_Driver(userController);
		driver.drive(webController);
	}
}