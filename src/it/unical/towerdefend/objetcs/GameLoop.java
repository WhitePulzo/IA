package it.unical.towerdefend.objetcs;

public class GameLoop extends Thread {

	Mappa mappaDiGioco;
	NemicoLeggero nemicoTest;

	public GameLoop(Mappa m, NemicoLeggero l) {
		mappaDiGioco = m;
		nemicoTest = l;
	}

	public void run() {

		while (true) {
			mappaDiGioco.print2D();
			nemicoTest.avanza();
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
