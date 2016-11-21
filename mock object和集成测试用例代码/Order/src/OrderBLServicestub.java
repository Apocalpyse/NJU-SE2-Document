import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 常德隆 on 2016/10/16.
 */

public class OrderBLServicestub implements OrderBLService {
    long id;
    String customerName;
    int[] customerPhone;
    String hotelName;
    int[] hotelPhone;
    String hotelLocation;
    String roomType;
    int roomNumber;
    String startTime;
    String lastStartTime;
    int days;
    orderState os;

    public OrderBLServicestub( long i,String cn,int[] cp,String hn,int[] hp,String hl,String rt,int rn,String st,
                              String lst,int d,orderState o){
        id=i;
        customerName=cn;
        customerPhone=cp;
        hotelName=hn;
        hotelPhone=hp;
        hotelLocation=hl;
        roomType=rt;
        roomNumber=rn;
        startTime=st;
        lastStartTime= lst;
        days=d;
        os=o;
    }

    public CustomerPO getCustomer(long id){
        return CustomerPO(id);
    }//获得下单客户的信息

    public HotelPO getHotel(long id){
        return HotelPO(id);
    }//获得酒店信息

    public RoomPO getRoom(long id){
        return RoomPo(id);
    }//获得房间信息

    public void createOrder(OrderPO op){
        oo.getCustomerPO=getCustomer(0001);
        oo.getHotelPO=getHotel(0001);
        oo.getRoomPO=getRoom(0001);
    }//获得客户，酒店，房间的信息以完成订单创建

    public void completeOrder(long id){
        OrderPO op=getOrder(id);
        op.orderState=normal;
        System.out.println("订单已执行！");
    }//正常完成订单，将订单设为正常状态

    public void cancelOrder(long id){
        OrderPO op=getOrder(id);
        op.orderState=canceled;
        Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        if(op.lastStartTime-time>=6){
            //时间差大于等于6小时，不扣除信用值
        }
        else{
            //时间差小于6小时，扣除订单价值一半的信用值
        }
        System.out.println("订单已撤销！");
    }//订单撤销，把订单的状态设为已撤销状态

    public void recoverOrder(long id){
        OrderPo op=getOrder(id);
        op.orderState=normal;
    }//异常订单经过审核，恢复为正常状态

    public OrderPo getOrder(long id){
        return OrderPO;
    }//浏览订单时，根据订单id返回订单所有信息
}
