package it.unical.towerdefend.objetcs;

public class NemicoMedio extends Nemico {

	public NemicoMedio(Mappa m) {

		super(m);
		this.hp = 1;
		this.atk = 2;
		this.ID = 7;
		this.velocita = 1.5;
		this.setCoordinate(m.getSpawnX(), m.getSpawnY());
	}
}
