
public class CoffeeMaker {

	HwBoilerHeater hwblBoilerHeater;
	HwIndicatorLight hwIndicatorLight;
	HwWarmerPlateHeater hwWarmerPlateHeater;
	HwReliefValue hwReliefValue;
	OpenCloseAdaptor adaptor;
	public CoffeeMaker() {
		hwblBoilerHeater = new HwBoilerHeater();
		hwIndicatorLight = new HwIndicatorLight();
		hwWarmerPlateHeater = new HwWarmerPlateHeater();
		hwReliefValue = new HwReliefValue();
		adaptor = new OpenCloseAdaptor();
	}
    
    public void brewCoffee(){}
    public void pourCoffee(){}
    public void interruptBrewing(){}

}
