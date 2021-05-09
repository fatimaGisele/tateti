import javax.swing.JOptionPane;

public class TatetiVer2 {
	
	public JugadorVer2 j1;
	public JugadorVer2 j2;
	public TableroVer2 t;
	
	public TatetiVer2() {
		
		String nombre, ficha;
		
		t = new TableroVer2();
		
		nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		ficha = JOptionPane.showInputDialog("Elija una ficha(X, O)");
		j1 = new JugadorVer2(nombre, ficha);
		
		nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		ficha = JOptionPane.showInputDialog("Elija una ficha(X, O)");
		j2 = new JugadorVer2(nombre, ficha);
		
	}

	public void jugar() {
		
		for(int i=0; i<9;) {
			
			if(t.hayTateti()==false) {//t.hayTateti xq es en este tablero especifico
				j1.turnoActivo = true;
				t.mostrarMatriz();
				j1.jugada(t);//se pasa por parametro al objeto tablero creado mas arriba
				i++;
				t.mostrarMatriz();
				j1.turnoActivo = false;
				
				if(t.hayTateti()==false && i<9) {
					j2.turnoActivo=true;
					j2.jugada(t);
					i++;
					t.mostrarMatriz();
					j1.turnoActivo = false;
			
				}else {
					break;}
				
			}else {
				break;}
		}switch(t.ganador.toUpperCase()) {
		
		   case "O":  if(j1.fch.forma.equalsIgnoreCase("O")) {
					
					JOptionPane.showMessageDialog(null, "El ganador es: "+j1.nombre+" su ficha es: "+t.ganador);
						
					}else {
						
						JOptionPane.showMessageDialog(null, "El ganador es: "+j2.nombre+" su ficha es: "+t.ganador);
						
					}
					break;
			case "X":  if(j1.fch.forma.equalsIgnoreCase("X")) {
						
						JOptionPane.showMessageDialog(null, "El ganador es: "+j1.nombre+" su ficha es: "+t.ganador);
						
						}else {
							
							JOptionPane.showMessageDialog(null, "El ganador es: "+j2.nombre+" su ficha es: "+t.ganador);
							
						}	
					break;
			default: JOptionPane.showMessageDialog(null, " Empate ");
				break;
		}
	}
}
