
public interface RoomDatatService_Stub  implements RoomDatatService{
	public void insert(RoomPO po){
		System.out.println("Insert Succeed!\n");
	}
	public void delete(RoomPO po){
		System.out.println("Delete Succeed!\n");
	}
	public void update(RoomPO po){
		System.out.println("Update Succeed!\n");
	}
	public void init(){
		System.out.println("Init Succeed!\n");
	}
	public void finish(){
		System.out.println("Finish Succeed!\n");
	}
	public RoomPO find(long id){
		System.out.println("Find Succeed!\n");
		RoomPO po=new RoomPO;
		return po;
	}
	public CustomerPO find(String field,int value){
		System.out.println("Find Succeed!\n");
		RoomPO po=new RoomPO;
		return po;
	}
}
