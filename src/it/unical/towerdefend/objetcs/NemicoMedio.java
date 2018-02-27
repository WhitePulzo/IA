package it.unical.towerdefend.objetcs;

public class NemicoMedio extends Nemico {

public NemicoMedio(){
		
		super();
		this.hp=1;
		this.atk=2;
		this.ID=7;
		this.velocita=1.5;
		this.coordinata_X=m.getSpawnX();
		this.coordinata_Y=m.getSpawnY();
	}
}
