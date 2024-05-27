package difficult;

import easy.Node;

/*
Cache is memory which is very close to CPU, has very less access time means it is fast but 
is small in size compared to RAM. Since cache is very fast we need to have efficient utilization of 
small size memory. 
LRU is one of the techniques for that purpose. LRU stands for Least Recently Used.
The concept that LRU uses is called temporal locality, which means the item that accessed now 
is very likely to be accessed in near future. 
In LRU we keep the recently accessed item in the cache and remove the least recent items when 
space is needed. 

Suppose, cache size is 4
Reference sequence : 10,20,10,30, 40,50,30, 40,60, 30 
Initially cache is empty, when you access 10 it is not there in cache(when an item is not cache it 
is called miss). And if you are accessing something which is already in cache it is called hit
So we insert 10 in cache sinc eall four slots are empty.
Cache : 10,Miss,Miss,Miss
Now 20 is accessed, again miss so insert 20, Cache: 20, 10,Miss,Miss
Note: 20 is inserted at front since I am keeping most recently item in front
Again , 10 is accessed and it is a hit since 10 is in cache and it comes in front since it becomes
most recently used item. Cache: 10, 20, Miss, Miss
Now 30 is accessed so Cache: 30, 10, 20, Miss
now 40 is accessed so cache: 40, 30, 10, 20  
Now when 50 is accessed, we need to have space for 50 so the least recently used item is 20 
and we remove 20, Cache: 50, 40,30,10 
Now for 30, Cache: 30,50,40,10
Now for 40, Cache: 40,30,50,10
Now for 60, Cache: 60,40,30,50
Now for 30, Cache: 30,60,40,50

So, in LRU design we need to support above operations.
Given internal capacity  
   
 */

public class LRUCacheDesignNaive_38 {
	static Node head;
	static int cacheCapacity = 4;
	static int count = 0;

	public static void main(String[] args) {

		int arr[] = { 10, 10, 20, 10, 30, 40, 50, 30, 40, 60, 30 };

		for (int i = 0; i < arr.length; i++) {
			int data = arr[i];
			cacheDesign(data);
		}
		traverse(head);

	}

	private static void cacheDesign(int data) {

		boolean isHit = checkItsHit(head, data);
		if (isHit == false && count < cacheCapacity) {
			head = insertAtBegining(head, data);
			count++;
		} else if (isHit == false && count >= cacheCapacity) {
			head = insertAtBegining(head, data);
			deleteAtEnd(head);
		}

	}

	private static void deleteAtEnd(Node head2) {

		Node currentNode = head2;
		while (currentNode.next.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = null;

	}

	private static boolean checkItsHit(Node head2, int data) {

		Node currentNode = head2;
		Node previous = null;
		while (currentNode != null) {
			if (currentNode.data == data) {
				Node temp = new Node(data);
				previous.next = currentNode.next;
				temp.next = head;
				head2 = temp;
				head = head2;
				return true;
			}
			previous = currentNode;
			currentNode = currentNode.next;
		}
		return false;

	}

	private static void traverse(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}

	}

	private static Node insertAtBegining(Node head, int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
		}
		return head;
	}

}
