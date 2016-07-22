#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int a,b;
    int j=0;
    char arr[100];
    scanf("%s",arr);
    int i=0,sum2=0;
    for(a=0;a<100;a++){
        while(arr[i]!='\0'){
            if(arr[i]==arr[i+1]){
                arr[i]='0';
                arr[i+1]='0';
                for(b=i;b<98;b++){
					arr[b]=arr[b+2];
				}

            }
            i++;
        }
        
        i=0;
    }
    
    
   while(arr[j]!='\0'){
        if(arr[j]=='0'){
            sum2++;
        } else if(arr[j]=='\0'){
            sum2++;
        }  else if(arr[j]=='1'){
            sum2++;
        } else {
            printf("%c",arr[j]);
        }
       j++;
    }
    if(sum2==j){
        printf("Empty String");
    }
    printf("\n");

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
