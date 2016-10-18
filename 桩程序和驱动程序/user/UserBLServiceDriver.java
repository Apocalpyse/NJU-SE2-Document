
public class UserBLServiceDriver {
	public void drive(UserBlService userBlService){
		boolean result=UserBLService.login(12345,"12580");
		if(result){
			System.out.println("success to login");
		}
		//登录成功
		
	}
}
public class Client{
	public static void main(String[]args){
		UserBLService userController=new UserController();	
		UserBLService_Driver driver=new UserBLService_Driver(userController);
		driver.drive(userController);
	}
}

