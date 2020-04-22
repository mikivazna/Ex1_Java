import javax.swing.*;

public class FASE3 {

	public static void main(String[] args) {
	
		int anyinici=1948, i=0;
		
		int meuany=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el teu any de neixement:"));
		
		boolean a=false;
		
		String YesBis, NoBis;
		
		
		for(i=anyinici; i<=meuany; i=i+4){
			
			if(i==meuany){
				
				a=true;
			}

			
			if((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0 ) || (a=true)){

				YesBis = "El any " + i + " és de traspàs";
				System.out.println(YesBis);
			
			}
			
			else{
				
				NoBis = "El any " + i + " no és de traspàs";
				System.out.println(NoBis);

				
			}
		
	}
	

	}

}
