package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Application {
	
	static int sumArray(int[] arr) {
		int sumArr = 0;
		for (int x: arr) {
			sumArr += x;
		}
		return sumArr;
	}

    public static void main(String[] args) {
    	
    	
        int[] array;
        // Инициализируем переменную array массивом из 20 целых чисел
        array = new int[20];
        
        FibonacciInitializer fibInit = new FibonacciInitializer();
        RandomInitializer randInit = new RandomInitializer();
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selSort = new SelectionSort();
        ShellSort shellSort = new ShellSort();
        
        System.out.println("Инициализируем массив значениями последовательности чисел Фибоначчи:");
        fibInit.initialize(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Находим сумму элементов массива:");
        int sum = sumArray(array);
        System.out.println("Sum = " + sum);
        System.out.println();
        System.out.println("Инициализируем массив последовательностью случайных чисел в диапазоне от -50 до 50:");
        randInit.initialize(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Сортируем массив с использованием пузырьковой сортировки:");
        bubbleSort.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Инициализируем массив последовательностью случайных чисел в диапазоне от -50 до 50:");
        randInit.initialize(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Сортируем массив с использованием сортировки выбором:");
        selSort.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Инициализируем массив последовательностью случайных чисел в диапазоне от -50 до 50:");
        randInit.initialize(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Сортируем массив с использованием сортировки Шелла:");
        shellSort.sort(array);
        System.out.println(Arrays.toString(array));
        
        

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
