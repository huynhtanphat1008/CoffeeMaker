
public class maycafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeMaker cfm = new CoffeeMaker();
		cfm.hwblBoilerHeater.on();
		cfm.hwIndicatorLight.off();
		cfm.hwReliefValue.Open();
		cfm.hwWarmerPlateHeater.on();
		cfm.adaptor.off();
	}
}
