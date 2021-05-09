import javax.swing.JOptionPane;

public class JugadorVer2 {

	public String nombre;
	public int puntaje;
	public boolean turnoActivo;
	public FichaVer2 fch; //public Ficha f = new Ficha(); fch es un objeto de ficha, es un string, es una ficha generica, puede ser x-o, los valores de fila
						//y columna debemos pasarselos nosotros
	
	
	public JugadorVer2(String n,String ficha) {
		nombre = n;
		fch = new FichaVer2(ficha);
		
	}
	


	public void jugada(TableroVer2 tab) {
		
		if(turnoActivo==true) {
			
			int j1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de posicion: \n1, 2, 3 \n4, 5, 6 \n7, 8, 9."));
			
			switch(j1) {
				case 1: fch.f = 0;
						fch.c = 0;
						tab.ponerFicha(fch);//al metodo ponerFicha le pasamos la ficha q se va a poner x-o, el objeto ficha, para eso antes se debe
					break;                 //indicar donde queremos q este esa ficha.
				case 2: fch.f = 0;//entonces le pasamos al objero ficha la posicion de columna q queremos q tenga
						fch.c = 1;
						tab.ponerFicha(fch); //el objeto ficha tiene adentro los atributos fila y columna
					break;
				case 3:	fch.f = 0;//utilizamos el onjeto fch que cada jugador tiene para llamar al metodo ponerFicha del objeto Tablero, le pasamos
						fch.c = 2;//la ficha donde adentro le pusimos la fila y la columna en la q queremos q coloq la ficha
						tab.ponerFicha(fch);//xq el objeto fch recibe la fila y la columna fch.c = 2 del objeto q le pasamos
					break;
				case 4:	fch.f = 1;
						fch.c = 0;
						tab.ponerFicha(fch);
					break;
				case 5: fch.f = 1;
						fch.c = 1;
						tab.ponerFicha(fch);
					break;
				case 6: fch.f = 1;
						fch.c = 2;
						tab.ponerFicha(fch);
					break;
				case 7: fch.f = 2;
						fch.c = 0;
						tab.ponerFicha(fch);
					break;
				case 8: fch.f = 2;
						fch.c = 1;
						tab.ponerFicha(fch);
					break;
				case 9: fch.f = 2;
						fch.c = 2;
						tab.ponerFicha(fch);
					break;
				default:
					JOptionPane.showMessageDialog(null, "posicion incorrecta" + "");
					break;
				}
			}else {
				JOptionPane.showMessageDialog(null, "turno perdido");
			}
		}
}
