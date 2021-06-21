package strategypattern;

/**
 * 新客户大批量
 */
public class NewCustomerManyStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("打九折");
		return standardPrice*0.9;
	}
}
