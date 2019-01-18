package om.sinc.mobile;

public abstract class Mobile {

	private String mobileName;
	private int batterySize;
	private String osType;

	public Mobile() {
		super();

	}

	public Mobile(String mobileName, int batterySizae, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterySize = batterySizae;
		this.osType = osType;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySizae) {
		this.batterySize = batterySizae;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public abstract int operate(int time);

	public abstract int charge(int time);

}
