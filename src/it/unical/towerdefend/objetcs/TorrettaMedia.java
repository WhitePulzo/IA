package it.unical.towerdefend.objetcs;

public class TorrettaMedia extends Torretta {

	private int idTorre = 5;
	
	public TorrettaMedia(Mappa m, Position p) {
		super(m,p);
		matriceMappa[posizioneTorre.Row][posizioneTorre.Column] = idTorre;
	}

}
