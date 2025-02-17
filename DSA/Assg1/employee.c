#include <stdio.h>

#define MAX_EMP 5

struct employee
{
    int emp_id;
    char name[50];
    char class[50];
    float salary;
};

void getdata(struct employee *e)
{
    float b_sal, total_salary;

    printf("\n\nEnter the name of employee :");
    scanf("%s", &e->name);

    printf("\n\nEnter the id of the employee:");
    scanf("%d", &e->emp_id);

    printf("\n\nEnter the Class of the employee:");
    scanf("%s", &e->class);

    if (e->class[0] == 'A')
    {
        b_sal = 80000;
        e->salary = b_sal + b_sal * 0.5;
    }
    else if (e->class[0] == 'B')
    {
        b_sal = 70000;
        e->salary = b_sal + b_sal * 0.5;
    }
    else if (e->class[0] == 'C')
    {
        b_sal = 55000;
        e->salary = b_sal + b_sal * 0.5;
    }
    else
    {
        printf("\n\nPlease enter the valid class :");
        // scanf("%s",e->class);
    }
}
void display(struct employee e)
{
    printf("\n\n\nName of the employee is : %s", e.name);
    printf("\n\n\nID of the employee is : %d", e.emp_id);
    printf("\n\n\nClass of the employee is : %s", e.class);
    printf("\n\n\nSalary of the Employee  is : %.2f", e.salary);
    printf("\n\n");
}

int main()
{
    struct employee employees[MAX_EMP];
    int n, id;
    int a;

    printf("\n Enter the no of employee(max,%d) :", MAX_EMP);
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        printf("\nEnter the details of the  employee %d ", i + 1);
        getdata(&employees[i]);
    }

    printf("\n Employee Data\n");
    for (int i = 0; i < n; i++)
    {
        display(employees[i]);
    }

    do
    {
        int flag = 0;
        printf("\nEnter the Employee ID to display details :");
        scanf("%d", &id);
        for (int i = 0; i < n; i++)
        {
            if (employees[i].emp_id == id)
            {
                printf("\nEmployee id found .\n");
                display(employees[i]);
                flag = 1;
            }
            // else
            // {
            //     printf("\n\nEmployee not found.\n");
            // }
        }
        if (flag == 0)
        {
            printf("\n\nEmployee not found");
        }

        printf("\nContinue 1/0 ");
        scanf("%d", &a);
    } while (a != 0);
}