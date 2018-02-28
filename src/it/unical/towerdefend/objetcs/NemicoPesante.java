package it.unical.towerdefend.objetcs;

public class NemicoPesante extends Nemico {

	public NemicoPesante(Mappa m) {

		super(m);
		this.hp = 3;
		this.atk = 3;
		this.ID = 8;
		this.velocita = 0.4;
		this.setCoordinate(m.getSpawnX(), m.getSpawnY());
	}
}
