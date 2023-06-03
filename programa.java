import java.util.ArrayList;
import java.util.Scanner;
public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Избери скиор 1 / 2");
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	
		ArrayList <String> predmeti = new ArrayList<String>();
		
		predmeti.add("Щеки");
		predmeti.add("Каска");
		predmeti.add("Ръкавици");
		predmeti.get(1);
		
		Geroi g1 = new Geroi("Petur", 185, 170, "Volkl" );
	    Geroi g2 = new Geroi("Valio", 123, 130, "Rossignol");

		
		if (n == 1) {
			System.out.println("Избра скиор 1: " + g1.getIme() + ";  " + g1.getVisochina() + ";  " + g1.getMarkanaskite() + "; " + g1.getDuljinanaskite());
			g1.print();
			
			double g1Visochina = g1.getVisochina();
			System.out.println(
					
			);
			g1.setVisochina(200.0);
			
			System.out.println("Въведи 1 - да спускам  / 2 - да се тикам" );
			int k =scan.nextInt();
			if (k==1) {
				g1.spuska();
			}
			else g1.tikase();
			
			System.out.println("Имам също и: ");
			for(int i=0; i<predmeti.size(); i++) {
				
			System.out.print(predmeti.get(i) + ", ");
			}
			System.out.println("без които карането ми би било опасно!");
	}	
		
		else {
			System.out.println("Избра скиор 2: " + g2.getIme() + ";  " + g2.getVisochina() + ";  " + g2.getMarkanaskite()  + "; " + g2.getDuljinanaskite());
			g2.print();
		
			double g2Visochina = g2.getVisochina();
			System.out.println(
					
					);
			g2.setVisochina(200.0);
			
			System.out.println("Въведи 1 - да спускам  / 2 - да се тикам" );
			int k =scan.nextInt();
			if (k==1) {
				g2.spuska();
			}
			else g2.tikase();
			
			System.out.println("Имам също и: ");
			for(int i = 0; i < predmeti.size(); i++) {
				
			System.out.print(predmeti.get(i) + ", ");
			}
			System.out.println("без които карането ми би било опасно!");
			
		}	
	
		scan.close();

	}

}
