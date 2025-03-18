import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Article extends Remote {
    public  int getStock() throws RemoteException;
    public  int getReference() throws RemoteException;
    public float getPrix() throws RemoteException;
    public  Famille getFamille() throws RemoteException;
}
