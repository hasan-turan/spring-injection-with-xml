package spring.demo;

public class MySqlCustomerDal implements ICustomerDal {
	private String connectionString;

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("Connection String: " + this.connectionString);
		System.out.println("Mysql veritabanưna kaydedildi");
	}

}
