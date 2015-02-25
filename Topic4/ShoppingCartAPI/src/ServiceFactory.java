public class ServiceFactory {  
    private ServiceFactory() {}  
  
    public static Service getLocalService(ItemsStore itemsStore){  
        return new ServiceImp (itemsStore);  
    }  
  
    public static Service getRemoteServiceUsing(ItemsStore itemsStore){  
        return new ServiceAProxy (new ServiceImp(itemsStore));  
    }  
  
}  