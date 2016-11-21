import org.junit.Test;

public class UserInfo {
	public class UserInfoTest{
		@Test
        public void test1(){
            UserLineItem uli=new UserLineItem();
            UserList ul=new UserList();
            ul.addUserLineItem(uli);
        }
	}
}
