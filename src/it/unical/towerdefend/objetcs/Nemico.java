package it.unical.towerdefend.objetcs;

import java.util.HashMap;

public class Nemico {

	protected int hp;
	protected int atk;
	protected double velocita;
	protected int ID;
	protected int numero;

	private int oldPositionX = 0, oldPositionY = 0;
	protected boolean eVivo = true;
	protected Position pos;

	protected Mappa m;

	public Nemico(Mappa m, int numero) {

		hp = 0;
		atk = 0;
		// velocita = 0;
		ID = 0;
		this.m = m;
		this.numero = numero;
		pos = new Position(m.getSpawnX(), m.getSpawnY());
//		m.posizioneNemiciMap.put(this.pos, this);
	}

	public void setCoordinate(int X, int Y) {

//		m.posizioneNemiciMap.remove(this.pos);
		
		pos.Row = X;
		pos.Column = Y;

		// come mai la size rimane sempre uno?
		m.posizioneNemiciMap.put(this.pos, this);

		HashMap<Position, Nemico> map = m.posizioneNemiciMap;
		for (Position key : map.keySet()){
			System.out.print("row: "+key.Row + "  column: "+key.Column);
			System.out.println("contiene "+map.get(key).getClass().getSimpleName());
//			map.get(key).hurt();
		}
	}


	public int getCoordinateX() {

		return pos.Row;
	}

	public int getCoordinateY() {

		return pos.Column;
	}

	public Position getPosition() {

		return pos;
	}

	public boolean eAncoraVivo() {

		if (this.hp <= 0)
			return !eVivo;

		return eVivo;
	}

	public void hurt(){
		System.out.println("ho preso Danno");
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

	public void uccidi(){
		System.out.println("sono un nemico e sono stato ucciso");
		eVivo = false;
	}
	
	public void avanza() {
		
		// il mostro per ora si muove perchè non c'è nessuno che setta il suo essere vivo a false
		if (!eVivo)
			return;
		
		int newPos = 0;

		int[][] matriceMappa = m.getMappaDiGioco();

		// invece di controllare la sottomatrice attorno al mostro controllo una
		// delle due possibil posizioni successive
		if (matriceMappa[pos.Row - 1][pos.Column] == 1) {
			newPos = pos.Row - 1;
			if (this.oldPositionX != newPos) {
				oldPositionX = this.getCoordinateX();
				oldPositionY = this.getCoordinateY();
				setCoordinate(newPos, pos.Column);
				// se la posizione successiva può essere usata per avanzare vado
				// nella mappa e scrivo l'id corrente del mostro
				// invece la vecchia posizione viene settata a 0
				System.out.println("avanzo");
				matriceMappa[oldPositionX][oldPositionY] = 1;
				matriceMappa[this.getCoordinateX()][this.getCoordinateY()] = this.ID;
				return;
			}
		}

		if (matriceMappa[pos.Row + 1][pos.Column] == 1) {
			newPos = pos.Row + 1;
			if (this.oldPositionX != newPos) {
				oldPositionX = this.getCoordinateX();
				oldPositionY = this.getCoordinateY();
				setCoordinate(newPos, pos.Column);
				System.out.println("avanzo");
				matriceMappa[oldPositionX][oldPositionY] = 1;
				matriceMappa[this.getCoordinateX()][this.getCoordinateY()] = this.ID;
				return;
			}
		}

		if (matriceMappa[pos.Row][pos.Column + 1] == 1) {
			System.out.println("avanzo2");
			newPos = pos.Column + 1;
			if (this.oldPositionY != newPos) {
				oldPositionX = this.getCoordinateX();
				oldPositionY = this.getCoordinateY();
				setCoordinate(pos.Row, newPos);
				matriceMappa[oldPositionX][oldPositionY] = 1;
				matriceMappa[this.getCoordinateX()][this.getCoordinateY()] = this.ID;
				return;
			}
		}
		
	}
}
