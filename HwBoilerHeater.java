
public class HwBoilerHeater implements OnOffDevice{
	protected boolean state;
    
    public HwBoilerHeater() {
		// TODO Auto-generated constructor stub
        state = false;
    }
    
    @Override
    public void on() {
        state = true;
        System.out.println("The Boiler Heater is turned on");
    }

    @Override
    public void off() {
        state = false;
        System.out.println("The Boiler Heater is turned off");
    }

    @Override
    public boolean isOn() {
        return state;
    }
	
}
