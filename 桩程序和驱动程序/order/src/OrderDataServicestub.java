/**
 * Created by 常德隆 on 2016/10/16.
 */
public class OrderDataServicestub implements OrderDataService {

    public OrderDataServicestub(){
    }

    public void insert(OrderPO po){
        System.out.print("Insert Succeed!");
    }//插入一个持久化数据对象

    public void delete(OrderPO po){
        System.out.print("Delete Succeed!");
    }//删除一个持久化数据对象

    public void update(OrderPO po){
        System.out.print("Update Succeed!");
    }//更新一个持久化数据对象

    public OrderPO[value] find(String field,int value){
        System.out.print("find Succeed!");
        OrderPO[value] po;
        for(int i=0;i<value;i++){
            po[i]=new OrderPO();
        }
        return po;
    }//查找多个持久化数据对象

    public OrderPO find(long id){
        System.out.print("find Succeed!");
        OrderPO po=new OrderPO();
        return po;
    }//查找一个持久化数据对象

    public void init(){
    //初始化持久化数据对象
    }

    public void finish(){
     //结束持久化数据库的使用
    }

}
