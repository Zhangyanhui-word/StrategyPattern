package strategypattern;

/**
 * �¿ͻ�С����
 */
public class NewCustomerFewStrategy implements Strategy {

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("�����ۣ�ԭ��");
		return standardPrice;
	}
}
