import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HotelInfo {
	public class HotelInfoTest{
		@Test
        public void test1(){
            int ordertime=20161106;
            MockOrder mo=new MockOrder("小明",ordertime,"这家酒店服务太好了");
            HotelLineItem hli=new HotelLineItem(mo);
            HotelList hl=new HotelList();
            hl.addHotelLineItem(hli);
            assertEquals("小明",hl.orderName);
            assertEquals(ordertime,hl.orderTime);
            assertEquals("这家酒店服务太好了",hl.evaluate);
        }
	}
}
