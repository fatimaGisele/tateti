

public class TableroVer2 {

public String ganador=" empate ";//si gana x-o sera pisado por alguno de estos valores, sino mostrara este valor
public FichaVer2 m[][] = new FichaVer2[3][3];
	
	public void mostrarMatriz() {
	
		for(int f=0; f<3;f++) {
			for(int c=0; c<3; c++) {
			 if(m[f][c]==null) {
			 System.out.print("__"+" ");
			 }
			else {
			System.out.print(m[f][c].forma+" ");
			}
			//System.out.println(" ");
		}
		
			System.out.println(" ");}
	
	}

	
	public void ponerFicha(FichaVer2 fi) {
			
			if(m[fi.f][fi.c]==null) { //este metodo debe indicar ademas que ficha esta recibiendo y la pone en una posicion de 
				m[fi.f][fi.c]= fi;    //fila y columna
			}else {
				System.out.println("Lugar no disponible, escoja otro");
			}
		}
	
	public boolean hayTateti() {//con m[0][0] != null && nos aseguramos q el espacio este vacio
		
		if((m[0][0] != null && m[0][1]!=null && m[0][2]!=null) && m[0][0].forma==m[0][1].forma && m[0][1].forma==m[0][2].forma) {//primera fila
			
			ganador = m[0][2].forma;//se guarda en el atributo ganador la forma de la ficha ganadora, si es x-o
			System.out.println("Hay Tateti");
			return(true);
			
		}else if((m[1][0] != null && m[1][1]!=null && m[1][2]!=null) && m[1][0].forma==m[1][1].forma && m[1][1].forma==m[1][2].forma) {//segunda fila
			
			ganador = m[1][2].forma;
			System.out.println("Hay Tateti");
			return(true);
			
		}else if((m[2][0] != null && m[2][1]!=null && m[2][2]!=null) && m[2][0].forma==m[2][1].forma && m[2][1].forma==m[2][2].forma) {//tercera fila
			
			ganador = m[2][2].forma;
			System.out.println("Hay Tateti");
			return(true);
			
		}else if((m[0][0] != null && m[1][0]!=null && m[2][0]!=null) && m[0][0].forma==m[1][0].forma && m[1][0].forma==m[2][0].forma) {//primera columna
			
			ganador = m[0][0].forma;
			System.out.println("Hay Tateti");
			return(true);
			
		}else if((m[0][1] != null && m[1][1]!=null && m[2][1]!=null) && m[0][1].forma==m[1][1].forma && m[1][1].forma==m[2][1].forma) {//segunda columna
			
			ganador = m[0][1].forma;
			System.out.println("Hay Tateti");
			return(true);
			
		}else if((m[0][2] != null && m[1][2]!=null && m[2][2]!=null) && m[0][2].forma==m[1][2].forma && m[1][2].forma==m[2][2].forma) {//tercera columna
			
			ganador = m[0][2].forma;
			System.out.println("Hay Tateti");
			return(true);
			
		}else if((m[0][0] != null && m[1][1]!=null && m[2][2]!=null) && m[0][0].forma==m[1][1].forma && m[1][1].forma==m[2][2].forma) {//diagonal q baja
			
			ganador = m[1][1].forma;
			System.out.println("Hay Tateti");
			return(true);
			
		}else if((m[2][0] != null && m[1][1]!=null && m[0][2]!=null) && m[2][0].forma==m[1][1].forma && m[1][1].forma==m[0][2].forma) {//diagonal q sube
			
			ganador = m[2][0].forma;
			System.out.println("Hay Tateti");
			return(true);
			
		}else {
			return(false);
		}
	}
}
