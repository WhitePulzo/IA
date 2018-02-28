package it.unical.towerdefend.objetcs;

public class GameManager {

	public static void main(String[] args) {

		Mappa m = new Mappa();
	
		NemicoLeggero ilNemico = new NemicoLeggero(m,1);
		ilNemico.setCoordinate(m.getSpawnX(), m.getSpawnY());
		
		GameLoop threadLoop = new GameLoop(m, ilNemico);
		threadLoop.start();
	}

}
