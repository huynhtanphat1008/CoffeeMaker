
public class HwReliefValue implements OpenCloseDevice {

	protected boolean state;
	public HwReliefValue() {
		// TODO Auto-generated constructor stub
		this.state = false;
	}
	@Override
	public void Open() {
		// TODO Auto-generated method stub
		state = true;
		System.out.println("The Relief Value is Open");
	}

	@Override
	public void Close() {
		// TODO Auto-generated method stub
		state = false;
		System.out.println("The Relief Value is Close");
	}

	@Override
	public boolean IsOpen() {
		// TODO Auto-generated method stub
		return state;
	}

}
