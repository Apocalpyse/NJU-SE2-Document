
public class UserDatabaseServiceMySqlImpl_Stub implements UserDatabaseService{
	public UserDatabaseServiceMySqlImpl(){
	}
	public void insert(UserPO po){
		System.out.println("insert succeed!\n");
	}//插入用户信息
	public void delete(UserPO po){
		System.out.println("delete succeed!\n");
	}//消除用户信息
	public void update(UserPO po){
		System.out.println("updata succeed!\n");
	}//更新
	public UserPO find(long ID){
		System.out.println("find succeed!\n");
		UserPO po=new UserPO();
		return po;
	}//查找用户信息
}
