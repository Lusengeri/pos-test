#ifndef _SL_LIST
#define _SL_LIST

// Structure of a linked list node
struct Node {
	int num;
	char name[50];
	int age;
	struct Node *next;
};

// Structure of the linked list
typedef struct {
	int count;
	struct Node *head;
	struct Node *tail;
} List;

// To create a new empty linked list
List *newList();

// To add a node at the end of the linked list
struct Node *appendNode(List *list, int num, char *name, int age);

// To display the linked list
void printList(List*);

// To delete the linked list
void deleteList(List*);

#endif
