/**
 * Created by 常德隆 on 2016/10/16.
 */
public class OrderBLServicedriver {
   public void drive(OrderBLService orderblservice){
       OrderPO orderpo=orderblservice.getOrder(0001);
       System.out.println(orderpo.customerName);
       //获得id为0001的订单的客户名字

       orderblservice.completeOrder(0001);
       orderpo=orderblservice.getOrder(0001);
       System.out.println(orderpo.orderState);
       //完成id为0001的订单，检查订单状态是否为正常

       orderblservice.cancelOrder(0001);
       orderpo=orderblservice.getOrder(0001);
       System.out.println(orderpo.orderState);
       //撤销id为0001的订单，检查订单状态是否为已撤销

       orderblservice.recoverOrder(0001);
       orderpo=orderblservice.getOrder(0001);
       System.out.println(orderpo.orderState);
       //恢复id为0001的订单，检查订单状态是否为正常
   }
}
