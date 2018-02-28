package it.unical.towerdefend.objetcs;

public class Torretta {
	
	private int IdTorre = 0; // le torrette, nelle loro specializzazioni hanno un id
	Mappa mappaDiGIoco;

	public Torretta(Mappa m) {
		mappaDiGIoco = m;
	}

	public void attacca() {
		// prende il primo mostro entrato nel suo range e lo attacca finchè non
		// va via dall'arntea coperta
	}

	public void vendi() {
		// vende la torretta aumentando di un tot il forziere dei coin del
		// giocatore
	}

	public void compra() {
		// acquista uno dei tre tipi di torrette
	}

	public void posiziona(Position p) {
		// decide in quale posizione della mappa di gioco mettere la suddetta torretta
	}

}
