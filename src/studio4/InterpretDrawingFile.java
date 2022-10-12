package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double p1 = in.nextDouble();
		double p2 = in.nextDouble();
		double p3 = in.nextDouble();
		double p4 = in.nextDouble();
		double p5 = in.nextDouble();
		double p6 = in.nextDouble();
	
		if (shapeType=="ellipse") {
			StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
			if (isFilled ==true) {
			StdDraw.filledEllipse(p1, p2, p3, p4);
		}
			else {
			StdDraw.ellipse(p1, p2, p3, p4);	
			}
		
		if (shapeType=="rectangle") {
			StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
			if (isFilled ==true) {
				StdDraw.filledRectangle(p1, p2, p3, p4);
			}
				else {
				StdDraw.rectangle(p1, p2, p3, p4);	
				}
		}
		
		if (shapeType=="triangle") {
			StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
			StdDraw.line(p1,p2 ,p3,p4);
			StdDraw.line(p3, p4,p5,p6);
			StdDraw.line(p5,p6,p1,p2);	
		}
			
		}
		
	}
}
