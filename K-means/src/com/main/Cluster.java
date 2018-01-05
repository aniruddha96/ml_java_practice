package com.main;

import java.util.ArrayList;

public class Cluster {
	
	ArrayList<Data> members ;
	Data centroid;
	
	public ArrayList<Data> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<Data> members) {
		this.members = members;
	}
	public Data getCentroid() {
		return centroid;
	}
	public void setCentroid(Data centroid) {
		this.centroid = centroid;
	}
	public Cluster(ArrayList<Data> members, Data centroid) {
		super();
		this.members = members;
		this.centroid = centroid;
	}
	
	public void calculateCentroid(){
		Data data = Data.calculateCentroid(this.members);
		if(data!=null)
			this.setCentroid(data);
	}
	@Override
	public String toString() {
		String res= "\n Centroid: "+centroid.toString()+"\n MENMBERS:\n";
		for(Data data:members){
			res+=data.toString()+"\n";
		}
		
		return res;
	}
	
	
	

}
