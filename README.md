# Izvekov-E.A.-Java 
# Быстрый доступ к заданиям!!
1. На ввод поступает матрица любой размерности. Выполните транспонирование матрицы → строки становятся столбцами и выведите ее на экран.

[Перейти к коду](src/firstHometask/findingTheNearestSquare/matrix/Main.java)

2. Требуется посчитать работников предприятия. Каждый раз когда на предприятие заходит работник система выдает - true, каждый раз когда это простой посетитель - false. В итоге Получается массив значений [true,  true,  true,  false, true,  true,  true,  true, true,  false, true,  false, true,  false, false, true, true,  true,  true,  true, false, false, true,  true] Посчитайте сколько сотрудников зашло на предприятие. Реализуйте возможность ввода с клавиатуры в формате: [1, 0, 1, 1, 1].

[Перейти к коду](/src/firstHometask/findingTheNearestSquare/workers/Main.java)

3. Поиск барицентра треугольника. Центром треугольника является точка пересечения трех медиан. Медиана - соединяет угол треугольника с центральной точкой противоположной стороны треугольника (E,D,F). Рассчитайте барицентр треугольника, учитывая, что треугольник ниже задан с помощью координат плоскости. Формат ввода ([4, 6], [12, 4], [10, 10]) → {8.6667, 6.6667} Формула для расчета указана на рисунке 2.

[Перейти к коду](src/firstHometask/findingTheNearestSquare/triangle/Main.java)

4. Напишите программу рассчитывающую количество вхождений символа в строку.

[Перейти к коду](src/firstHometask/findingTheNearestSquare/oneCharacterPerLine/Main.java)

5. Массив чисел вводится с клавиатуры. Посчитайте сумму квадратов всех введенных чисел. Формат ввода: 1 3 5 6 ⇒ 71

[Перейти к коду](src/firstHometask/findingTheNearestSquare/sumOfSquares/Main.java)

6. Напишите программу проверяющую что число является простым - делится только на себя и 1. Пример простых чисел: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29….

[Перейти к коду](src/firstHometask/findingTheNearestSquare/simpleDit/Main.java)

7. Вводится число (пр. 123). Найти число квадрат которого будет ближе всего расположен к введенному числу (пр. 123 → 121 → 11).

[Перейти к коду](src/firstHometask/findingTheNearestSquare/Main.java )

8. Пользователь с клавиатуры вводит три отрезка определенной длины (6, 12, 7). Требуется понять возможно ли из них составить треугольник и рассчитать наибольший внешний угол полученного треугольника. 

[Перейти к коду](src/firstHometask/findingTheNearestSquare/doWeGetATriangle/Main.java)

9. На ввод поступает две строки символов (пр. abc, bc). Верните true если вторая строка является окончанием первой и false в ином случае.

[Перейти к коду](src/firstHometask/findingTheNearestSquare/lineEnding/Main.java)

10. На ввод поступает имя (пр. аНнА). Выведите приветствие в формате: Привет, Анна!

[Перейти к коду](src/firstHometask/findingTheNearestSquare/helloName/Main.java)

11. Удалите все гласные из введенной строки.

[Перейти к коду](src/firstHometask/findingTheNearestSquare/removingAllVowels/Main.java)

12. На ввод поступает два числа. Наименьшее число является началом ряда, а также отвечает за шаг для получения следующего числа. Выведите все квадраты полученных чисел. Пр. 5, 1 → 1, 4, 9, 16, 25

[Перейти к коду](src/firstHometask/findingTheNearestSquare/rowOfquares/Main.java)

13. На ввод поступает три числа: начало ряда, шаг, количество шагов. Выведите на экран все числа полученного ряда. Пр. 1 2 5 → 1, 3, 5, 7, 9

[Перейти к коду](src/firstHometask/findingTheNearestSquare/startStepQuantity/Main.java)

14. Дана ячейка памяти хранящая максимум три числа. При вводе числа если есть пустые ячейки, она заполняется введенным числом. Если пустых ячеек нет - введенное число заменяет наименьшее из уже записанных.

[Перейти к коду](src/firstHometask/findingTheNearestSquare/memoryCell/Main.java)

