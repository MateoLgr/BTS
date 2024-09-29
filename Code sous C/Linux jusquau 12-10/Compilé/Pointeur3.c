#include <stdio.h>

void test(int *pa, int *pb){
	*pa=10;
	*pb=20;
}
int main(void){
	int a;
	int b;
	int *pa=&a;
	int *pb=&b;
	test(&a, &b);
	test(pa, pb);
	printf("a=%p, b = %p\n", &a, &b);
	printf("pa=%p, pb = %p\n", pa, pb);
	return 0;
}
	
