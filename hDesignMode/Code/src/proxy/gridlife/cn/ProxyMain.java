package proxy.gridlife.cn;

public class ProxyMain {
	public static void mian(String[] args) {
		AccountImp accountImp=new AccountImp();
		AccountProxy accountProxy=new AccountProxy(accountImp);
		accountProxy.queryAccount();
		accountProxy.updateAccount();
	}
}
