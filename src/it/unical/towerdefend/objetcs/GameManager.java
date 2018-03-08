package it.unical.towerdefend.objetcs;

public class GameManager {

	public static void main(String[] args) {

		Mappa m = new Mappa();
	
		
		NemicoLeggero ilNemico = new NemicoLeggero(m,1);
		ilNemico.setCoordinate(m.getSpawnX(), m.getSpawnY());
		
		TorrettaLeggera t = new TorrettaLeggera(m, new Position(0, 0));
		TorrettaLeggera t2 = new TorrettaLeggera(m, new Position(5, 6));
		t.init();
		t2.init();
		
		
		GameLoop threadLoop = new GameLoop(m, ilNemico, t, t2);
		threadLoop.start();
	}

}
