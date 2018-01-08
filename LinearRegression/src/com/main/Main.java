package com.main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<DataPoint> dataList = new ArrayList<>();
		dataList.add(new DataPoint(1,2));
		dataList.add(new DataPoint(2,3));
		dataList.add(new DataPoint(3,4));
		dataList.add(new DataPoint(4,5));
		dataList.add(new DataPoint(5,6));
		dataList.add(new DataPoint(6,7));
		dataList.add(new DataPoint(7,8));
		dataList.add(new DataPoint(8,9));
		dataList.add(new DataPoint(9,10));
		dataList.add(new DataPoint(0,1));
		
		LinearRegression lr = new LinearRegression(dataList, 0.0001, Double.MAX_VALUE);
		
		lr.run();
		

	}

}
