package com.vastpro.corejavalabassignmentservice;

public class CircleImpl extends Shape {

	@Override
	public double calculateArea(double radius, double sameRadius) {
		double areaCircle = Math.PI * (radius * sameRadius);
		return areaCircle;
	}

}
