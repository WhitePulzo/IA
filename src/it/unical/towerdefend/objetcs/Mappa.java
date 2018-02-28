package it.unical.towerdefend.objetcs;

import java.io.File;
import java.util.Scanner;

public class Mappa {
// class mappa
	private int [][] matrix;
	
	public int[][] create2DIntMatrixFromFile(String filename) throws Exception {

		File inFile = new File(filename);
		Scanner in = new Scanner(inFile);

		int intLength = 0;
		String[] length = in.nextLine().trim().split("\\s+");
		  for (int i = 0; i < length.length; i++) {
		    intLength++;
		  }

		in.close();

		matrix = new int[intLength][intLength];
		in = new Scanner(inFile);

		int lineCount = 0;
		while (in.hasNextLine()) {
		  String[] currentLine = in.nextLine().trim().split("\\s+"); 
		     for (int i = 0; i < currentLine.length; i++) {
		        matrix[lineCount][i] = Integer.parseInt(currentLine[i]);    
		            }
		  lineCount++;
		 }                                 
		 return matrix;
		}
	
	public int getSpawnX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSpawnY() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
