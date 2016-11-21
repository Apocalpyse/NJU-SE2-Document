
public interface HotelDataService_Stub implements HotelDataService{
	public void insert(HotelPO po){
		System.out.println("Insert Succeed!\n");
	}
	public void delete(HotelPO po){
		System.out.println("Delete Succeed!\n");
	}
	public void update(HotelPO po){
		System.out.println("Update Succeed!\n");
	}
	public void init(){
		System.out.println("Init Succeed!\n");
	}
	public void finish(){
		System.out.println("Finish Succeed!\n");
	}
	public HotelPO find(long id){
		System.out.println("Find Succeed!\n");
		HotelPO po=new HotelPO;
		return po;
	}
	public HotelPO find(String field,int value){
		System.out.println("Find Succeed!\n");
		HotelPO po=new HotelPO;
		return po;
	}
}
