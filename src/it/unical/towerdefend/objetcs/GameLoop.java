package it.unical.towerdefend.objetcs;

public class GameLoop extends Thread {

	Mappa mappaDiGioco;
	NemicoLeggero nemicoTest;
	TorrettaLeggera torrettaTest;
	TorrettaLeggera torrettaTest2;

	public GameLoop(Mappa m, NemicoLeggero l, TorrettaLeggera t, TorrettaLeggera t2) {
		mappaDiGioco = m;
		torrettaTest = t;
		torrettaTest2 = t2;
		nemicoTest = l;
	}

	public void run() {

		while (true) {
			if (nemicoTest.eAncoraVivo())
			nemicoTest.avanza();
			
			torrettaTest.attacca(); // da fare solo se il nemico � nel range
			torrettaTest2.attacca();
			
			mappaDiGioco.print2D();
			System.out.println();
			System.out.println();
			System.out.println();

			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
