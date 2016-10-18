
public interface HotelDataService {
	public HotelPO find(long id) throws RemoteException;
	public HotelPO find(String field,int value)throws RemoteException;
	public void insert(HotelPO po) throws RemoteException;
	public void delete(HotelPO po) throws RemoteException;
	public void update(HotelPO po) throws RemoteException;
	public void init() throws RemoteException;
	public void finish() throws RemoteException;
	
}
