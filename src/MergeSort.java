import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author swapnil
 *
 * @param <T>
 */
/**
 * @author swapnil
 *
 * @param <T>
 */
/**
 * @author swapnil
 *
 * @param <T>
 */
public class MergeSort<T> {

static Date getCurrentDate(){
		
		Date d=new Date();	
		return d;
	
	}

 static long differenceInMilliSeconds(Date d1,Date d2){
	
	return (d1.getTime()-d2.getTime());
	
}
	
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of Elements: ");
		int numberOfElements=scan.nextInt();
		scan.close();
		//create a arralist 
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		//ArrayList of 1 million elements
		
		for(int i=numberOfElements;i>0;i--){
			al.add(i);
			al1.add(i);
		}
		
	//	long startTime = System.currentTimeMillis();
		Date time1=getCurrentDate();
		mergeSort(al);
		Date time2=getCurrentDate();
		System.out.println("Time for sorting "+numberOfElements +" using mergeSort is: "+differenceInMilliSeconds(time2,time1) + "milliseconds");
		//long estimatedTime = System.currentTimeMillis() - startTime;
	//	System.out.println("Using MergeSort "+estimatedTime);
	//	long startTime1 = System.currentTimeMillis();
		Date time3=getCurrentDate();
		//sortUsingQueue(al1);
	createPriorityQueue(al1);
		
		Date time4=getCurrentDate();
		System.out.println("Time for sorting "+numberOfElements +" using Priority Queue Sort is: "+
		differenceInMilliSeconds(time4,time3) + "milliseconds");
		
	//	long estimatedTime1 = System.currentTimeMillis()-startTime1;
		//System.out.println("Using PriorityQueue "+estimatedTime1);
	}//end main method


	/**
	 * @param input
	 */
	private static<T extends Comparable<?super T>> void mergeSort(ArrayList<T> input) {
		int n=input.size();
		if(n<2) return;
	    
		int middle=n/2;
	ArrayList<T> left=new ArrayList<T>();
		ArrayList<T> right=new ArrayList<T>();

		for(int i=0;i<middle;i++)
			left.add(input.get(i));
		
		for(int j=middle;j<n;j++){
		right.add(input.get(j));
	
		}
		mergeSort(left);
		mergeSort(right);
		merge(input,left,right);
			
		}
/**
 * @param l
 */
static<T> void sortUsingQueue(Collection<? extends T> l){
		
		PriorityQueue<T> q=new PriorityQueue<>((Collection<? extends T>) l);
	
		while(q.size()>0){
			
			//System.out.println(q.remove());
			q.remove();
		}
	
	}
	
	


	private static<T extends Comparable<?super T>> void merge(ArrayList<T> input, ArrayList<T> left,ArrayList<T> right) {
		int leftLength=left.size();
		int rightLength=right.size();
	int i=0,j=0,k=0;
		while(i<leftLength&&j<rightLength){
	
			if(left.get(i).compareTo(right.get(j))<=0){
				input.set(k, left.get(i));
				i++;				
			}else{
				input.set(k, right.get(j));
				j++;
				}
			
			k++;			
		}
	while(i<leftLength){
		input.set(k, left.get(i));
		i++;k++;
	}
	while(j<rightLength){
		input.set(k, right.get(j));
		j++;k++;
	}
	}//merge sort end

	/**
	 * @param al
	 */
	private static  void createPriorityQueue(ArrayList<Integer> al) {
		PriorityQueue<Integer> q=new PriorityQueue<Integer>(al);
		while(!q.isEmpty())
	q.remove();	  
	}




}//end class
