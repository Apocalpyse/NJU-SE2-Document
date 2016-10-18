
public class WebworkerDatabaseServiceMySqlImpl_Stub implements WebworkerDatabaseService{
	public DatabaseServiceMySqlImpl(){
		
	}
	public void insert(CustomerPO po){
		System.out.println("insert customer succeed!\n");
	}//客户添加
	public void insert(HotelPO po){
		System.out.println("insert hotel succeed!\n");
	}//酒店添加
	public void delete(CustomerPO po){
		System.out.println("delete customer succeed!\n");
	}//客户删除
	public void delete(HotelPO po){
		System.out.println("delete hotel succeed!\n");
	}//酒店删除
	public void update(CustomerPO po){
		System.out.println("update customer succeed!\n");
	}//客户更新
	public void update(HotelPO po){
		System.out.println("update hotel succeed!\n");
	}//酒店更新
	public UserPO findCustomer(long ID){
		System.out.println("find succeed!\n");
		UserPO po=new UserPO();
		return po;
	}//查找客户信息
	public HotelPO findHotel(long ID){
		System.out.println("find succeed!\n");
		HotelPO po=new HotelPO();
		return po;
	}//查找酒店信息
}
