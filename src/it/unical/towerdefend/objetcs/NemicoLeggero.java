package it.unical.towerdefend.objetcs;

public class NemicoLeggero extends Nemico {

	
	
	public NemicoLeggero(){
		
		super();
		this.hp=2;
		this.atk=1;
		this.ID=6;
		this.velocita=1.0;
		this.coordinata_X=m.getSpawnX();
		this.coordinata_Y=m.getSpawnY();
	}
	
}
