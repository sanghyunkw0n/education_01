package om.sinc.mobile;

public class Otab extends Mobile {

	public Otab() {
		super();
	}

	public Otab(String mobileName, int batterySizae, String osType) {
		super(mobileName, batterySizae, osType);
	}

	@Override
	public int operate(int time) {
		setBatterySize(getBatterySize() - time * 12);

		return getBatterySize();
	}

	@Override
	public int charge(int time) {
		setBatterySize(getBatterySize() + time * 8);

		return getBatterySize();
	}

}
