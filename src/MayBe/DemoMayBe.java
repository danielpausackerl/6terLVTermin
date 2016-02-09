package MayBe;

public class DemoMayBe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MayBe<String> name = new MayBe<String>("Müller", MayBe.ZugriffErlaubt);
		name.printData();

		name.setStatus(MayBe.NichtVorhanden);
		name.printData();

		
		System.out.println(name);
	}

}
