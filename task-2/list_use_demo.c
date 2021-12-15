#include <stdio.h>
#include "sl_list.h"

int main(void) {
	// Create an empty list
	List *myList = newList();

	// Print empty list
	printf("%d\n", myList->count);

	// Add some nodes to the list 
	appendNode(myList, 1, "name_1", 25);
	appendNode(myList, 2, "name_2", 16);
	appendNode(myList, 3, "name_3", 40);

	// Print the non-empty list
	printList(myList);

	// Print the count of list items
	printf("%d\n", myList->count);

	// Free the memory used by the list
	deleteList(myList);
	return 0;
}
