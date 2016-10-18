
public interface CustomerDataService_Stub implements CustomerDataService{
	public void insert(CustomerPO po){
		System.out.println("Insert Succeed!\n");
	}
	public void delete(CustomerPO po){
		System.out.println("Delete Succeed!\n");
	}
	public void update(CustomerPO po){
		System.out.println("Update Succeed!\n");
	}
	public void init(){
		System.out.println("Init Succeed!\n");
	}
	public void finish(){
		System.out.println("Finish Succeed!\n");
	}
	public CustomerPO find(long id){
		System.out.println("Find Succeed!\n");
		CustomerPO po=new CustomerPO;
		return po;
	}
	public CustomerPO find(String field,int value){
		System.out.println("Find Succeed!\n");
		CustomerPO po=new CustomerPO;
		return po;
	}
}
