/**
 * 
 */
package perceptron.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author marce
 *
 */
public class TestUserPreg {
	
	private String path = "C:\\planilhas\\ArquivoTeste.csv";
	private List<Perceptron> testado;
	public List<Perceptron> trateTestado() throws IOException {

		Double Age;
		Double SystolicBP;
		Double DiastolicBP;
		Double BS;
		Double BodyTemp;
		Double HeartRate;
		int RiskLevel;

		testado = new ArrayList<Perceptron>();
		Reader reader = Files.newBufferedReader(Paths.get(path));
		BufferedReader br = new BufferedReader(new FileReader(path));
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
			Age = Double.parseDouble(vect[0]);
			SystolicBP = Double.parseDouble(vect[1]);
			DiastolicBP = Double.parseDouble(vect[2]);
			BS = Double.parseDouble(vect[3]);
			BodyTemp = Double.parseDouble(vect[4]);
			HeartRate = Double.parseDouble(vect[5]);
			

			
			
			RiskLevel = Integer.parseInt(vect[6]);

			
			Perceptron perceptron = new Perceptron(Age, SystolicBP, DiastolicBP, BS, BodyTemp, HeartRate, RiskLevel);
			testado.add(perceptron);
			line = br.readLine();
		}

		return testado;
	}
	
	


}
