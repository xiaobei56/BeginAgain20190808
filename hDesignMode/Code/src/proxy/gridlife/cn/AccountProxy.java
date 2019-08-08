package proxy.gridlife.cn;

public class AccountProxy implements Account {

	public AccountProxy(AccountImp accountImp) {
		
	}
	@Override
	public void queryAccount() {
		System.out.println("查询业务处理之前*****");
		System.out.println("查询业务处理之后######");
	}

	@Override
	public void updateAccount() {
		System.out.println("修改业务处理之前*****");
		System.out.println("修改业务助理之后#####");
	}

}
