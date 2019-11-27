
public class HwIndicatorLight implements OnOffDevice {

	protected boolean state;
    
    public HwIndicatorLight(){
        state = false;
    }
    
    @Override
    public void on() {
        state = true;
        System.out.println("The Indicator Light is turned on");
    }

    @Override
    public void off() {
        state = false;
        System.out.println("The Indicator Light is turned off");
    }

    @Override
    public boolean isOn() {
        return state;
    }

}
