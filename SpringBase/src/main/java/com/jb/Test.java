package com.jb;

import java.util.Collections;
import java.util.List;

public class Test {
	public static boolean getCheck(Integer[] itr)
	{
		   List<Integer> list=List.of(itr);
	       boolean flag=false;
	       for(Integer i:list)
	       {
	         if(Collections.frequency(list,i)>1){
	             flag=true;
	             break;
	         }
	       }
	        return flag;	   
	}
   public static void main(String[] args) {
	   Integer[]  itr=new Integer[] {6,7,3,5,6};
	    getCheck(itr);
    }
}
