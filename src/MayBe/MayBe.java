package MayBe;

public class MayBe<T> {

	private T data;

	private int status;

	public MayBe(T data, int status) {
		this.data = data;
		this.status = status;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public static final int ZugriffErlaubt = 1;
	public static final int ZugriffVerboten = 2;
	public static final int NichtVorhanden = 3;

	public String toString() {

		switch (status) {
		case ZugriffErlaubt:
			return "Zugriff erlaubt: ";
			
		case ZugriffVerboten:
			return "Zugriff nicht erlaubt";
			
		case NichtVorhanden:
			return "Daten nicht vorhanden";
			
		default:
			return "ungültiger Status";
		}
	}
}
