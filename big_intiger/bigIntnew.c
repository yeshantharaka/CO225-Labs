#include <stdio.h>
#include <stdlib.h>
#include <math.h>
void addBigInt(char *arr1, char *arr2);
int countEliment(char *arr);
int* bigInt(char *arr);

int main(){
	char *arr= malloc(sizeof(char));
	scanf("%s",arr);
	addBigInt(arr,arr);
}

int* bigInt(char *arr){
	int ele= countEliment(arr);
	int *arr1=malloc(sizeof(int));
	int i;
	for(i=0; i<ele; i++){
		char ch=arr[(ele-1)-i];
		
		arr1[i]=atoi(&ch);
		
	}
	arr1[ele]=0;
	return arr1;
}

int countEliment(char *arr){
	int i=0;
	int count=0;
	while(arr[i]!='\0'){
		count++;
		i++;
	}
	return count;
}

void addBigInt(char *arr1, char *arr2){
	int i,j,k,l,m,n;
	int carry=0,carry1=0;
	int ele1= countEliment(arr1);
	int ele2= countEliment(arr2);
	int *arrA= malloc(sizeof(int));
	int *arrB= malloc(sizeof(int));
	int *arrC= malloc(sizeof(int));
	arrA= bigInt(arr1);
	arrB= bigInt(arr2);
	/*for(i=0; i<ele1; i++){
		printf("%d\n",arrA[i]);
	}
	for(j=0; j<ele2; j++){
		printf("%d\n",arrB[j]);
	}*/
	if(ele1>=ele2){
		for(i=0; i<=ele2; i++){
			int a=arrA[i]+arrB[i];
			arrC[i]=(a+carry)%10;
			carry= a/10;
		}
		
			for(j=ele2+1; j<=ele1; j++){
				arrC[j]=(arrA[j]+carry)%10;
				carry= (arrA[j]+carry)/10;
			}
			for(m=0; m<=ele1; m++){
				printf("%d\n",arrC[m]);
			}
		
	} else {
		for(k=0; k<=ele1; k++){
			int b=arrA[k]+arrB[k];
			arrC[k]=(b+carry1)%10;
			carry1= b/10;
		}
	
			for(l=ele1+1; l<=ele2; l++){
				arrC[l]=(arrB[l]+carry1)%10;
				carry1= (arrB[l]+carry1)/10;
			}
		for(n=0; n<=ele1; n++){
			printf("%d\n",arrC[n]);
		}
	
	}

}
