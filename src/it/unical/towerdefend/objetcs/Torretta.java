package it.unical.towerdefend.objetcs;

public class Torretta {
	
	private int IdTorre = 0; // le torrette, nelle loro specializzazioni hanno un id
	public int prezzo;
	public int prezzoDiVendita; // se rivendi una torretta ci guadagni di meno
	Position posizioneTorre;
	Mappa mappaDiGIoco;

	public Torretta(Mappa m) {
		mappaDiGIoco = m;
	}

	public void attacca() {
		// la torretta valuta le posizioni che sono prossime ad essa, e le scorre con un for, appena trova un nemico, lo attacca ed esce dal for
		// magari l'area di attacco � una sottomatrice 3x3 o 5x5, dobbiamo trovare il metodo giusto per implementare
	}

	// forse questa cosa � meglio farla ad un livello pi� alto
	public void vendi() {
		// vende la torretta aumentando di un tot il forziere dei coin del
		// giocatore
	}
	
	// forse questa cosa � meglio farla ad un livello pi� alto
	public void compra() {
		// acquista uno dei tre tipi di torrette
	}

	public void posiziona(Position p) {
		posizioneTorre = p;
	}

}
