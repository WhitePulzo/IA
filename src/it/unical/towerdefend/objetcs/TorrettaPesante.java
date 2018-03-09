package it.unical.towerdefend.objetcs;

public class TorrettaPesante extends Torretta {

	private int idTorre = 6;
	
	public TorrettaPesante(Mappa m, Position p) {
		super(m,p);
		matriceMappa[posizioneTorre.Row][posizioneTorre.Column] = idTorre;
	}

}
