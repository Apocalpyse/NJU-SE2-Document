
public interface HotelBLService {
	//获取酒店外部信息
	public HotelVO getHotel(HotelVO vo);
	//增加对酒店的评价
	public void addEvaluation(long id,String str);
	//改变酒店的外部信息
	public void changeHotel(HotelVO vo);
}
