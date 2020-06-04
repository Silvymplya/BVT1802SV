public class Primes 
{
	public static void main(String[] args)
	{
		int b = 2;
		while (b != 100)					// Цикл для перебора всех значений от 2 до 100
		{
			if (isPrime(b))					// Проверяем простое ли число
			{
				System.out.println(b);		// Выводим число
			}
			b ++;
		}
	}
	public static boolean isPrime(int n)	// Функция для проверки числа 
	{
		int count = 2;
		while (count != 100)				// Цикл для перебора значений 
		{
			if (count != n)
			{
				if (n % count == 0)			// Проверка на делимость
				{
					return false;
				}
			}
			count ++;
		}
		return true;
	}
}
