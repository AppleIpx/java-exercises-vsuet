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

-

29. На вход поступает положительное число и число для начала ряда. Вычислить возможна ли такая ситуация - сумма последовательных степеней ряда (n=1,2,3...) каждой из цифр - является произведением этого числа на любой из множителей 2^6 -> (q^w + e^(w+1) + r^(w+1) +...= sum = a * s). Пр. sC(89, 1) => 8^1+9^2=89*1,sC(695, 2) => 6^2+9^3+5^4=1390=695*2.

[Перейти к коду](src/thirdHomework/first/Main.java)

30. Саша и Таня хотят поехать в несколько городов. У Тани случайно обнаружился список этих городов и расстояний между ними. l= [50, 55, 57, 58, 60]. Саша тонко намекает Тане, что бензина на их поездку можно потратить ровно на 175 километров и он хочет посетить только 3 города. Нужно найти какие города могут посетить Саша и Таня, потратив максимально много бензина. Пр. l=[50,55,57],[50,55,58],[50,55,60],[50,57,58],[50,57,60],[50,58,60],[55,57,58],[55,57,60],[55,58,60],[57,58,60]. Работа программы ts = [50, 55, 56, 57, 58], choose_best_sum(163, 3, ts) -> 163.



31. Требуется вычислить i-ый элемент ряда Фибоначчи при условии что 10 ≤ i ≤ 100000. После этого вычислить наибольшее вхождение цифры в числе. Пр. f(10) = 55  # вернет [(2, 5)], поскольку 5-ка присутствует наибольшее количество раз в числе и оно равно двум. Если две цифры имеют одинаковое количество вхождений то выводим нибольшее из них. Алгоритм должен быть эффективным и выполняться не миллион лет.

[Перейти к коду](src/thirdHomework/first/FibonacciSeries)

32. Саша и Таня играют в игру: на столе лежит куча деревянных палочек в количестве: 1 <= n <= 10^18. Если количество палочек четное то игрок может взять либо одну палочку либо половину от всех палочек. Если количество палочек нечетное - то игрок может взять только 1 палочку. Таня начинает игру. Рассчитайте какое количество палочек будет у Тани если Саша будет играть по стратегии - зарать как можно больше палочек.

[Перейти к коду](src/thirdHomework/first/SashaAndTanyaPlayAGame)

33. Лупа и Пупа пошли заниматься в фитнес зал "Бухгалтерия". Каждый месяц фитнес-зал вывешивает список всех посетителей с их весом отсортированный по возрастанию. Пупа каждый раз очень расстраивается из-за того что он всегда внизу списка с наибольшим весом. У Лупы как всегда все хорошо и поскольку он лучший друг Пупы решил, что немного подправит функцию сортировки и таблица будет сортироваться не по весу, а по сумме чисел данного веса (189 -> 18). Помогите Лупе решить эту задачу. Пр. "56 65 74 100 99 68 86 180 90" отсортированный спико должен начать выглядеть вот так: "100 180 90 56 65 74 68 86 99".

[Перейти к коду](src/thirdHomework/first/LupaAndPupa)

34. Требуется написать программу по расшифровке алгоритма Цезаря. Для формирования словаря используем текст https://fish-text.ru на 10000 символов.

[Перейти к коду](src/thirdHomework/first/decipheringTheCaesarCipher/Main.java)

35. Программой загадан код из четырех символов. Требуется сыграть в игру и разгадать код быстрее чем за 20 попыток. Каждый раз вводить требуется 4 числа. Количество изменений за раз - любое. Если программа обнаруживает совпадения нескольких чисел - она выводит количество совпадений, но не указывает какие конкретно числа совпали.

[Перейти к коду](src/thirdHomework/first/fourCharacterGame/Main.java)

36. Сыграем в игру каждый третий. На вход программе поступает количество игроков и номер игрока с которого начинается игра. Каждый третий выбывает и так по кругу пока не останется только 1. Выведите весь список выбывших игроков в том числе и победителя. Пример:

[Перейти к коду](src/thirdHomework/first/everyThird/Main.java)

37. В программу поступает текст в виде одного или нескольких предложений. Нужно изменить текст следующим образом: переместить первую букву каждого слова в конец и добавить текст "ауч". Знаки препинания не трогаем.

[Перейти к коду](src/thirdHomework/first/firstLetterChange/Main.java)
