package it.unical.towerdefend.objetcs;

import java.util.HashSet;

public class Torretta {

	private int IdTorre = 0; // le torrette, nelle loro specializzazioni hanno
								// un id
	public int prezzo;
	public int prezzoDiVendita; // se rivendi una torretta ci guadagni di meno
	Position posizioneTorre;
	HashSet<Position> posizioniAdiacenti = new HashSet<Position>();
	Mappa mappaDiGIoco;
	int[][] matriceMappa;
	int raggioTorre = 3;

	public Torretta(Mappa m, Position posizione) {
		mappaDiGIoco = m;
		matriceMappa = mappaDiGIoco.getMappaDiGioco();
		posizioneTorre = posizione;

	}

	public void init() {

		// controllare out of bound

		// questo metodo si fa dopo aver inizializzato una torretta

		int posTorreX = posizioneTorre.Row;
		int posTorreY = posizioneTorre.Column;

		// devo usare while perchè se uso l'if lo faccio solo una volta, e non
		// potrebbe bastare

		while (posTorreX - 1 < 0)
			posTorreX++;

		while (posTorreY - 1 < 0)
			posTorreY++;

		while (posTorreX + 1 > matriceMappa.length)
			posTorreX--;

		while (posTorreY + 1 > matriceMappa.length)
			posTorreY--;

		for (int i = posTorreX - 1; i < posTorreX + raggioTorre -1; i++) {
			for (int j = posTorreY - 1; j <posTorreY + raggioTorre -1; j++) {
				// se è un pezzo di path contenuto nel mio range va bene
				if (matriceMappa[i][j] == 1)
				{
//					System.out.println("trovato");
					posizioniAdiacenti.add(new Position(i, j));
					System.out.println("numero adiacenti: "+posizioniAdiacenti.size());
				}

			}
		}

//		System.out.println("posizioni adiacenti: " + posizioniAdiacenti.size());
	}

	public void attacca() {

		// scorre la matrice nelle posizioni adiacenti, se trova un valore
		// diverso da 1 attacca

		for (Position posizione : posizioniAdiacenti) {
			if (matriceMappa[posizione.Row][posizione.Column] != 1) {
				matriceMappa[posizione.Row][posizione.Column] = 1;
			}
		}

	}

	// forse questa cosa è meglio farla ad un livello più alto
	public void vendi() {
		// vende la torretta aumentando di un tot il forziere dei coin del
		// giocatore
	}

	// forse questa cosa è meglio farla ad un livello più alto
	public void compra() {
		// acquista uno dei tre tipi di torrette
	}

	public void posiziona(Position p) {
		posizioneTorre = p;
	}

	public void cercaNemico() {

	}

}
