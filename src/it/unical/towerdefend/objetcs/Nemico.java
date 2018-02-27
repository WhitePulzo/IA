package it.unical.towerdefend.objetcs;

public class Nemico {

	protected int hp;
	protected int atk;
	protected double velocita;
	protected int ID;

	protected boolean eVivo = true;
	protected int coordinata_X, coordinata_Y;

	protected Mappa m;

	 public Nemico(Mappa m) {
	
		 hp = 0 ;
		 atk = 0;
		 velocita = 0 ;
		 ID = 0;
		 coordinata_X = 0 ;
		 coordinata_Y = 0;
	 this.m = m;
	 }

	 
	public Nemico() {
		
	}


	public void setCoordinate(int X, int Y) {

		this.coordinata_X = X;
		this.coordinata_Y = Y;
	}

	public int getCoordinateX() {

		return coordinata_X;
	}

	public int getCoordinateY() {

		return coordinata_Y;
	}

	public boolean eAncoraVivo() {

		if (this.hp <= 0)
			return !eVivo;

		return eVivo;
	}

	public boolean Danneggia(Proiettile colpo) {

		this.hp -= colpo.getDanno();
		
		//dopo aver subito il danno controllo se il nemico è ancora vivo se ritorna vero il metodo significa che
		//il nemico è ancora vivo e quindi ritorno falso
			if(eAncoraVivo())
				return false;
		
		//altrimenti se ritorno vero vuol dire che il nemico è morto
		return true;
	}
	
	
}
