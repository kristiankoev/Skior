
public class Geroi {

	private String ime;
	private double visochina;
	private int duljinanaskite;
	private String markanaskite;
	
	
	//Конструктори
	
	public Geroi (){
		
	}
	
	public Geroi (String i){
		ime  = i;
	}
	
	public Geroi (String i, double v, int d, String m){
		 ime = i;
		 visochina = v;
		 duljinanaskite= d;
		 markanaskite = m;
		 
		
	}
	
	
	public void spuska() {
		System.out.println("                /----|       .         .");
		System.out.println(" .             /     [   .        .         .");
		System.out.println("         ______|---- _|__     .        .");
		System.out.println(".     _--    --\\_<\\_//   \\-----           .");
		System.out.println("     _  _--___   \\__/     ___  -----_ **     *");
		System.out.println("*  _- _-      --_         /  [ ----__  --_  *");
		System.out.println("*/__-      .    [           _[  *** --_  [*");
		System.out.println(" [*/ .          __[/-----__/   [**     [*/");
		System.out.println("    .         /--  /            /");
		System.out.println("    .        /   /   /[----___/        .");
		System.out.println("            /   /*[  !   /==/              .");
		System.out.println("  .        /   /==[   |/==/      .");
		System.out.println("         _/   /=/ | _ |=/   .               .");
		System.out.println("   /_   //  / _ _//              .");
		System.out.println(" .       [ '//    |__//    .    .            .");
		System.out.println("        /==/  .  /==/                .");
		System.out.println("      /==/     /==/                       .");
		System.out.println("    /==/     /==/       .       .    .");
		System.out.println(" _/==/    _/==/            .");
		System.out.println(" [|*      [|*                   White Powder!!");
	}
	public void tikase() {
		System.out.println("         *");
		System.out.println("         XX");
		System.out.println("        MMMMM");
		System.out.println("        //(00");
		System.out.println("      .:.....");
		System.out.println("    .:::::::::");
		System.out.println("   :: %%%%%% ::.");
		System.out.println("  ::  ::::::  :::::::I)");
		System.out.println("  (%  ::::::         |");
		System.out.println("  /   |   /_____     |");
		System.out.println(" /    |         ))   |");
		System.out.println("/      ------/ //    |");
		System.out.println("/            / //     |");
		System.out.println("/            / //      |");
		System.out.println("*            ZZZZ       *");
		System.out.println("   _________ZZZZZZ_________//_//");
		System.out.println("------------------------------------");
	}
	// getter - и
	public String getIme() {
		return ime;
	}
	
	public Double getVisochina() {
		return visochina;
	}
	
	public String getMarkanaskite() {
		return markanaskite;
	}
	
	public Integer getDuljinanaskite() {
		return duljinanaskite;
	}
	
	// setter - и
	public  void setVisochina(double v) {
		if(v >= 30.0 && v <= 230.0)
			visochina = v;
	}
	
		public void print() {
			System.out.println("Аз съм " + ime + ".");
			System.out.println("Висок съм " + visochina + " см.");
			System.out.println("Карам ски " + markanaskite + " , които са дълги " + duljinanaskite + " см.");
			
		}
	}

