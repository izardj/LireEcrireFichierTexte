package presentation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("fichier.txt");
		FileReader fr = new FileReader(f1);
		
		File f2 = new File("fichier_crypte.txt");
		FileWriter fw = new FileWriter(f2);
		
		File f3 = new File("fichier_crypte.txt");
		FileReader fr2 = new FileReader(f3);
				
		File f4 = new File("fichier_decrypte.txt");
		FileWriter fw2 = new FileWriter(f4);
		
		// cryptage
		int c; // c contient la valeur ascii du character lu
		while((c=fr.read())!=-1){
			fw.write(c+1); // cryptage
		}
		
		fr.close();
		fw.close();
		
		// decryptage
		while((c=fr2.read())!=-1){
			fw2.write(c-1); // decryptage
		}
		

		fr2.close();
		fw2.close();
	}

}
