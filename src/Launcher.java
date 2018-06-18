import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*La variable envoye_valeur_pour_essayer_fonction est tt simplement utilisée pour envoyer une valeur et verifier
		si la fonction BallsImage la prend en compte pour dessiner le mot en gras en fonction decette variable.*/
		int envoye_valeur_pour_essayer_fonction=80;
     //	int Number[] = {9,19,29,39,49};
	//	int Number[] = {49,39,29,19,9,20,40};
	//	int Number[] = {5,3,2,20,30,1,11};
		int Number[] = {30,15,10,5,25,9,8};
		new BallsImage(envoye_valeur_pour_essayer_fonction,Number);
		
	    }
		
	}


