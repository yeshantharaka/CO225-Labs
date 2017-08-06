import java.util.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Fractal{
	private final static int WIDTH = 800;
	private final static int HEIGHT = 800;
	final static BufferedImage img = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
	
	public static void main(String[] args){
		if(args[0].equals("Mandelbrot")){
			double real = Double.parseDouble(args[1]);
			double realEnd = Double.parseDouble(args[2]);
			double complex = Double.parseDouble(args[3]);
			double complexEnd = Double.parseDouble(args[4]);
			int loop = Integer.parseInt(args[5]);
			
			double complexRange = (complexEnd - complex)/HEIGHT; 
			double realRange = (realEnd - real)/WIDTH;
			
			for(int i=0; i< WIDTH; i++){
				for(int j=0; j< HEIGHT; j++){
					double z1 = 0.0;
					double z2 = 0.0;
					int index = 0;
					for(int k=1; k<=loop; k++){
						double c1 = realRange*i + real;
						double c2 = complexRange*j + complex;
						double comp[] = complexSquare(z1,z2);
						if(complexAbs(comp[0]+c1,comp[1]+c2)>2){
							
							index  = k;
							break;
						} else {
							index = k;
							z1 = comp[0] + c1;
							z2 = comp[1] + c2;
						}
							
					}
					int rem = index%4;
					if(rem==0){
						img.setRGB(i,j,Color.blue.getRGB());
					} else if(rem==1){
						img.setRGB(i,j,Color.black.getRGB());
					} else if(rem==2){
						img.setRGB(i,j,Color.green.getRGB());
					} else {
						img.setRGB(i,j,Color.white.getRGB());
					}
					//img.setRGB(i,j,index<<8);
				}
			}
		}
		
		if(args[0].equals("Julia")){
			double realJ = Double.parseDouble(args[1]);
			double complexJ = Double.parseDouble(args[2]);
			int loopJ = Integer.parseInt(args[3]);
			
			double complexRangeJ = 2.0/HEIGHT; 
			double realRangeJ = 2.0/WIDTH;
			
			for(int l=0; l<WIDTH; l++){
				for(int m=0; m<HEIGHT; m++){
					double zj1=(l*realRangeJ) + (-1.0);
					double zj2=(m*complexRangeJ) + (-1.0);
					int indexJ = 0;
					for(int n=1; n<=loopJ; n++){
						double compJ[] = complexSquare(zj1,zj2);
						if(complexAbs((compJ[0]+realJ),(compJ[1]+complexJ))>2){
							indexJ = n;
							break;
						} else {
							zj1 = compJ[0]+realJ;
							zj2 = compJ[1]+complexJ;
						}
					}
										
					/*int remJ=indexJ%4;
					if(remJ==0){
						img.setRGB(l,m,Color.blue.getRGB());
					} else if(remJ==1){
						img.setRGB(l,m,Color.black.getRGB());
					} else if(remJ==2){
						img.setRGB(l,m,Color.pink.getRGB());
					} else {
						img.setRGB(l,m,Color.white.getRGB());
					}*/
					img.setRGB(l,m,indexJ<<9);
					
				}
			}
			
		}
		
		
		JFrame frame = new JFrame();
		frame.add(new JPanel(){
			protected void paintComponent(Graphics g){
				g.drawImage(img, 0, 0, this);
			}
		});
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}	


public static double[] complexSquare(double a , double b){
	double real = Math.pow(a,2) - Math.pow(b,2);
	double complex = 2*a*b;
	return new double[] {real , complex};
}

public static double complexAbs(double a, double b){
	double x = Math.pow(a,2) + Math.pow(b,2);
	double num = Math.sqrt(x);
	return num;
}
}