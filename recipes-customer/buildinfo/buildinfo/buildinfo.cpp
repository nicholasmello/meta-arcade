#include <stdio.h>

int main(int argc, char *argv[]){
	printf("Build Info: ");
	printf(__DATE__);
	printf(" ");
	printf(__TIME__);
	printf("\n");
	return 0;
}
