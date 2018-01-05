package com.main;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Kmeans kmeans = new Kmeans();
		Random rand = new Random();
		ArrayList<Data> data = new ArrayList<>();
/*		data.add(new Data(1,3));
		data.add(new Data(3,0));
		data.add(new Data(100,99));
		data.add(new Data(99,79));
		data.add(new Data(50,50));
		data.add(new Data(50,49));
		data.add(new Data(54,32));
		data.add(new Data(21,6));
		data.add(new Data(34,78));
		data.add(new Data(12,90));
		data.add(new Data(12,23));
		data.add(new Data(78,4));*/
		
		for(int i=0;i<100000;i++){
			data.add(new Data(rand.nextInt(100),rand.nextInt(100)));
		}
		
		int i=1;
		for(Cluster cluster:kmeans.kmeans(10, data)){
			System.out.println("Cluster :"+i++);
			System.out.println(cluster.toString()+"\n");
		};
		
	}

}
