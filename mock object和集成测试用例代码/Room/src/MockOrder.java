
public class MockOrder {
	String orderStyle;
	int orderNumber;
	int orderArrive;
	int orderleave;

	 public MockOrder(String style,int number,int arrive,int leave){
		 orderStyle=style;
		 orderNumber=number;
		 orderArrive=arrive;
		 orderleave=leave;
	 }

	 public MockOrder getOrder(String style,int number,int arrive,int leave){
		 return new MockOrder(style,number,arrive,leave);
	 }
}
