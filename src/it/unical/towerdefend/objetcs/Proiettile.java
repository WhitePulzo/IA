package it.unical.towerdefend.objetcs;

public interface Proiettile {

	// questa interfaccia rappresenta il colpo sparato dalle torri
	// avr� tre implementazioni, LightBullet, MediumBullet e HeavyBullet
	// ciascuna implementazione sar� associata ad un tipo di torre
	
	// ogni proiettile ha velocit� istantanea
	int danno = 0;
	int getDanno();
	
}
