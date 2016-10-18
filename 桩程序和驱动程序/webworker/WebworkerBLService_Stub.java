
public class WebworkerBLService_Stub implements WebworkerBLService{
	WebworkerPO webworker;
	PromotionPO promotion;
	CustomerPO customer;
	HotelPO hotel;
	public WebworkerBLService_Stub(WebworkerPO po0,PromotionPO po1,CustomerPO po2,HotelPO po3){
		webworker=po0;
		promotion=po1;
		customer=po2;
		hotel=po3;
	}//网站营销人员信息等
	public void getAccount(CustomerPO po){
		
	}//会员添加
	public void addHotel(HotelPO po){
		
	}//酒店添加
	public class WebworkerView{
		WebworkerBLService webbl=new WebworkerBLService_Stub(webworker);
		
	}
}
