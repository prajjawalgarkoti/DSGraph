package mypack;

import java.util.*;


public class Graph {
	int novert;
	LinkedList<Integer> va[];
	
	public Graph(int novert) {
		this.novert=novert;
		va=new LinkedList[novert];
		for(int i=0;i<novert;i++) {
		va[i]=new LinkedList<Integer>();	
		}
	}
	void addEdge(int o,int d) {
		va[o].add(d);
	}
	void BFT(int v) {
        boolean[] visited=new boolean[novert];
        LinkedList<Integer> tl=new LinkedList<Integer>();
        tl.add(v);
        visited[v]=true;

        while(!tl.isEmpty()) {
            int n=tl.poll();
            System.out.print(n+" ");

            Iterator<Integer> i=va[n].iterator();
            while(i.hasNext()) {
                int c=i.next();
                if(!visited[c]) {
                    visited[c]=true;
                    tl.add(c);
                }
            }
        }
    }
	void disp(int v) {
		Iterator<Integer> i=va[v].iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
	}

}
