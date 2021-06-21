package strategypattern;

/**
 * 新客户小批量
 */
public class NewCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("不打折，原价");
		return standardPrice;
	}
}
