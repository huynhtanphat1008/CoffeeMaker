
public class OpenCloseAdaptor implements OnOffDevice {

	HwReliefValue itsDevice;
	
	public OpenCloseAdaptor() {
		// TODO Auto-generated constructor stub
		itsDevice = new HwReliefValue();
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		itsDevice.Close();
		System.out.println("The Open Close Adaptor is turn on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		itsDevice.IsOpen();
		System.out.println("The Open Close Adaptor is turn off");
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return !itsDevice.IsOpen();
	}
}
