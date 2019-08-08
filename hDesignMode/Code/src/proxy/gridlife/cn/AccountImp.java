package proxy.gridlife.cn;

public class AccountImp implements Account {

	@Override
	public void queryAccount() {
		System.out.println("委托类的查询方法……");
	}

	@Override
	public void updateAccount() {
		System.out.println("委托类的修改方法……");
	}

}
