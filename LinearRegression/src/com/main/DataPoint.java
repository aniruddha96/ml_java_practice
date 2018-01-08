package com.main;

public class DataPoint {
	double x;;double y;
	
	


	public DataPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}




	@Override
	public String toString() {
		return "DataPoint [x=" + x + ", y=" + y + "]";
	}




	public double getX() {
		return x;
	}




	public void setX(double x) {
		this.x = x;
	}




	public double getY() {
		return y;
	}




	public void setY(double y) {
		this.y = y;
	}




	public DataPoint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
