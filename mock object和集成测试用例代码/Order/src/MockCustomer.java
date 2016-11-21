/**
 * Created by 常德隆 on 2016/11/6.
 */
public class MockCustomer {
    String customerName;
    int[] customerPhone;


    public MockCustomer(String name,int[] phone){
        customerName=name;
        customerPhone=phone;
    }

    public MockCustomer getCustomer(String name,int[] phone){
        return new MockCustomer(name,phone);
    }
}
