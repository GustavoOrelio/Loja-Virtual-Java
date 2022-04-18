package Models;

public class GeradorId {
	
	private static int ID = 1;

	public static int getProximoId() {
		return ID++;
	}

}