15. Введена строка из повторяющихся слов. Требуется удалить все слова оставив только 1 в строке: abc abc ab abc ab acs acs → abc ab acs

[Перейти к коду](src/firstHometask/findingTheNearestSquare/removeRepetitionInAString/Main.java)

16. На ввод поступает строка символов. Преобразовать всю строку к верхнему регистру если заглавных символов больше чем строчных и наоборот. В случае если символов равное количество - преобразовать к строчному виду. Пр. ABccAAr → ABCCAAR | abCCaaR → abccaar

[Перейти к коду](/src/firstHometask/findingTheNearestSquare/largeAndSmallRegisters/Main.java)
***
17. Напишите функцию проверяющую корректность открытых и закрытых скобок. Пр.: () => true, (()()((()))) => true, (((())() => false.

[Перейти к коду](src/secondHomework/parenthesesFunction/Main.java)

18. Напишите программму ищуую во введенном массиве чисел максимальное значение и формирующую два массива - 1) все числа слева от максимума, 2) все числа справа от максимума

[Перейти к коду](secondHomework/parenthesesFunction/theMaximumValueInTheArray/Main.java)

19. Задана система уравнений:
func(0) = 0
func(1) = 1
func(2*n) = func(n)
func (2*n+1) = func (n) + func(n+1) Расчитать систему уравнений. Пр. func(10) -> func(10) = func(5) [правило 3] -> func(5) = func(2) + func(3) [правило 4] -> func(2) = func(1) [правило 3] -> func(1) = 1 [правило 2] -> funtc(3) = func(1) + func(2) [правило 4] -> func(1) и func (2) посчитаны и равны 1. Результат func(10) = func(5) = func(2) + func(3) = 1+2 = 3.

-

20. Даны два положительных числа m (высота) и n(height). Заполните и выведите массив по следующему правилу: внешнее кольцо заполнено 1 (n=1), каждое последующее во внутрь - на единицу больше (n+1). Результат сохранить в файл.

[Перейти к коду](src/secondHomework/parenthesesFunction/fillingTheMatrixWithARing/Main.java )

21. Решите проблему нумпад и телефонных клавиатур - необходимо преобразовать ввод чисел с нумпада в состояние набранного со стандартной клавиатуры телефона. Пр. "789" -> "123". На вход подаются только строки чисел.

[Перейти к коду](src/secondHomework/parenthesesFunction/numPad/Main.java)

22. Напиишите функцию которая вычисляет площадь по трем сторонам треугольника.

[Перейти к коду](src/secondHomework/parenthesesFunction/areaOfATriangleBySides/Main.java )

23. На ввод поступает три числа. Первое число N задает ряд 1..N, второе и третье являются делителями. Посчитайте сумму всех чисел в ряде которые делятся на один из делителей без остатка.

[Перейти к коду](src/secondHomework/parenthesesFunction/sumOfDivisorNumbers/Main.java )

24. На ввод поступает ряд чисел. Первые два числа задают ряд M..N, все последующие являются делителями. Посчитайте сумму всех чисел в ряде которые делятся на один из делителей без остатка.

[Перейти к коду](src/secondHomework/parenthesesFunction/numPad/Main.java)

25. На ввод поступает ряд чисел. Первые два числа задают ряд M..N, все последующие являются делителями. Посчитайте сумму всех чисел в ряде которые делятся на все делители без остатка.

[Перейти к коду](src/secondHomework/parenthesesFunction/sumOfNumbersToBothDivisors/Main.java )

26. Дана строка символов. Определите длинейший палиндром в строке. Пр. aa - 2, aabbac - 2, aabosobca - 5.

[Перейти к коду](src/secondHomework/parenthesesFunction/aPalindrome/Main.java)

27. Выполните простое шифрование Цезаря. На вход подается строка, число сдвига и направление.

[Перейти к коду](src/secondHomework/parenthesesFunction/caesarCipher/Main.java)

28. На вход подается число (0 < n > 100000). Число n является разницей между двумя последовательными квадратами числа. Пр. 9 = 25-16, 5 = 9-4, 7 = 16-9.

[Перейти к коду](src/secondHomework/parenthesesFunction/differenceOfSquares/Main.java)
