package it.unical.towerdefend.objetcs;

public class NemicoPesante extends Nemico {

	public NemicoPesante(){
		
		super();
		this.hp=3;
		this.atk=3;
		this.ID=8;
		this.velocita=0.4;
		this.coordinata_X=m.getSpawnX();
		this.coordinata_Y=m.getSpawnY();
	}
}
