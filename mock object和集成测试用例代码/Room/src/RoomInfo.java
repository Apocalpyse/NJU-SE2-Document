import static org.junit.Assert.*;

import org.junit.Test;

public class RoomInfo {
	public class HotelInfoTest{
		@Test
        public void test1(){
            MockOrder mo=new MockOrder("单人房",3,11061943,11070800);
            RoomLineItem rli=new RoomLineItem(mo);
            RoomList rl=new RoomList();
            rl.addRoomLineItem(rli);
            assertEquals("单人房",rli.orderStyle);
            assertEquals(3,rli.orderNumber);
            assertEquals(11061943,rli.orderArrive);
            assertEquals(11061943,rli.orderleave);
        }
		 @Test
	        public void test4(){
	            MockPromotion mp=new MockPromotion(198);
	            RoomLineItem rli=new RoomLineItem(mp);
	            RoomList rl=new RoomList();
	            rl.addRoomLineItem(rli);
	            assertEquals(198,rl.price);
	        }
	} 
}
