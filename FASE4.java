import javax.swing.JOptionPane;


public class FASE4 {

	public static void main(String[] args) {
		
		String meunom=JOptionPane.showInputDialog("Introdueix el teu nom:");
		
		String meucognom1=JOptionPane.showInputDialog("Introdueix el teu primer cognom:");
		
		String meucognom2=JOptionPane.showInputDialog("Introdueix el teu segon cognom:");
		
		int meuany=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el teu any de neixement:"));
		
		int meumes=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el teu mes de neixement:"));
		
		int meudia=Integer.parseInt(JOptionPane.showInputDialog("Introdueix el teu dia de neixement:"));

		
		
		if ((meuany % 4 == 0 && meuany % 100 != 0) || (meuany % 100 == 0 && meuany % 400 == 0)) {
			
            System.out.println("El " + meuany + " �s de trasp�s");
            
        } else {
        	
            System.out.println("El " + meuany + " no �s de trasp�s");
        }
		
		System.out.println("El teu nom �s: " + meunom + " " + meucognom1 + " " + meucognom2);
		
		System.out.print("Vas n�ixer el " + meudia + " / " + meumes  + " / " + meuany);
	}
	


}
