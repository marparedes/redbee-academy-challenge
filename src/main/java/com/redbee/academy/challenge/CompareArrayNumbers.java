package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
	List<Integer> list = new ArrayList<Integer>();
	if(a.size() == b.size()) {
		sameSizeList(a, b,list);
	} else {
		differentSizeList(a, b, list);
	}
     return list;
  }
  
  public static void sameSizeList(List<Integer> a, List<Integer> b, List<Integer> list) {
	  for(int i = 0; i<a.size(); i++) {
		  list.add(Math.max(a.get(i), b.get(i)));
	  }
  }
  
  public static void differentSizeList(List<Integer> a, List<Integer> b, List<Integer> list) {
	  boolean isAShorter = a.size() < b.size();
	  if(isAShorter) {
		  compareLists(a,b, list);
	  } else {
		  compareLists(b,a, list);
	  }
  }
  
  public static void compareLists(List<Integer> shortList, List<Integer> longList, List<Integer> list) {
	  for(int j = 0; j<longList.size(); j++) {
		  if(j < shortList.size()-1 ) {
			  list.add(Math.max(shortList.get(j), longList.get(j)));
		  } else {
			  list.add(longList.get(j));
		  }
	  }
  }
  
  

}
