# AlgoShortProject0
Experiment:Performance of Merge Sort and Sorting Priority Queue for large inputs(1 Million) 

1. Implement Merge Sort (say, from Cormen's book) in Java using generics.
   See http://www.utdallas.edu/~rbk/teach/2016s/notes/mergesort.pdf for pseudocode of merge sort.
   Compare its running time on n > 1 million elements with another
   O(nlogn) algorithm, say for example, sorting using a priority queue:

   Create a priority queue from an array list (which is a collection)
   containing the input elements using the constructor in the Java Library. 
   From https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html: 

   PriorityQueue(Collection<? extends E> c)
   Creates a PriorityQueue containing the elements in the specified collection.

   Remove the elements from the Priority Queue until it gets empty.

