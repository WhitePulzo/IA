package it.unical.towerdefend.objetcs;

public class Position {

	int value;
	
	public int Row, Column;

	// setta la posizione nella mappa di un oggetto nemico/mostro
	public Position(int Row, int Column) {

		this.Row = Row;
		this.Column = Column;
	}

	// ritorna vero se la posizione è già occupata, falso se non lo è
	public boolean eqPos(Position pos) {

		return (this.Row == pos.Row && this.Column == pos.Column);
	}
	
	
}
