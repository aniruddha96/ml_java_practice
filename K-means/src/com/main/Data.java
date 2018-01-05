package com.main;

import java.util.ArrayList;

public class Data {
	int x;
	int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Data [x=" + x + ", y=" + y + "]";
	}
	public Data(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Data() {
		super();
		
	}
	
	public static int diffrence(Data obj1, Data obj2){
		
		return Math.abs(Math.abs(obj1.getX()-obj2.getX())+Math.abs(obj1.getX()-obj2.getX()));
	}

	public static Data calculateCentroid(ArrayList<Data> list ){
		int X=0;int Y=0;
		if(!list.isEmpty()){
			for(Data data:list){
				X+=data.getX();
				Y+=data.getY();
			}
			return new Data(X/list.size(),Y/list.size());
		}
		return null;
	}
}
