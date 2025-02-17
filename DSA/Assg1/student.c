#include <stdio.h>

#define NUM_SUBJECT 5
#define MAX_STUDENTS 10

struct student
{
    char name[50];
    int roll_no;
    float percentage;
    int marks[NUM_SUBJECT];
};

void getData(struct student *s)
{
    printf("\n\nEnter the name of student :");
    scanf("%s", s->name);

    printf("\n\nEnter the roll_no of student :");
    scanf("%d", &s->roll_no);

    int totalmarks = 0;

    for (int i = 0; i < NUM_SUBJECT; i++)
    {
        do
        {
            printf("\n\nEnter the marks of subject %d :", i + 1);
            scanf("%d", &s->marks[i]);

            if (s->marks[i] < 0 || s->marks[i] > 100)
            {
                printf("\nEntered marks are not valid ");
            }
        } while (s->marks[i] < 0 || s->marks[i] > 100);

        totalmarks += s->marks[i];
    }
    s->percentage = (float)totalmarks / (NUM_SUBJECT * 100) * 100;
}

void display(struct student s)
{
    printf("\n\n\nName of the student is : %s", s.name);
    printf("\n\n\nRoll no of the student is : %d", s.roll_no);
    printf("\n\n\nMarks of the student are :");
    for (int i = 0; i < NUM_SUBJECT; i++)
    {
        printf("\n Subject %d = %d \n", i + 1, s.marks[i]);
    }
    printf("--------------------------------------------------------------------------------------------");
    printf("\nPercentage : %.2f \n\n", s.percentage);
    printf("--------------------------------------------------------------------------------------------");
}

void displayMerit(struct student students[], int n)
{
    printf("\n\nMerit List (By Percentage) :");
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (students[i].percentage < students[j].percentage)
            {
                struct student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
    }

    for (int i = 0; i < n; i++)
    {
        printf("\n\n\n%d : %s = %.2f \n\n", i + 1, students[i].name, students[i].percentage);
    }
}

void searchStudent(struct student students[], int rollno, int n)
{
    int flag = 0;
    for (int i = 0; i < n; i++)
    {
        if (students[i].roll_no == rollno)
        {
            display(students[i]);
            flag = 1;
        }
    }

    if (flag == 0)
    {
        printf("\n\nStudent Not Found!!!\n\n");
    }
}

int main()
{
    struct student students[MAX_STUDENTS];
    int n;

    printf("\nEnter the no of students (max,%d) :", MAX_STUDENTS);
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        printf("\nEnter the details of the  student %d ", i + 1);
        getData(&students[i]);
    }

    printf("\nStudent Data\n");
    for (int i = 0; i < n; i++)
    {
        display(students[i]);
    }

    printf("\n\n\n\nMerit list \n\n");
    {
        displayMerit(students, n);
    }

    int rollno;
    printf("\n\nEnter the Roll no of the student : ");
    scanf("%d", &rollno);

    searchStudent(students, rollno, n);
    return 0;
}