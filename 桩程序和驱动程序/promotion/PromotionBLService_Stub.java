
public class PromotionBLService_Stub implements PromotionBLService{
	PromotionPO promotion;
	public PromotionBLService_Stub(PromotionPO po){
		promotion=po;
	}
	public void usePromotion(long ID){
		
	}//使用促销策略
	public void changePromotion(long ID){
		
	}//更改促销策略
	public PromotionPO getPromotion(long ID){
		
	}//获取策略信息
	public class promotionView{
		PromotionPO po;
		PromotionBLService_Stub pro=new PromotionBLService_Stub(po);
	}

}
