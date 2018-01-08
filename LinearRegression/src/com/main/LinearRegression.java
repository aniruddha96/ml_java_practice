package com.main;

import java.util.ArrayList;

public class LinearRegression {
	
	double m;double c;
	double learningRate;
	double maxIteration;
	double epsilon;
	ArrayList<DataPoint> dataList;
	
	public double getM() {
		return m;
	}
	public void setM(double m) {
		this.m = m;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	public LinearRegression( ArrayList<DataPoint> dataList,double learningRate, double maxIteration) {
		super();
		this.m =  0.5;
		this.c = 0;
		this.learningRate = learningRate;
		this.maxIteration = maxIteration;
		this.dataList=dataList;
		this.epsilon=Double.MIN_VALUE;
	}
	
	public void run(){
		
		double old_m=0;
		double old_c=0;

		
		for(double i=0;i<maxIteration;i++){
			Double old_error=calculateError();
			System.out.println("iteration: "+i);
			System.out.println("m: "+m+" c: "+c);
			if(checkConvergence(old_m, m) && checkConvergence(old_c, c)){
				break;	
			}
			
			old_m=m;old_c=c;
			
			m=m-(learningRate*gradient("m"));
			c=c-(learningRate*gradient("c"));
			double error=calculateError();
			System.out.println("iteration error :"+(old_error-error));
			
		}
		
		System.out.println("final m: "+m+" final c: "+c);
		
		
		
	}
	
	private double calculateError(){
		Double error =0.0;
		for(DataPoint point :this.dataList){
			error+=Math.pow(point.getY()-(this.m*point.getX()+this.c),2);
		}
		
		return error/(2*this.dataList.size());
	}
	
	boolean checkConvergence(double old,double current){
		
		return (current-old)<epsilon;
		
		
	}
	
	private double gradient(String s){
		Double gradient =0.0;
		if(s.equals("m")){
			for(DataPoint point :this.dataList){
				gradient+=(-1*point.getX())*(point.getY()-(this.m*point.getX()+this.c));
			}
		}
		else if(s.equals("c")){
			for(DataPoint point :this.dataList){
				gradient+=(-1)*(point.getY()-(this.m*point.getX()+this.c));
			}
		}
		
		return gradient/this.dataList.size();
	}
	
	

}
