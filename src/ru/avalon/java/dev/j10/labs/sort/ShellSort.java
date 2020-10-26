package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>Алгоритм сортировки, являющийся усовершенствованным
 * вариантом сортировки вставками. Идея метода Шелла состоит
 * в сравнении элементов, стоящих не только рядом, но и на
 * определённом расстоянии друг от друга. Иными словами —
 * это сортировка вставками с предварительными «грубыми»
 * проходами. Аналогичный метод усовершенствования
 * пузырьковой сортировки называется сортировка расчёской.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка Шелла</a>
 */
public class ShellSort implements Sort {

	/**
	 * {@inheritDoc}
	 */
	public void sort(int[] array) {
		/*
		 * TODO(Студент): Реализовать метод sort класса ShellSort
		 */
		int[] a = {9, 5, 3, 2, 1}; // Конкретная последовательность шагов может быть и другой. Единственное правило состоит в том, чтобы последний шаг был равен 1.
		int i, j, x, gap;
		for (int k = 0; k < 5; k++) {
			gap = a[k];
			for (i = gap; i < array.length; i++) {
				x = array[i];
				for (j = i - gap; j >= 0 && array[j] > x; j -= gap)
					array[j + gap] = array[j];
				array[j + gap] = x;
			}
		}
	}

	//    for ( gap = n / 2 ; gap > 0 ; gap /= 2 )
	//		for ( i = gap ; i < n ; ++i )
	//			for ( j = i - gap ; j >= 0 && v[j] > v[j+gap] ; j -= gap )
	//			{
	//				temp = v[j] ;
	//				v[j] = v[j+gap] ;
	//				v[j+gap] = temp ;
}
