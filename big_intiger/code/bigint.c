//#include <bigint.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
typedef int * bigint_t;
int countEliment(char *arr);
int* new_bigint(char *a);
int add(bigint_t s, bigint_t a, bigint_t b);
void show_bigint(bigint_t v);
int countInt(bigint_t a);

/*int main(){
	int *a=malloc(sizeof(int));
	int *b=malloc(sizeof(int));
	
	int *c=malloc(sizeof(int));
	a=new_bigint("123");
	
	b=new_bigint("12");

	add(c,a,b);
	show_bigint(a);
	return 0;
}*/



bigint_t new_bigint(char *a) 
{
int ele= countEliment(a);
	int *arr1=malloc(sizeof(int)*(ele+1));
	int i;
	for(i=0; i<ele; i++){
		char ch=a[(ele-1)-i];
		
		arr1[i]=atoi(&ch);
	
	}
	arr1[ele]=0;
	arr1[ele+1]=-1;	
		
	return arr1;
	
}


int add(bigint_t s, bigint_t a, bigint_t b)
{
	int carry=0;
	int min,i,max,j;
	
	
	int ele1=countInt(a)+1;
	int ele2=countInt(b)+1;
	
	a[ele1-1]=0;
	b[ele2-1]=0;
	if(ele1>=ele2){
		min=ele2;
		max=ele1;
	} else {
		min=ele1;
		max=ele2;
	}
	
	for(i=0; i<min; i++){
		int c=a[i]+b[i]+carry;
		carry=c/10;
		s[i]=c%10;
	}
	for(j=min; j<max; j++){
		if(max==ele1){
			int d=a[j]+carry;
			carry=d/10;
			s[j]=d%10;
		} else {
			int e=b[j]+carry;
			carry=e/10;
			s[j]=e%10;
		}
	}
	a[ele1-1]=-1;
	b[ele2-1]=-1;
	s[max-1]=-1;       // enter -1 to final element to count the number of elements in intiger array
	/*for(k=0;k<max;k++){
		printf("%d",s[k]);
	}*/
	return 1;
}

void show_bigint(bigint_t v) 
{
	int i;
	int ele=countInt(v);
	for(i=(ele-1); i>=0; i--){
		printf("%d",v[i]);
	}

}
  
int countEliment(char *arr){     // function to find number of elements in character array;
	int i=0;
	int count=0;
	while(arr[i]!='\0'){
		count++;
		i++;
	}
	return count;
}

int countInt(bigint_t a){    // function to find nubmer of elements in intiger array
	int i=0;
	while(a[i]!=-1){
		i++;
	}
	return i;
}
