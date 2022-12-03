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
import java.util.Scanner;

import perceptron.classes.ClasseTreino;
import perceptron.classes.Perceptron;
import perceptron.classes.TestUserPreg;
import perceptron.classes.UserPreg;

/**
 * @author marce
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*File file = new File("C:\\planilhas\\ArquivoFormatado.csv");

		Scanner sc = null;

		try {
			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());

			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		
		System.out.println("-----------------------------------------------------");
		
		Perceptron perceptron = new Perceptron();*/
		
		
     
       int trgt = 0;
       double accuracy = 0.0;
       
       UserPreg userp = new UserPreg();
       
       TestUserPreg tuser = new TestUserPreg();
       
       ClasseTreino treino = new ClasseTreino();
       
       double w[] = treino.treinamento(userp.trateOriginal());
       for(Perceptron p : tuser.trateTestado()){
           int vect = treino.operacoes(p, w);
           if(vect == p.getRiskLevel()){
               trgt++;
           }
           
       }
       accuracy = (trgt*100)/tuser.trateTestado().size();
       System.out.println("\nTAXA DE PRECISÂO : " + accuracy );
		
	}

}
