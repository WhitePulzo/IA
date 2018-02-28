package it.unical.towerdefend.objetcs;

public class NemicoPesante extends Nemico {

	public NemicoPesante(Mappa m, int numero) {

		super(m,numero);
		this.hp = 3;
		this.atk = 3;
		this.ID = 8;
		this.velocita = 0.4;
		this.setCoordinate(m.getSpawnX(), m.getSpawnY());
	}
}
