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

		hp = 0;
		atk = 0;
		// velocita = 0;
		ID = 0;
		coordinata_X = 0;
		coordinata_Y = 0;
		this.m = m;
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

	public void setCoordinateX(int x) {
		coordinata_X = x;
	}

	public void setCoordinateY(int y) {
		coordinata_Y = y;
	}

	public boolean eAncoraVivo() {

		if (this.hp <= 0)
			return !eVivo;

		return eVivo;
	}

	public boolean danneggia(Proiettile colpo) {

		this.hp -= colpo.getDanno();

		// dopo aver subito il danno controllo se il nemico è ancora vivo se
		// ritorna vero il metodo significa che
		// il nemico è ancora vivo e quindi ritorno falso
		if (eAncoraVivo())
			return false;

		// altrimenti se ritorno vero vuol dire che il nemico è morto
		return true;
	}

	public void avanza() {

		int oldPosX = this.getCoordinateX();
		int oldPosY = this.getCoordinateY();

		int[][] matriceMappa = m.getMappaDiGioco();

		// invece di controllare la sottomatrice attorno al mostro controllo una
		// delle due possibil posizioni successive
		if (matriceMappa[oldPosX - 1][oldPosY] != 0) {
			this.setCoordinateX(oldPosX - 1);
			// se la posizione successiva può essere usata per avanzare vado
			// nella mappa e scrivo l'id corrente del mostro
			// invece la vecchia posizione viene settata a 0
			System.out.println("avanzo");
			matriceMappa[oldPosX][oldPosY] = 1;
			matriceMappa[this.getCoordinateX()][this.getCoordinateY()] = this.ID;
		}
		
		else if (matriceMappa[oldPosX + 1][oldPosY] != 0) {
			this.setCoordinateX(oldPosX + 1);
			System.out.println("avanzo");
			matriceMappa[oldPosX][oldPosY] = 1;
			matriceMappa[this.getCoordinateX()][this.getCoordinateY()] = this.ID;
		}

		else if (matriceMappa[oldPosX][oldPosY + 1] != 0) {
			System.out.println("avanzo2");
			this.setCoordinateY(oldPosY + 1);
			matriceMappa[oldPosX][oldPosY] = 1;
			matriceMappa[this.getCoordinateX()][this.getCoordinateY()] = this.ID;
		}
	}
}
