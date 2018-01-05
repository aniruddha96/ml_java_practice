package com.main;

import java.util.ArrayList;
import java.util.List;

public class Kmeans {

	public List<Cluster> kmeans(int numClusters, List<Data> data){
		List<Cluster> clusters = new ArrayList<Cluster>();
		int minX=101,minY=101,maxX=-1,maxY=-1;
		
		for(Data dataItem:data){
			if(dataItem.getX()<minX){
				minX=dataItem.getX();
			}
			if(dataItem.getX()>maxX){
				maxX=dataItem.getX();
				
			}
			if(dataItem.getY()<minY){
				minY=dataItem.getY();
			}
			if(dataItem.getY()>maxY){
				maxY=dataItem.getY();
			}
		}
		
		for(int i=0;i<numClusters;i++){
			clusters.add(new Cluster(new ArrayList<Data>(), new Data((int) (Math.random()*(maxX-minX)), (int)Math.random()*(maxY-minY))));
		}
		
		boolean clusterSwitch =true;
		
		while(clusterSwitch){
			clusterSwitch=false;
			for(Data dataItem:data){
				System.out.println("\n calculating for: "+dataItem.toString());
				int minDistance=1000;
				Cluster switchTo=null;
				for(Cluster cluster:clusters){
					int distance = Data.diffrence(dataItem, cluster.getCentroid());
					if(distance<minDistance){
						minDistance=distance;
						switchTo=cluster;
					}
				}
				if(!switchTo.getMembers().contains(dataItem)){
					for(Cluster cluster:clusters){
						if(cluster.getMembers().contains(dataItem)){
							cluster.getMembers().remove(dataItem);
							
						}
					}
					System.out.println("switching from cluster");
					switchTo.getMembers().add(dataItem);
					clusterSwitch=true;
				}
				
			}

			for(Cluster cluster:clusters){
				cluster.calculateCentroid();
			}
				
		}
		
		
		
		
		
		return clusters;
	}
}
