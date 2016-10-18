
public interface CustomerBLService_Stub implements CustomerBLService{
	String customerName;//客户的姓名
	int[] customerPhone;//客户的联系电话
	Long creditNumber;//客户的信用值
	String customerBirthday;//会员客户的生日
	String companyName;//企业客户的企业名称
	ArrayList<order> orderList;//订单记录
    public CustomerBLService_Stub(String cun,int[] cp,long crn,String cb,String con,ArrayList<order> or){
    	customerName=cun;
    	customerPhone=cp;
    	creditNumber=crn;
    	customerBirthday=cb;
    	companyName=con;
    	orderList=or;
    }
	public void changeCustomer(long id){
		customerName="李强";
		customerPhone={1,3,2,1,2,2,2,1,3};
		creditNumber=2626;
		customerBirthday="19900523";
		companyName="银星国际";
		orderList=；
		
	}
}
