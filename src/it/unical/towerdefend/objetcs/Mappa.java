package it.unical.towerdefend.objetcs;

public class Mappa {
	// class mappa
	private int mappaDiGioco[][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 1, 0, 0, 0, 0, 0 },
			{ 2, 1, 1, 0, 1, 1, 0, 1, 1, 3 }, { 0, 0, 0, 0, 0, 1, 0, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	public int[][] getMappaDiGioco() {
		return mappaDiGioco;
	}

	public int getSpawnX() {
		// TODO Auto-generated method stub
		return 5;
	}

	public int getSpawnY() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void print2D() {
		// Loop through all rows
		for (int i = 0; i < mappaDiGioco.length; i++) {
			for (int j = 0; j < mappaDiGioco[i].length; j++) {
				System.out.print(mappaDiGioco[i][j] + " ");
			}
			System.out.println();
		}

	}

}
