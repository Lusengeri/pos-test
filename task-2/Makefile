list_use_demo: list_use_demo.c sl_list.o
	gcc list_use_demo.c sl_list.o -o list_use_demo

sl_list.o: sl_list.c
	gcc -c sl_list.c

all: list_use_demo sl_list.o

clean:
	rm -f *.o list_use_demo
