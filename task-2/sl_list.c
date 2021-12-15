#include <stdio.h> 
#include <stdlib.h>
#include <stddef.h>
#include <string.h>
#include "sl_list.h"

List *newList() {
	List *newList = malloc(sizeof(List));
	newList->count = 0;
	newList->head = NULL;
	newList->tail = NULL;
	return newList;
}

struct Node *appendNode(List *list, int num, char *name, int age) {
	struct Node *newNode = malloc(sizeof(struct Node));
	newNode->num = num;
	strncpy(newNode->name, name, 50);
	newNode->age = age;
	newNode->next = list->head;

	if (list->count == 0) {
		list->head = newNode;
		list->tail = newNode;
	} else {
		list->tail->next = newNode;
		list->tail = newNode;
	}

	list->count++;
	return newNode;
}

void printList(List *list) {
	printf("[");

	if (list->count > 0) {
		struct Node *current = list->head; 
		int count;

		for (count=0; count < list->count; count++) {
			printf("{");
			printf("num: %d, ", current->num);
			printf("name: %s, ", current->name);
			printf("age: %d", current->age);
			printf("}");

			if ((count+1 < list->count))
				printf(", ");

			current = current->next;
		}
	}
	printf("]\n");
}

void deleteHead(List *list) {
	if (list->count > 0) {
		struct Node *old_head = list->head;
		list->head = list->head->next;		
		free(old_head);
		list->count--;
	}
}

void deleteList(List *list) {
	while (list->count > 0) {
		deleteHead(list);	
	}
}
