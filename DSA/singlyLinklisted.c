#include <stdio.h>
#include <stdlib.h>
  

struct Node {
    int data;
    struct  Node* next;
};

struct Node* createNode(int data) {
    struct Node* newNode=(struct Node*)malloc(sizeof(struct Node));
    newNode->data=data;
    newNode->next=NULL;
    return newNode;
}

void insertAtbeginning (struct Node** head,int data) {
    struct Node* newNode= createNode(data);
    newNode->next=*head;
    *head=newNode;
    printf("Node inserted in the beginning\n");
}

void insertAtEnd(struct Node ** head,int data) {
    struct Node* newNode = createNode(data);
    if (*head == NULL){
        *head = newNode;
    }else {
        struct Node* temp =*head;
        while (temp->next !=NULL) {
            temp = temp->next;
        }
        temp->next =newNode;
}
printf("Node inserted at the end\n");

}

void deleteNode(struct Node** head, int key) {
    struct Node* temp =*head;
    struct Node* prev = NULL;

    if (                 
        temp !=NULL && temp->data ==key) {
            *head = temp->next;
            free(temp);
            printf("Node with value %d deleted.\n", key);
            return;
    }

    while (temp!= NULL && temp->data != key) {
        prev = temp;
        temp =temp->next;
    }
    
    if(temp==NULL){
        printf("Node with the value %d deleted\n",key);
        return;
           }

       prev->next=temp->next;
       free(temp);
       printf("Node with value %d deleted \n",key);
         
}

void searchNode(struct Node* head,int key)
{
    if(head==NULL)
    {
        printf("List is empty!\n");
        return;
    }
    struct Node* temp=head;
    int pos=1;
    while(temp!=NULL)
    {
        if(temp->data==key)
        {
            printf("Node with value %d found at pos %d.\n",key,pos);
            break;
        }
        temp=temp->next;
        pos++;
    }

    printf("Node with value %d not found\n",key);
}

void displayList(struct Node* head)
{
    if(head==NULL)
    {
        printf("List is empty!\n");
        return;
    }
    struct Node* temp=head;
    
    printf("LinkedList : ");
    while(temp!=NULL)
    {
        printf("%d-> ",temp->data);
        temp=temp->next;
    }
    printf("\n");
}

int main()
{
    struct Node* head=NULL;
    int data,choice;

    while(1)
    { 
        printf("\nMenu:\n");
         printf("1.Insert at beginning\n");
        printf("2.Insert at end\n"); 
        printf("3.Delete a node\n");
        printf("4.Search for a node \n");
         printf("5.Display List\n");
        printf("6.Exit\n");
    
        printf("Enter your choice: ");
        scanf("%d",&choice);

    switch(choice)
    {
        case 1:
               printf("Enter data to insert at beginning: ");
               scanf("%d",&data);
               insertAtbeginning(&head,data);
               break;
    
        case 2:
               printf("Enter data to insert at end: ");
               scanf("%d",&data);
               insertAtEnd(&head,data);
               break;
        case 3:
              printf("Enter value to delete: ");
              scanf("%d",&data);
              deleteNode(&head,data);
              break;
        case 4:
               printf("Enter value to search: ");
              scanf("%d",&data);
              searchNode(head,data);
              break;
        case 5:
               displayList(head);
               break;

        case 6:
            printf("Exiting program\n");
            return 0;

        default:
               printf("Invalid choice Please try again\n");      
    }
 
 }
 return 0;
}