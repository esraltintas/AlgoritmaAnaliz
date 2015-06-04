#include <stdio.h>

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
   int Arr2 = {};
   int Arr = {0,1,0,0};
   int s=1;
   int encoksifir;

   for (int i=0; i < Arr.length; i++ ) {
	if (Arr[i] == "0") {
		for(int j=i; j< Arr.length; j++) {
			if(Arr[j+1] == "0") {
			    s=s+1;
			}
			else {
			    Arr2.push(s);
			}
			if((j=Arr[Arr.length]) && (Arr[j+1] == "0")) {
			    Arr2.push(s);
			}
		}


	}


   }

   for(int i=0; i<Arr2.length; i++) {
       t = encoksifir;
       encoksifir = Arr2[i];
       if(t < encoksifir) {
           t = encoksifir;
       }
       encoksifir = t;

   }

   printf(t);
      
   return(0);
}
