/**
 * 
 */
package perceptron.executavel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import perceptron.classes.Perceptron;

/**
 * @author marce
 *
 */
public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String path = "C:\\planilhas\\ArquivoFormatado.csv";
		
		List<Perceptron> list = new ArrayList<Perceptron>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				
				
				
				String[] vect = line.split(",");
				if (vect[6].equals("low risk")) {
					vect[6] = "1";
				} else {
					if (vect[6].equals("mid risk")) {
						vect[6] = "2";
					} else {
						vect[6] = "3";
					}
				}
				
				Double Age = Double.parseDouble(vect[0]);
				Double SystolicBP = Double.parseDouble(vect[1]);
				Double DiastolicBP = Double.parseDouble(vect[2]);
				Double BS = Double.parseDouble(vect[3]);
				Double BodyTemp = Double.parseDouble(vect[4]);
				Double HeartRate = Double.parseDouble(vect[5]);
				//Integer qte = Integer.parseInt(vect[2]);
				
				Integer RiskLevel = Integer.parseInt(vect[6]);
				
				Perceptron perceptron = new Perceptron(Age, 
						SystolicBP, 
						DiastolicBP,
						BS, 
						BodyTemp, 
						SystolicBP, 
						RiskLevel);
				list.add(perceptron);
				
				line = br.readLine();
				
				
			}	
			
			System.out.println("PERCEPTRON:");
			for (Perceptron p : list) {
			
				System.out.println(p);
			}
			
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			
			
			
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
	
}
