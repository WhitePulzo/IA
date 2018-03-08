package it.unical.towerdefend.objetcs;

public class TorrettaLeggera extends Torretta {

	private int idTorre = 4;
	
	public TorrettaLeggera(Mappa m, Position p) {
		super(m,p);
		matriceMappa[posizioneTorre.Row][posizioneTorre.Column] = idTorre;
	}


}
