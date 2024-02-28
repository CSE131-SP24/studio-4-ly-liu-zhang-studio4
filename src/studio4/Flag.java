package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color faceColor = new Color(232, 220, 202);
		StdDraw.setPenColor(faceColor);
		StdDraw.filledEllipse(.5, .7, .2, .15);
		StdDraw.filledEllipse(.5, .3, .1, .075);//bottom circle
		double[]x={0.3,.4,.6,0.7,};
		double[]y={0.7,.3,.3,0.7};
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.ellipse(.4, .7, .06, .09);
		StdDraw.ellipse(.6, .7, .06, .09);
		Color eyeColor = new Color(88,57,39);
		StdDraw.setPenColor(eyeColor);
		StdDraw.filledEllipse(.4, .7, .06, .08);
		StdDraw.filledEllipse(.6, .7, .06, .08);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledEllipse(.42, .7, .02, .022);
		StdDraw.filledEllipse(.58, .7, .02, .022);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledEllipse(.45, .275, .05, .03);
		StdDraw.filledEllipse(.55, .275, .05, .03);
		StdDraw.filledEllipse(.5, .250, .06, .03);
		StdDraw.setPenColor(faceColor);
		StdDraw.filledEllipse(.275, .6, .065, .15);
		StdDraw.filledEllipse(.725, .6, .065, .15);
		
	}
}