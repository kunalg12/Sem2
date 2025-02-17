#include <stdio.h>


struct Book {
    char title[100];
    char author[100];
    float price;
    int availability;  
};

int main() {
    
    struct Book library[5];
    
    
    for (int i = 0; i < 5; i++) {
        printf("Enter details for Book %d:\n", i + 1);

        printf("Enter title: ");
        getchar(); 
        fgets(library[i].title, sizeof(library[i].title), stdin);
        
        printf("Enter author: ");
        fgets(library[i].author, sizeof(library[i].author), stdin);
        
        printf("Enter price: ");
        scanf("%f", &library[i].price);
        
        printf("Enter availability (1 for available, 0 for not available): ");
        scanf("%d", &library[i].availability);

        printf("\n");
    }

    
    printf("\nLibrary Details:\n");
    for (int i = 0; i < 5; i++) {
        printf("Book %d:\n", i + 1);
        printf("Title: %s", library[i].title);
        printf("Author: %s", library[i].author);
        printf("Price: %.2f\n", library[i].price);
        printf("Availability: %s\n", library[i].availability ? "Available" : "Not Available");
        printf("\n");
    }

    return 0;
}