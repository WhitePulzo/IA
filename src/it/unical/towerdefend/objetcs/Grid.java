package it.unical.towerdefend.objetcs;


public class Grid {

	public final int Row, Columns;

	//Oggetto griglia che ci aiuta a scrivere il file DLV in modo che la nostra matrice sia scritta proprio da
	//un insieme di CELLE che hanno una propria posizione RIGA/COLONNA
	public Grid(int Row, int Columns){
		
		this.Row=Row;
		this.Columns=Columns;
	}
	
}
