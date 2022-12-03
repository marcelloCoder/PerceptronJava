/**
 * 
 */
package perceptron.classes;

import java.util.List;
import java.util.Random;

/**
 * @author marce
 *
 */
public class ClasseTreino {

	private double n = 0.1;
	private int bias = -1;

	public int ativacao(double resultado) {
		if (resultado < 33.1) {
			return 1;
		} else {
			if (resultado >= 33.1 && resultado < 60) {
				return 2;
			} else {
				return 3;
			}
		}

	}

	public double[] matrizPeso() {
		double[] w = new double[6];
		int i;
		Random random = new Random();
		for (i = 0; i < 6; i++) {
			w[i] = random.nextDouble(1);
			if (i % 2 == 0) {
				w[i] *= -1;
			}
		}
		return w;
	}
	
	public double[] treinamento(List<Perceptron> mps) {
		int epoca = 0;
		double w[] = matrizPeso();
		boolean erro = false;
		Double resultado = 0.0;
		int y = 0;
		do {
			erro = false;
			for (Perceptron p : mps) {
				resultado += w[0] * p.getAge(); 
				resultado += w[1] * p.getBodyTemp();
				resultado += w[2] * p.getBS();
				resultado += w[3] * p.getDiastolicBP();
				resultado += w[4] * p.getHeartRate();
				resultado += w[5] * p.getSystolicBP();
				resultado -= bias;

				y = ativacao(resultado);
				

				if (y != p.getRiskLevel()) {
					w[0] = w[0] + n * (p.getRiskLevel() - y) * p.getAge();
					w[1] = w[1] + n * (p.getRiskLevel() - y) * p.getBodyTemp();
					w[2] = w[2] + n * (p.getRiskLevel() - y) * p.getBS();
					w[3] = w[3] + n * (p.getRiskLevel() - y) * p.getDiastolicBP();
					w[4] = w[4] + n * (p.getRiskLevel() - y) * p.getHeartRate();
					w[5] = w[5] + n * (p.getRiskLevel() - y) * p.getSystolicBP();
					erro = true;
				}
			}
			epoca++;
		} while (epoca < 1000 && erro == false);
		return w;
	}

	public int operacoes(Perceptron p, double[] w) {
		double resultado = 0.0;
		resultado += w[0] * p.getAge();
		resultado += w[1] * p.getBodyTemp();
		resultado += w[2] * p.getBS();
		resultado += w[3] * p.getDiastolicBP();
		resultado += w[4] * p.getHeartRate();
		resultado += w[5] * p.getSystolicBP();

		return ativacao(resultado);
	}
}
