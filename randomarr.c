#include <stdio.h>
#include <stdlib.h>

void push(Node **stkptr, int i)
{
    Node *temp;
    temp = malloc(sizeof(Node));
    temp->value = i;
    temp->next = *stkptr;
    *stkptr = temp;
}  // C push metod

int main()
{
   int a,b;
   int Arr[] = {};
   int Arr2[] = {};
   printf("Ne kadar eleman üretmek istersiniz?");
   scanf("%d",§a);

   for(int i=0; i<a; i++) {
        b = rand % a;
	Arr.push(b);
   }  

   for(int i=a; i>0; i--) {
	Arr2.push(Arr[i]);
   }

   printf("%d", §Arr2);
  
   
   return(0);
}


