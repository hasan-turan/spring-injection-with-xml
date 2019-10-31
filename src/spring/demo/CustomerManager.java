package spring.demo;

public class CustomerManager implements ICustomerService {
	private ICustomerDal customerDal;

	// constructor injection
	public CustomerManager(ICustomerDal customerDal) {

		this.customerDal = customerDal;
	}

	// this is injection parameter with setter
	// this is done with <property name="customerDal" ref="database" /> in
	// applicationContext.xml
//	public void setCustomerDal(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}

	@Override
	public void add() {
		customerDal.add();
	}

}
