import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		Combinaciones comb = new Combinaciones();
		List<Integer> valores = new ArrayList<>();
		valores.add(0);
		valores.add(1);
		valores.add(2);
		System.out.println("Combinacións de lonxitude 3 con 0, 1 e 2: ");
		comb.calculaCaminosVariables(valores, new ArrayList<>(), 3);
	}
}
