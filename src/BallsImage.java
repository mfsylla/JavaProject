
/////////////////////
import javax.swing.*;
//////////////////////////////////

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import java.net.*;
public class BallsImage extends JFrame {
	Image image;
	Image image2;
/*  JPanel contentPane;
    JLabel imageLabel = new JLabel();
    JLabel headerLabel = new JLabel();*/
	
    
    
	String phrase = "Salut";
	int x;
//	int Number[] = {9,19,29,39,49};
//	int Number[] = {49,39,29,19,9};
	int Number[]=null;
	//int Possition_X_Numbers[]={100,300,500,700,900};
	int Possition_X_Numbers[]={80,170,360,720,990};
	int Possition_Y_Numbers[]= {450,350,250,350,450};
	int taille_Y[]= {100,200,300,200,100};
	int taille_X[]= {175,350,525,350,175};
	Image imagen;

	
	// Constructeur
	public BallsImage(int x, int Numeros[]) {

		// Ici "this" dessigne le "JFrame" qu'on utilisera , c'est à dire la fenetre. On
		// declare ses proprietés principales
		// décrites ci-dissous.
		this.setTitle("Remember g for Graphics");
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/*		ImageIcon ii = new ImageIcon(this.getClass().getResource("gif_feu_1.gif"));
	    imageLabel.setIcon(ii);
	    contentPane.add(imageLabel, java.awt.BorderLayout.NORTH);*/

		this.setVisible(true);
		this.setLocation(0, 0);
		this.x = x;
		this.Number = Numeros;

	//	ImageIcon img = new ImageIcon(getClass().getResource("gif_feu_1.gif"));
		/***********************************
		 * Save Image
		 ********************************/
		/*
		 * D'abord on deffinit la variable BufferedImage, elle sert à mettre la fenetre
		 * faite en JFrame dans le Buffer, ceci est comme une PIPE qui contient la
		 * fenetre qui se montre dans l'écrans
		 * 
		 * Ensuite on peint le buffer dans la variable graphics 2
		 * 
		 * A la fin de l'execution, l'image est entierment faite et sauvegardé dans le
		 * disque.
		 * 
		 * NB: il faut TOUJOURS le faire dans un try-catch
		 * 
		 */
		try {
			BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
			Graphics2D graphics2D = image.createGraphics();
			this.paint(graphics2D);
			ImageIO.write(image, "jpeg", new File("jmemPractice.jpeg"));
		} catch (Exception exception) {
			// code
			System.out.println("Nothing");
		}

		/*******************************
		 * Fin du Save Image
		 ********************************/
	}
	
	public int calculateur_de_taille(int x) {
	//	double val=2.2*x+70; //180 si x=50
		double val=4.6*x+20; //250 si x=50
		int resultat=(int)val;
		return resultat;
	}
	
	public int calculateur_de_taille_etoile(int x) {
		//	double val=2.2*x+70; //180 si x=50
			double val=16.6*x+40; //300 si x=12
			int resultat=(int)val;
			return resultat;
		}
	
	public void peindre_2(Graphics g, int Pos_X, int taille_y,int taille_x, int hauteur ,int numero) {

			Graphics2D g2 = (Graphics2D) g;
			
			if(numero<10) {
				ImageIcon i = new ImageIcon("images/jaune.gif");
				 image = i.getImage();
				 g.drawImage(image, Pos_X, hauteur,taille_x,taille_y, null);
			}else 
			{
				if(numero<20) {
					ImageIcon i = new ImageIcon("images/vert.gif");
					 image = i.getImage();
					 g.drawImage(image, Pos_X, hauteur,taille_x,taille_y, null);
				}else {
					if(numero<30)
					{
						ImageIcon i = new ImageIcon("images/rouge.gif");
						 image = i.getImage();
						 g.drawImage(image, Pos_X, hauteur,taille_x,taille_y, null);
					}else {
						if(numero<40) {
							ImageIcon i = new ImageIcon("images/bleu.gif");
							 image = i.getImage();
							 g.drawImage(image, Pos_X, hauteur,taille_x,taille_y, null);
						}else {
							if(numero<=50)
							{
								ImageIcon i = new ImageIcon("images/magenta.gif");
								 image = i.getImage();
								 g.drawImage(image, Pos_X, hauteur,taille_x,taille_y, null);
							}
						}
					}
				}
			}
			// g.drawOval(500, 500, 70, 70); //Cercle non rempli
			
		//	g2.fillOval(Pos_X, hauteur /*450*/, taille, taille); // Cercle rempli
			
			//g.fillOval(Pos_X, y, width, height);
			g.setColor(Color.BLACK);
			g.setFont(new Font("Arial", Font.BOLD, taille_y/2));
			if(numero>=10) {
			g.drawString(String.valueOf(numero), Pos_X + taille_x/3 , hauteur + (int)(taille_y-taille_y/3));}
			else {
				g.drawString(String.valueOf(numero), Pos_X + (int)(taille_x/2.5) , hauteur + (int)(taille_y-taille_y/3));
			}
				
		}
	
	
	public void etoile(Graphics g, int n1, int n2) {
	/*	g.setColor(Color.YELLOW);
	g.fillPolygon(new int[] {100,125,150,200,250,250,300,350,400,450}, new int[] {600,700,630,600,680,550,600,630,700,600},10);*/
		ImageIcon i = new ImageIcon("images/star.png");

		 image = i.getImage();
	/*	 int taille=calculateur_de_taille_etoile(n1);
		 g.drawImage(image, 25, 450,(int)taille,(int)taille, null);*/
		 g.drawImage(image, 25, 100,300,300, null);
		 g.setColor(Color.WHITE);
		 g.setFont(new Font("Arial", Font.BOLD, 200));
		 g.drawString(String.valueOf(n1),120 , 330);
		 
		 /*int taille=calculateur_de_taille_etoile(n2);
		 g.drawImage(image, 275, 450,(int)taille,(int)taille, null);*/
		 g.drawImage(image, 880, 100,300,300, null);
		 g.setFont(new Font("Arial", Font.BOLD, 200));
		 g.drawString(String.valueOf(n2), 920 ,330);
		 
	}
	

