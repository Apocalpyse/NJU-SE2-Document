
public class CustomerBLService_Driver {
	public void drive(CustomerBLService customerBLService){
		CustomerPO customerPO=customerBLService.getCustomer(3345);
		If(customerPO==CustomerPO.id){
			System.out.println("Succeed\n");
		}
		CustomerPO customerPO2=customerBLService.changeCustomer(3345);
		If(customerPO2==CustomerPO.id){
			System.out.println("Succeed\n");
		}
	}
}

public class Client{
	public static void main(String[] args){
		CustomerBLService customerController=new CustomerController();
		CustomerBLService_Driver driver=new CustomerBLService_Driver(customerController);
		driver.drive(customerController);
		
	}
}
