package it.unical.towerdefend.objetcs;

public class NemicoLeggero extends Nemico {

	
	
	public NemicoLeggero(Mappa m) {
		super(m);
		this.hp=2;
		this.atk=1;
		this.ID=6;
		this.velocita=1.0;
		this.setCoordinate(m.getSpawnX(),m.getSpawnY());
		
	}
	
}
