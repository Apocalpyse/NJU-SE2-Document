
public interface UserBLService_Stub  implements UserBLService{
	long userAccount;//用户的账户
	String userPassword;//用户的密码
	public UserBLService_Stub(long one,String two){
		userAccount=one;
		userPassword=two;
	}
	public boolean login(UserPO po){
		boolean successLogin;
		return successLogin;
	}//登录(是否成功由返回值决定）
	public class UerView{
		UserBLService_Stub user=new UserBLService_Stub(12345,"12580");
	}
}
