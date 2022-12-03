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
public class UserPreg {

	private String path = "C:\\planilhas\\ArquivoFormatado.csv";
	private List<Perceptron> original;


	public List<Perceptron> trateOriginal() throws IOException {

		Double Age;
		Double SystolicBP;
		Double DiastolicBP;
		Double BS;
		Double BodyTemp;
		Double HeartRate;
		int RiskLevel;

		original = new ArrayList<Perceptron>();
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
			original.add(perceptron);
			line = br.readLine();
		}

		return original;
	}

	private UserPreg getEnclosingInstance() {
		return UserPreg.this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((original == null) ? 0 : original.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPreg other = (UserPreg) obj;
		if (original == null) {
			if (other.original != null)
				return false;
		} else if (!original.equals(other.original))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserPreg [path=" + path + ", original=" + original + "]";
	}

	
	


	


}
