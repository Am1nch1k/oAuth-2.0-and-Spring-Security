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

## 📦 Технологии

| Технология | Версия | Назначение |
|------------|---------|------------|
| **Java** | 17 | Основной язык разработки |
| **Spring Boot** | 3.2.4 | Фреймворк приложения |
| **Keycloak** | 11.0.3 | Identity Broker |
| **Spring Security** | 6.2.3 | Безопасность и OAuth2 |
| **Maven** | 3.9+ | Сборка проекта |
| **Docker** | 20+ | Контейнеризация Keycloak |
>>>>>>> 7c2d4502a5f5c2903fafcf6374adbc37ee274710

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
```
mermaid
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
```
