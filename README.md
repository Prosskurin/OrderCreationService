
# OrderCreationService
Представлен сервис создания заказа
# Описание
Сервис создания заказа с параметрами : 
- цена 
- валюта (в рублях)
- тип продукта (акция или облигация)
- список подписанных документов

После формирования клиентом заказа на основании входных параметров программа выполняет следующие действия : 
- присваивает уникальный номер заказа (id)
- рассчитывает комиссию в зависимости от типа продукта. Если акция, то мин 99 рублей или 1%. Если облигация, то 2%
- меняет в ссылках hhtp на https
- сохраняет в базу данных параметры
- отправляет e-mail с документами о созданном заказе менеджеру
- логирует тему и тело письма

# Используемые технологии
- JDK 16.0.1
- Intelij IDEA Community Edition v2021.2
- Tomcat v.9.0.58
- Spring MVC
- Hibernate v.6.1.0.Final
- Log4j v.1.2.16
- javax.mail v.1.4.7
- MySQL v.8.0.28
- Maven

# Установка
Перед запуском добавить конфигурацию Tomcat v.9.0.58 в Intelij IDEA Community Edition v2021. и пройти по ссылке http://localhost:8080/Order_Creation_Service/

# Использование
Начальная страница

<a href="https://wmpics.pics/pm-CJB8.html#image696023"><img src="https://wmpics.pics/dm-5XZVG.png"/></a>

Ввод данных

<a href="https://wmpics.pics/pm-CJB8.html#image696022"><img src="https://wmpics.pics/dm-HUJT.png"/></a>

Отображение данных

<a href="https://wmpics.pics/pm-CJB8.html"><img src="https://wmpics.pics/dm-CJB8.png"/></a>
