package com.vastpro.corejavalabassignmentservice;

public class RectangleImpl extends Shape {

	@Override
	public double calculateArea(double length, double width) {
		double areaRectangle = length * width;
		return areaRectangle;
	}

}
