
public interface CustomerDataService {
	public CustomerPO find(long id) throws RemoteException;
	public CustomerPO find(String field,int value)throws RemoteException;
	public void insert(CustomerPO po) throws RemoteException;
	public void delete(CustomerPO po) throws RemoteException;
	public void update(CustomerPO po) throws RemoteException;
	public void init() throws RemoteException;
	public void finish() throws RemoteException;
}
