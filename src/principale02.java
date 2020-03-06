import java.util.Scanner;


public class principale02 {

	public static void main(String[] args) {
		// declaration des variables
		int diviseur;
		
		double quotient, dividende;
		
		//enregistrement des valeur tapées par l'utilisateur.
		Scanner clavier = new Scanner(System.in);
		System.out.print("entrer le dividende :");
		dividende = clavier.nextDouble();
		System.out.print("Entré le diviseur : ");
		diviseur = clavier.nextInt();
		
		// calcule du quotient
		
		quotient = dividende/ diviseur;
		
		//affichage du resultat dans la consolle

		System.out.print("le quotient de la division est " + quotient);
		// permet de libere de la memoire
		clavier.close();
	}

}
