
public class PromotionBLService_Driver {
	public void drive(PromotionBLService promotionBLService){
		long ID;
		PromotionPO po=PromotionBLService.getPromotion(ID);
		if(po!=null){
			System.out.println("getPromotion succeed!\n");
		}
	}//成功
	public class Client{
		public static void main(String[]args){
			PromotionBLService promotionController=new PromotionController();
			PromotionBLService_Driver driver=new  PromotionBLService_Driver(promotionController);
			driver.drive(promotionController);
		}
	}
}
