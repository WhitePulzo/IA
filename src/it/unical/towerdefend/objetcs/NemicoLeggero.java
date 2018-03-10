package it.unical.towerdefend.objetcs;

public class NemicoLeggero extends Nemico {

	
	
	public NemicoLeggero(Mappa m, int numero) {
		super(m,numero);
		this.hp=2;
		this.atk=1;
		this.ID=7;
		this.velocita=1.0;
		this.setCoordinate(m.getSpawnX(),m.getSpawnY());
		
	}
	
	@Override
	public void hurt() {
		// TODO Auto-generated method stub
		super.hurt();
		System.out.println("sono un nemico leggero e ho preso danno");
	}
	
}
