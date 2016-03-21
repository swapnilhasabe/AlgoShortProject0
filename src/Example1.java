//Intersection of Two Lists O(m+n)
//Union of Two List O(m+n)
//Intersection Using BST O(min(O(mlogn),O(nlogm)))

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author swapnil
 *
 */
public class Example1 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Max element of list#1:");
	int n1= scan.nextInt();
	System.out.println("Enter Max Element limit of list#2:");
	int n2= scan.nextInt();
	scan.close();
	List<Integer> list1=new LinkedList<>();
	List<Integer> list2=new LinkedList<>();
    List<Integer> out=new LinkedList<>();
    List<Integer> out1=new LinkedList<>();
	List<Integer> out2=new LinkedList<>();
    //adding elements in lists
	for(int i=0;i<n1;i+=2){
    	list1.add(i);	
	
    }
	for(int i=1;i<n2;i++){
    		
	    list2.add(i);
    }
	System.out.println(list1);
	System.out.println(list2);
	findIntersection(list1,list2,out);
	System.out.println(out);
	findUnion(list1,list2,out1);
	System.out.println(out1);
	//using BST
	FindIntersectionUsingBST(list1,list2,out2);
	System.out.println(out2);
	
}//end main method

	/**
	 * @param a
	 * @param b
	 * @param out2
	 */
	private static void FindIntersectionUsingBST(List<Integer> a, List<Integer> b, List<Integer> out2) {
		if(a.size()<b.size()){
			for(int i=0;i<a.size();i++){
			   if(BST(b,0,b.size()-1, a.get(i))){
				   if(!out2.contains(a.get(i)))
				   out2.add(a.get(i));
			   }	
			
			}
		}
		
	}

	/**
	 * @param b
	 * @param start
	 * @param end
	 * @param x
	 * @return
	 */
	private static boolean BST(List<Integer> b,int start,int end,Integer x) {
		while(start<=end){
			int middle=(start+end)/2;
			if(b.get(middle)==x) return true;
			else if(x<b.get(middle)){
				end=middle-1;
			}
			else{
				start=middle+1;
			}
		}
		
	return false;
	}

	/**
	 * @param a
	 * @param b
	 * @param out1
	 */
	private static void findUnion(List<Integer> a, List<Integer> b, List<Integer> out1) {
		int i=0,j=0;
		while(i<a.size()&&j<b.size()){
			if(a.get(i)<=b.get(j)){
				if(!out1.contains(a.get(i)))                 //add element once
				out1.add(a.get(i));
			i++;
			}
			else if(b.get(j)<a.get(i)){
				if(!out1.contains(b.get(j)))
				out1.add(b.get(j));
			j++;
			}
			
			
		}
	while(i<a.size()){                                      //add remainnig element of longest list once 
		if(!out1.contains(a.get(i)))
		out1.add(a.get(i));
	i++;
	}	
	while(j<b.size()){
		if(!out1.contains(b.get(j)))
		out1.add(b.get(j));
	j++;
	}
	
	}

	/**
	 * @param a
	 * @param b
	 * @param out
	 */
	private static void findIntersection(List<Integer> a, List<Integer> b, List<Integer> out) {
		int i=0,j=0;
		while(i<a.size()&&j<b.size()){
			if(a.get(i)<b.get(j)){                            //if elements are not equal then increment counter only
				i++;
			}
			else if(a.get(i)>b.get(j)){
				j++;
			}
			else if(a.get(i)==(b.get(j))){
				if(!out.contains(a.get(i))){	
				out.add(a.get(i));
				}
			i++;
			j++;	
			}
						
			
		}
      


}//end method

}//end class