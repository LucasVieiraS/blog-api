# Blog API

[![Java](https://img.shields.io/badge/Java-17-blue.svg?style=flat&logo=java)]()
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.5-brightgreen.svg?style=flat&logo=springboot)]()
[![License](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat)]()

REST API for a blog built with Spring Boot (layered controller/service/repository), PostgreSQL + Flyway migrations, and JWT-based authentication.

## Prerequisites

- JDK 17+
- Docker + Docker Compose

## Run

Start Postgres:

```bash
docker compose up -d
```

Run the API (serves under `/api/v1`):

```bash
./mvnw spring-boot:run
```

If `./mvnw` is not executable:

```bash
chmod +x mvnw
```

## Test

Unit tests:

```bash
./mvnw test
```

Integration tests (`*IT.java`, may require Docker):

```bash
./mvnw verify
```

## Diagram

```mermaid
flowchart LR
  C[Client] -->|HTTP| API[Spring Boot API 
  api/v1]
  API -->|JPA| DB[(PostgreSQL)]
  API -->|Flyway migrations| DB
  API <-->|JWT| AUTH[Auth endpoints]
```

## License

MIT — see [LICENSE](LICENSE).
