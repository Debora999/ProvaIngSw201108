package it.unical.ingsw2020;

import java.util.ArrayList;

public class MyListUtil {
	
	public ArrayList<Integer> ordinaCrescente(ArrayList<Integer> l){
			for(int i = 0; i<l.size()-1; i++) {
				int temp = 0;
				if(l.get(i) > l.get(i+1))
					temp = l.get(i);
					l.set(i, l.get(i+1));
					l.set(i+1, temp);
			}
		return l;
	}
	
public ArrayList<Integer> ordinaDecrescente(ArrayList<Integer> l){

			for(int i = l.size()-1; i>0; i--) {
				int temp = 0;
				if(l.get(i) > l.get(i-1))
					temp = l.get(i);
					l.set(i, l.get(i-1));
					l.set(i-1, temp);
			}
		
		return l;
	}
}
