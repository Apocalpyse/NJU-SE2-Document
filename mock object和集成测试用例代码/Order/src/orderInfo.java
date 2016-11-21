/**
 * Created by 常德隆 on 2016/11/6.
 */

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class orderInfo {



    public class orderInfoTest {
        @Test
        public void test1(){
            int[] customerphone={1,2,3,4,5};
            MockCustomer mc=new MockCustomer("张三",customerphone);
            orderLineItem oli=new orderLineItem(mc);
            orderList ol=new orderList();
            ol.addOrderLineItem(oli);
            assertEquals("张三",ol.customerName);
            assertEquals(customerphone,ol.customerPhone);
        }
        @Test
        public void test2(){
            int[] hotelPhone={6,9,2,1,1,1};
            MockHotel mh=new MockHotel("汉庭",hotelPhone,"南京市栖霞区仙林大道164号");
            orderLineItem oli=new orderLineItem(mh);
            orderList ol=new orderList();
            ol.addOrderLineItem(oli);
            assertEquals("汉庭",ol.hotelName);
            assertEquals(hotelPhone,ol.hotelPhone);
            assertEquals("南京市栖霞区仙林大道164号",ol.hotelLocation);
        }
        @Test
        public void test3(){
            MockRoom mr=new MockRoom("标准间",10);
            orderLineItem oli=new orderLineItem(mr);
            orderList ol=new orderList();
            ol.addOrderLineItem(oli);
            assertEquals("标准间",ol.roomType);
            assertEquals(10,ol.roomNumber);
        }
        @Test
        public void test4(){
            MockPromotion mp=new MockPromotion(198);
            orderLineItem oli=new orderLineItem(mp);
            orderList ol=new orderList();
            ol.addOrderLineItem(oli);
            assertEquals(198,ol.price);
        }
    }
}
