# Сценарии тестов для **покупки** тура и **покупки в кредит**

*тесты универсальны для обеих вкладок - Купить и Купить в кредит - для всех тестов действует предусловие - перед прохождением необходимо совершить переход в тестируемую вкладку*

**Позитивный сценарий:**

1. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 02</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы валидными данными: запрос успешно обрабатывается, появляется сообщение, что
  операция одобрена банком  

2. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: U</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы валидными данными: запрос успешно обрабатывается, появляется сообщение, что
  операция одобрена банком

**Негативные сценарии:**

3. Ввести в поле Номер карты: 11112222333344Д4
   <p>Ввести в поле Месяц: 02</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

4. Ввести в поле Номер карты: 1111222233334>44
   <p>Ввести в поле Месяц: 02</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

5. Ввести в поле Номер карты: 1111222233334 44
   <p>Ввести в поле Месяц: 02</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

6. Ввести в поле Номер карты: 1111222233334+44
   <p>Ввести в поле Месяц: 02</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

7. Ввести в поле Номер карты: 1111222233334-44
   <p>Ввести в поле Месяц: 02</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

8. Ввести в поле Номер карты: 1111222233334'44
   <p>Ввести в поле Месяц: 02</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

9. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 1J</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

10.  Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 1></p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

11. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 1=</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

12. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 1'</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

13. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 1-</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

14. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 2S</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

15. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 2=</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

16. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 2'</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

17. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 2></p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

18. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 2-</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

19. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Иван</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

20. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Iva5ov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

21. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Iva>ov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

22. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Iva+ov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

23. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 5F7</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

24. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 5+7</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

25. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 5 7</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

26. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 5>7</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

27. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 5-7</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

28. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 5'7</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат
29. Ввести в поле Номер карты: 111122223333444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

30. Ввести в поле Номер карты: 11112222333344444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

31. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 00</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

32. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 13</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

33. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 1</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

34. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 21</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

35. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 2</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

36. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanovvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv</p>
   <p>Ввести в поле CVC/CVV: 547</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

37. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 57</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

38. Ввести в поле Номер карты: 1111222233334444
   <p>Ввести в поле Месяц: 11</p>
   <p>Ввести в поле Год: 23</p>
   <p>Ввести в поле Владелец: Ivan Ivanov</p>
   <p>Ввести в поле CVC/CVV: 5587</p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при заполнении формы невалидными данными: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение Неверный формат

39. Оставить поле Номер карты пустым 
   <p>Оставить поле Месяц пустым </p>
   <p>Оставить поле Год пустым </p>
   <p>Оставить поле Владелец пустым </p>
   <p>Оставить поле CVC/CVV пустым </p>
   <p>Нажать кнопку Продолжить</p>

* Ожидаемый результат при попытке отправки пустой формы: после нажатия кнопки Отправить запрос не отправляется, появляется сообщение о необходимости заполнить поля



# Перечень используемых инструментов

1. IntelliJ IDEA 2022.1.2 (Community Edition) как среда разработки для написания автотестов;
2. OpenJDK 11 платформа Java;
3. Браузер Chrome и chromedriver - браузер для работы со страницей, программа для передачи команд браузеру;
4. Selenide - инструмент для автоматизации действия пользователя в браузере;
5. JUnit Jupiter как среда тестирования для приложений Java;
6. Lombok как библиотека для сокращения кода в классах;
7. Gradle как система автоматической сборки;
8. Github в качестве хранилища SUT и авто-тестов;
9. Allure для создания отчетов о выполнении авто-тестов.


# Перечень и описание возможных рисков при автоматизации

1. Зависимость автотестов от текущей версии кода;
2. Стоимость автоматизации;
3. Необходимость поддерживать и модифицировать;
4. Трудность в поиске локаторов.

# Интервальная оценка с учётом рисков в часах

48 часов

# План сдачи работ

* Подготовка к проведению тестирования: 24 часа
* Написание автотестов: 72 часа
* Подготовка отчётов о проведении тестирования: 24 часа



