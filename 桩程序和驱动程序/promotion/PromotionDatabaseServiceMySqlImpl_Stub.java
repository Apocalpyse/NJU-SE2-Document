
public class PromotionDatabaseServiceMySqlImpl_Stub implements PromotionDatabaseService{
	public PromotionDatabaseServiceMySqlImpl(){
		
	}
	public PromotionPO find(long ID){
		PromotionPO po;
		System.out.println("find succeed!\n");
		return po;
	}
	public void insert(PromotionPO po){
		System.out.println("insert succeed!\n");
	}//插入销售策略
	public void delete(PromotionPO po){
		System.out.println("delete succeed!\n");
	}//删除销售策略
	public void updata(PromotionPO po){
		System.out.println("update succeed!\n");
	}//更新
}
