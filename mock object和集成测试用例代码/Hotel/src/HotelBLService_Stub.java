
public interface HotelBLService_Stub implements HotelBLService{
	String hotelName;//酒店名称
	String hotelLocation;//酒店地址
	int[] hotelPhone;//酒店联系电话
	int stars;//酒店星级
	ArrayList<evaluation> eva;//酒店评价
	
	public HotelBLService_Stub(String hn,String hl,int[] hp,int st,ArrayList<evaluation> el){
		hotelName=hn;
		hotelLocation=hl;
		hotelPhone=hp;
		stars=st;
		eva=el;
		
	}
	public void addEvaluation(long id,String str){
		id=56776;
		str="服务很好";
	}
	public void changeHotel(HotelVO vo){
		hotelName="银河";
		hotelLocation="南京大学对面";
		hotelPhone={2,3,2,2,1,3,2,2};
		stars=5;
		eva=el;
	}
}
