
public interface RoomDataService {
	public RoomPO find(long id) throws RemoteException;
	public RoomPO find(String field,int value)throws RemoteException;
	public void insert(RoomPO po) throws RemoteException;
	public void delete(RoomPO po) throws RemoteException;
	public void update(RoomPO po) throws RemoteException;
	public void init() throws RemoteException;
	public void finish() throws RemoteException;
}