	public void peindre(Graphics g, Color c) {
		g.setColor(c);
		g.drawOval(300, 500, 70, 70); // 130 130

	}
	
	public void peindre_3(Graphics g, Color c) {
		// Rectangle

		g.setColor(c);
		// g.drawRect (300, 400, 70, 70); //rectangle non remplir
		// g.setColor(Color.GREEN);
		g.fillRect(300, 300, 70, 70); // remplir rectangle

		// Ovale-cercle

		g.setColor(c);
		// g.drawRect (300, 400, 70, 70); //rectangle non remplir
		// g.setColor(Color.GREEN);
		g.fillOval(500, 300, 70, 70); // remplir rectangle

		g.setColor(c);
		// g.drawRect (300, 400, 70, 70); //rectangle non remplir
		// g.setColor(Color.GREEN);
		g.fillArc(700, 300, 100, 100, 75, 40); // remplir rectangle

		g.setColor(c);
		// g.drawRect (300, 400, 70, 70); //rectangle non remplir
		// g.setColor(Color.GREEN);

		// g.fill (900, 300, 70,70); //remplir rectangle

	}
	
	public void paint(Graphics g) {
		
		
		 // Les variables Images se trouvent ici, c est pour ouvrir ou fermer des images en background
		/* ImageIcon image_bakground = new ImageIcon("images/las vegas.jpg");

		 image = image_bakground.getImage();
		 g.drawImage(image, 0, 0, null);*/
		
		
		/*
		 * PRINCIPES GENERAL DES DESSINS
		 * 
		 * 1) D'abord on definit la couleur que nous allons utiliser avec
		 * setColor(Color.RED(ou autre)); 2) Ensuite on definit la figure qui est
		 * dessiné ou rempli (draw=dessiner, fill=remplir) et elle sera coloré avec la
		 * couleur defini précedament.
		 * 
		 * 3) On change la couleur fur et à mesure au moment que nous voulons mettre une
		 * nouvelle figure avec une nouvelle couleur
		 */

		// Couleur par défault du fond, il faut le peindre pour que cela apparaisse dans
		// l'image qu'on sauvedardera
		Color pardefault = new java.awt.Color(235, 235, 235); // c'est la couleur GRIS par défault des programmes
		g.setColor(pardefault); // J'implemente cette couleur dans la figure suivante:
		g.fillRect(0, 0, 1280, 720); // La couleur s'implementde dans un retangle rempli qui se met dans le
										// background.
	
		 ImageIcon image_background = new ImageIcon("images/las vegas.jpg");

		 image = image_background.getImage();
		 
		 g.drawImage(image, 0, 0,1280,720, null);
	
		 
		for (int i =0; i <5 ; i++)  //Number.length
		{
		if(Number[i] >= 1 && Number[i] <10)
		{
			peindre_2(g,Possition_X_Numbers[i],taille_Y[i],taille_X[i],Possition_Y_Numbers[i],Number[i]);
		}
		
		if(Number[i] >= 10 && Number[i] <20)
		{
			peindre_2(g,Possition_X_Numbers[i],taille_Y[i],taille_X[i],Possition_Y_Numbers[i],Number[i]);
		}
		if(Number[i] >= 20 && Number[i] <30)
		{
			peindre_2(g,Possition_X_Numbers[i],taille_Y[i],taille_X[i],Possition_Y_Numbers[i],Number[i]);
		}
		if(Number[i] >= 30 && Number[i] <40)
		{
			peindre_2(g,Possition_X_Numbers[i],taille_Y[i],taille_X[i],Possition_Y_Numbers[i],Number[i]);
		}
		if(Number[i] >= 40 && Number[i] <=50)
		{
			peindre_2(g, Possition_X_Numbers[i],taille_Y[i],taille_X[i],Possition_Y_Numbers[i],Number[i]);
		}
		}
		
		
		
		etoile(g,Number[5],Number[6]);
		g.setFont(new Font("Arial", Font.BOLD, x));
		//g.drawString(phrase, 77, 100);
		
		GradientPaint dessin_degrade =  new GradientPaint(50,50 , Color.ORANGE , 100 , 50, Color.YELLOW,true); //sans true si 
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(dessin_degrade);
		g2.drawString("Euro Millions", 370,200);
	

		//Image animé marche mais avec blinking
	/*	ImageIcon imagen = new ImageIcon("images/gif_feu_1.gif");
		g2.drawImage(imagen.getImage(), getWidth()/2, getHeight()/2, this);*/
		
		//ça marche pas
	/*	Image imagen;
		imagen = Toolkit.getDefaultToolkit().createImage("images/gif_feu_1.gif");
		if (image != null) 
	    {
			g2.drawImage(imagen, 0, 0, this);
	    }*/
		
		
/*		ImageIcon imagen = new ImageIcon("images/gif_feu_1.gif");

		 image = imagen.getImage();
	//	 int taille=calculateur_de_taille_etoile(n1);
		 g.drawImage(image, 25, 450,300,300, null);
		
		Image image;
		 image = Toolkit.getDefaultToolkit().createImage("images/gif_feu_.gif");
		 g.drawImage(image,100 , 100, this);*/

	}

}
