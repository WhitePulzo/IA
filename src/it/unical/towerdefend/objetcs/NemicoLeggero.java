package it.unical.towerdefend.objetcs;

public class NemicoLeggero extends Nemico {

	
	
	public NemicoLeggero(Mappa m, int numero) {
		super(m,numero);
		this.hp=2;
		this.atk=1;
		this.ID=6;
		this.velocita=1.0;
		this.setCoordinate(m.getSpawnX(),m.getSpawnY());
		
	}
	
}
