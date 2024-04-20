/* 
Array and LinkedList both are sequential data structure means stores data in one after other..
In array, the elements are stored at contiguous location where as 
In LinkedList the elements do not need to be stored in contiguous location.

Both Array and Linked List are competitors of each other. Many other data structure like
Stack, Queue, Dequeue etc can be implemented using either Array or LinkedList.

Array is fixed size and is allocated on Heap 
and dynamic sized array like ArrayList is not of fixed size and it grows automatically.
We can specify size in ArrayList as well if we want.

Why do we need another sequential data structure LinkedList? 
Lets see the limitation of Array
1. Inserting in the middle and in beginning is costly. 
2. Deleting in middle and beginning is costly.
3. Though Queue and Dequeue can be implemented using Array but it is complex.
   In Queue insertion happens at one end and deletion happens at other end.
   In Dequeue insertion and deletion happens at both ends.
4. To implement Round Robin scheduling, it is problematic using array
5. if we need to merge multiple sorted sequences frequently, we need auxilary space

All these problems/limitations can be solved easily with Linked List

In Linked List elements are not stored in contiguous location.
So elements can be at any memory location and Linked list has Node which stores data and
a reference to the address of the next node. The last node reference points to Null;
Since, elements are not contiguous insertion and deletion in middle and beginning is more efficient.
No need to preallocate space.

First Node of Linked List is called Head.

In java, Heap is the memory area where all dynamically allocated objects are stored and in java 
all non primitive type is dynamically allocated

*/
package easy;

/**
 * @author sanjit
 *
 */
public class LinkedListBackgroundAndIntroduction_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
