package om.sinc.mobile;

public class MobileMain {

	public static void main(String[] args) {

		Mobile mo1 = new Ltab("Ltab", 500, "AP-01");
		Mobile mo2 = new Otab("Otab", 1000, "AND-20");

		System.out.println("Mobile" + "\t" + "Battery" + "\t" + "OS");
		System.out.println("-------------------------------------");
		System.out.println(mo1.getMobileName() + "\t" + mo1.getBatterySize() + "\t" + mo1.getOsType());
		System.out.println(mo2.getMobileName() + "\t" + mo2.getBatterySize() + "\t" + mo2.getOsType());

		System.out.println();
		System.out.println("10분 충전!");

		System.out.println("-------------------------------------");
		System.out.println(mo1.getMobileName() + "\t" + mo1.charge(10) + "\t" + mo1.getOsType());
		System.out.println(mo2.getMobileName() + "\t" + mo2.charge(10) + "\t" + mo2.getOsType());

		System.out.println();
		System.out.println("5분 통화!");

		System.out.println("-------------------------------------");
		System.out.println(mo1.getMobileName() + "\t" + mo1.operate(5) + "\t" + mo1.getOsType());
		System.out.println(mo2.getMobileName() + "\t" + mo2.operate(5) + "\t" + mo2.getOsType());

	}

}
