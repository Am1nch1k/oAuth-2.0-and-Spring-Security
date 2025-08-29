# 🔐 Keycloak OAuth 2.0 Integration Example

<div align="center">

![Keycloak](https://img.shields.io/badge/Keycloak-11.0.3-FF6900?style=for-the-badge&logo=keycloak)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.4-6DB33F?style=for-the-badge&logo=springboot)
![OAuth2](https://img.shields.io/badge/OAuth%202.0-2.5.6-EB5424?style=for-the-badge&logo=oauth)
![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=openjdk)

*Мощная и безопасная аутентификация с Keycloak и OAuth 2.0*

</div>

## 🎯 О проекте

Этот проект демонстрирует интеграцию **Spring Boot** с **Keycloak** для реализации аутентификации и авторизации через **OAuth 2.0**. Проект включает полный цикл работы с защищенными API, ролями пользователей и JWT токенами.

## ✨ Возможности

- 🔐 **Аутентификация через Keycloak**
- 🛡️ **Авторизация на основе ролей**
- 📱 **OAuth 2.0 Flows (Authorization Code, Client Credentials)**
- 🔑 **JWT Token Validation**
- 🚀 **REST API с защищенными endpoints**
- 📊 **Пользовательские роли и разрешения**
- 🧪 **Готовые примеры запросов**

## 🏗️ Архитектура

```mermaid
graph TD
    A[Client] --> B[Spring Boot App]
    B --> C[Keycloak Server]
    C --> D[User Database]
    B --> E[Protected Resources]
    
    style A fill:#e1f5fe
    style B fill:#f3e5f5
    style C fill:#fff3e0
    style E fill:#e8f5e8
📦 Технологии
Технология	Версия	Назначение
Java	17	Основной язык разработки
Spring Boot	3.2.4	Фреймворк приложения
Keycloak	11.0.3	Identity Broker
Spring Security	6.2.3	Безопасность и OAuth2
Maven	3.9+	Сборка проекта
Docker	20+	Контейнеризация Keycloak
🚀 Быстрый старт
1. Клонирование репозитория
bash
git clone https://github.com/pavelitel05/keycloak-oauth-example.git
cd keycloak-oauth-example
2. Запуск Keycloak через Docker
bash
docker-compose up -d
Keycloak будет доступен по адресу: http://localhost:8081

3. Настройка Keycloak
Откройте Admin Console (http://localhost:8081)

Войдите с логином: admin / пароль: admin

Импортируйте конфигурацию из файла keycloak-config.json

4. Запуск приложения
bash
mvn clean spring-boot:run
Приложение будет доступно по адресу: http://localhost:8080

⚙️ Конфигурация
application.yml
yaml
keycloak:
  auth-server-url: http://localhost:8081
  realm: master
  resource: spring-boot-app
  public-client: true
  ssl-required: external
  use-resource-role-mappings: true

spring:
  security:
    oauth2:
      client:
        registration:
          keycloak:
            client-id: spring-boot-app
            client-secret: your-client-secret
            authorization-grant-type: authorization_code
            redirect-uri: "{baseUrl}/login/oauth2/code/keycloak"
        provider:
          keycloak:
            issuer-uri: http://localhost:8081/realms/master
📡 API Endpoints
🔓 Public Endpoints
Метод	Endpoint	Описание
GET	/api/public	Публичная информация
GET	/api/public/hello	Приветственный message
🔐 Protected Endpoints
Метод	Endpoint	Роли	Описание
GET	/api/users	USER	Получить пользователей
GET	/api/users/{id}	USER	Получить пользователя
POST	/api/users	ADMIN	Создать пользователя
PUT	/api/users/{id}	ADMIN	Обновить пользователя
DELETE	/api/users/{id}	ADMIN	Удалить пользователя
🧪 Примеры запросов
1. Получение Access Token
bash
curl -X POST "http://localhost:8081/realms/master/protocol/openid-connect/token" \
  -H "Content-Type: application/x-www-form-urlencoded" \
  -d "client_id=spring-boot-app" \
  -d "username=user" \
  -d "password=password" \
  -d "grant_type=password"
2. Доступ к защищенному API
bash
curl -H "Authorization: Bearer YOUR_ACCESS_TOKEN" \
  http://localhost:8080/api/users
3. Swagger документация
После запуска откройте: http://localhost:8080/swagger-ui.html

🛡️ Роли и разрешения
Предустановленные роли:
USER - Базовые права на чтение

ADMIN - Полные права на управление

MODERATOR - Права модерации

Настройка ролей в Keycloak:
Realm Roles → Создать роль

Users → Назначить роли

Clients → Настроить scope permissions

🐛 Troubleshooting
Common Issues:
Connection refused to Keycloak

bash
# Проверить запущен ли Keycloak
docker ps
Invalid token

bash
# Проверить настройки realm и client
CORS issues

yaml
# Добавить в application.yml
keycloak:
  cors: true
📂 Структура проекта
text
src/
├── main/
│   ├── java/com/keycloak/demo/
│   │   ├── config/          # Security configuration
│   │   ├── controller/      # REST controllers
│   │   ├── dto/            # Data transfer objects
│   │   ├── service/        # Business logic
│   │   └── util/           # Utilities
│   └── resources/
│       ├── application.yml # Configuration
│       └── keycloak-config.json
├── docker-compose.yml
└── README.md
🤝 Contributing
Мы приветствуем вклад в проект!

Форкните репозиторий

Создайте feature branch: git checkout -b feature/amazing-feature

Закоммитьте: git commit -m 'Add amazing feature'

Запушьте: git push origin feature/amazing-feature

Откройте Pull Request

📜 Лицензия
Этот проект распространяется под лицензией MIT. Смотрите файл LICENSE для подробностей.

📞 Контакты
Автор: Pavel Itel

Email: pavel.itel@example.com

Telegram: @pavelitel

<div align="center">
⭐ Если этот проект был полезен, поставьте звезду репозиторию!

https://api.star-history.com/svg?repos=pavelitel05/keycloak-oauth-example&type=Date

</div> ```