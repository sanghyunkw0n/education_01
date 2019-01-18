package om.sinc.mobile;

public class Ltab extends Mobile {

	public Ltab() {
		super();
	}

	public Ltab(String mobileName, int batterySizae, String osType) {
		super(mobileName, batterySizae, osType);
	}

	@Override
	public int operate(int time) {

		setBatterySize(getBatterySize() - (time * 10));

		return getBatterySize();
	}

	@Override
	public int charge(int time) {

		setBatterySize(getBatterySize() + time * 10);

		return getBatterySize();
	}

}
