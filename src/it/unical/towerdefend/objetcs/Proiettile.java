package it.unical.towerdefend.objetcs;

public interface Proiettile {

	// questa interfaccia rappresenta il colpo sparato dalle torri
	// avrà tre implementazioni, LightBullet, MediumBullet e HeavyBullet
	// ciascuna implementazione sarà associata ad un tipo di torre
	
	// ogni proiettile ha velocità istantanea
	int danno = 0;
	int getDanno();
	
}
