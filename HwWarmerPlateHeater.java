
public class HwWarmerPlateHeater implements OnOffDevice{

	protected boolean state;
	public HwWarmerPlateHeater() {
		// TODO Auto-generated constructor stub
		this.state = false;
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		state = true;
		System.out.println("The Warmer Plate Heater is turn on");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		state = false;
		System.out.println("The Warmer Plate Heater is turn off");
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return state;
	}

}
