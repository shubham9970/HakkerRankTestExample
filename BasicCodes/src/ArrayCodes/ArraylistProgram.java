package ArrayCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArraylistProgram {

	public static int priceDeferenceCount(List<String> product,List<Double> productPrice,List<String> soldProduct,List<Double> soldPrice ) {
		HashMap<Object,Object> map=new HashMap<Object,Object>();
		HashMap<Object,Object> map1=new HashMap<Object,Object>();
		int count=0;
		for(int i=0;i<product.size();i++) {
			for(int j=0;j<productPrice.size();j++) {
				if(i==j) {
					map.put(product.get(i),productPrice.get(j));
				}
			}
		}
		for(int i=0;i<soldProduct.size();i++) {
			for(int j=0;j<soldPrice.size();j++) {
				if(i==j) {
					map1.put(soldProduct.get(i),soldPrice.get(j));
				}
			}
		}
		
		for (Map.Entry<Object,Object> entry : map.entrySet()) {
           for(Map.Entry<Object,Object> entry1:map1.entrySet()) {
        	   if(entry.getKey().equals(entry1.getKey())) {
        		   if(!entry.getValue().equals(entry1.getValue())) {
        			   count++;
        		   }
        	   }
           }
		}
		
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			Object o =itr.next();
			System.out.println(o.toString());
		}
		return count;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList products=new ArrayList();
		ArrayList productPrice=new ArrayList();
		ArrayList soldProduct=new ArrayList();
		ArrayList soldPrice=new ArrayList();
		
		products.add("suger");
		products.add("tomato");
		products.add("potatos");
		
		productPrice.add(20.00);
		productPrice.add(15.00);
		productPrice.add(10.00);
		
		soldProduct.add("suger");
		soldProduct.add("tomato");
		soldProduct.add("potatos");
		
		soldPrice.add(20.50);
		soldPrice.add(10.00);
		soldPrice.add(10.00);
		
		int count=ArraylistProgram.priceDeferenceCount(products,productPrice,soldProduct,soldPrice);
		System.out.println(count);
		
	}

}
