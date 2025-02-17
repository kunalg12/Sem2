#include<stdio.h>
#define MAX 100
struct ArrayADT
{
 int arr[MAX];
 int size;
};

void insertElement(struct ArrayADT* array,int element,int index);
void deleteElement(struct ArrayADT* array,int index);
void traverseArray(struct ArrayADT* array);
int searchElement(struct ArrayADT* array,int element);
void updateElement(struct ArrayADT* array,int element,int index);
void menu();

int main(){
        struct ArrayADT array;
	array.size=0;
	int choice,element,index;
	while(1)
	{
          menu();
          printf("Enter your choice:");
	  scanf("%d",&choice);
	
	switch(choice)
	{
         case 1:
                printf("Enter element to insert:");
                scanf("%d",&element);
                printf("Enter index to insert:");              
                scanf("%d",&index);
               insertElement(&array,element,index);
               break;
         case 2:
                printf("Enter index to delete element:");              
                scanf("%d",&index);
                deleteElement(&array,index);
         case 3:
                traverseArray(&array);
                break;
        case 4:
               printf("Enter element to search:");
               scanf("%d",&element);
               index=searchElement(&array,element);
               if(index!=-1)
                 printf("Element found at index %d\n",index);
              else
                 printf("Element not found\n");
              break;
       case 5:
              printf("Enter index to update:");
              scanf("%d",&index);
              printf("Enter new element value:");
              scanf("%d",&element);
              updateElement(&array,element,index);
              break;

       case 6:
              printf("Exiting the program.\n");
              return 0;

       default:
              printf("Invalid choice Please try again\n");                     
	}
	}
	return 0;
}
void menu()
{
       printf("\nMenu\n");
       printf("1. Insert Element\n");
       printf("2. Delete Element\n");
       printf("3. Traverse Array\n");
       printf("4. Search Element\n");
       printf("5. Update Element\n");
       printf("6. Exit\n");
}

void insertElement(struct ArrayADT* array,int element,int index)
{
       if(array->size>=MAX)
       {
              printf("Array is full! Cannot insert element\n");
              return;
       }
       if(index<0|| index>array->size)
       {
              printf("Invalid index! Insertion failed\n");
              return;
       }
       for(int i=array->size;i>index;i--)
       {
              array->arr[i]=array->arr[i-1];
       }
       array->arr[index]=element;
       array->size++;
       printf("Element inserted at index %d.\n",index);
}
void deleteElement(struct ArrayADT* array,int index)
{
       if(index<0||index>=array->size)
       {
              printf("Invalid index! deletion failed\n");
              return;
       }
       for(int i=index;i<array->size-1;i++)
       {
              array->arr[i]=array->arr[i+1];
       }
       array->size--;
       printf("Element deleted from index %d.\n",index);
}

void traverseArray(struct ArrayADT* array)
{
       if(array->size==0)
       {
              printf("Array is empty\n");
              return;
       }
       printf("Array elements: ");
       for(int i=0;i<array->size;i++)
       {
              printf("%d",array->arr[i]);
       }
       printf("\n");
}

int searchElement(struct ArrayADT* array,int element)
{
       for(int i=0;i<array->size;i++)
       {
       if(array->arr[i]==element)
       {
              return i;
       }
       }
       return -1;
}

void updateElement(struct ArrayADT* array,int element,int index)
{
   if(index<0 || index>=array->size)
   {
       printf("Invalid index! update failed\n");
       return;
   }
   array->arr[index]=element;
   printf("Element at index %d updated to %d.\n,index,element");
}