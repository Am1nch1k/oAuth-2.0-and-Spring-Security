# simple-REST-services


# 📚 Документация REST API для проекта "Cat Service"

**Версия API**: v1.0  

## 🛠️ Технологии
- Java 17
- Spring Boot 3.x
- Jackson (JSON-сериализация)

## 🌐 Базовый URL
http://localhost:8080/api/


## 📌 Доступные эндпоинты

### 1. Проверка работоспособности API
**Запрос**:
```http
GET api/main
Ответ:
Hello World

```bash
curl -X GET http://localhost:8080/api/main

#2. Получение стандартного кота
Запрос:

http
GET api/cat

Ответ (JSON):

json
{
  "name": "Barsik",
  "age": 5,
  "color": "orange",
  "owner": "Asmar"
}

#3. Создание кастомного кота
Запрос:

http
POST api/special?name={имя_кота}
Параметры:

name	String для нового кота.
```Ответ (JSON):

json
{
  "name": "Ваше_имя",
  "age": 5,
  "color": "orange",
  "owner": "Asmar"
}

