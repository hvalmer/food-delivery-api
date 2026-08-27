# Learning & Implementation Roadmap

This document tracks the technical evolution of the **Food Delivery API** while revisiting the 28 modules of the Especialista Spring REST training.

The goal is not to reproduce every lesson or preserve legacy implementations.

Each module is analyzed according to three questions:

1. Which concepts remain relevant?
2. How should they be implemented using the project's current stack?
3. What changed in the Java and Spring ecosystem since the original material?

## Status Legend

* ⏳ Pending
* 🚧 In Progress
* ✅ Completed
* 🔄 Modernized
* ⚠️ Requires significant modernization

---

## Phase 1 — Spring, Persistence and REST Foundations

### 01 — Introduction

**Status:** 🚧 In Progress

Project preparation, development environment and initial architecture.

Current project baseline:

* Java 21
* Spring Boot 3.5.x
* Maven
* Maven Wrapper
* Git
* GitHub

---

### 02 — Spring and Dependency Injection

**Status:** ⏳ Pending

Topics include Spring fundamentals, IoC container, beans and dependency injection.

**2026 focus:** analyze current dependency injection practices and component design.

---

### 03 — Introduction to JPA and Hibernate

**Status:** ⏳ Pending

Introduction to persistence, entities and ORM.

**2026 focus:**

* Jakarta Persistence
* Hibernate 6
* entity lifecycle
* persistence context
* domain mapping

---

### 04 — REST with Spring

**Status:** ⏳ Pending

REST resource implementation using Spring Web.

**2026 focus:**

* resource modeling
* HTTP semantics
* controllers
* representations
* status codes

---

### 05 — Spring Data JPA Superpowers

**Status:** ⏳ Pending

Repositories, queries and Spring Data abstractions.

---

### 06 — Exploring More JPA and Hibernate

**Status:** ⏳ Pending

Advanced persistence concepts, relationships and ORM behavior.

---

### 07 — Connection Pooling and Flyway

**Status:** ⏳ Pending

**2026 focus:**

* datasource configuration
* connection pooling
* database migrations
* Flyway
* reproducible database evolution

---

## Phase 2 — API Robustness and Design

### 08 — API Error Handling and Modeling

**Status:** ⏳ Pending

Structured API errors, exception handling and HTTP error semantics.

---

### 09 — Bean Validation

**Status:** ⏳ Pending

**2026 focus:** Jakarta Bean Validation and API boundary validation.

---

### 10 — Integration Testing

**Status:** ⏳ Pending

Integration testing of persistence and HTTP resources.

---

### 11 — REST API Best Practices and Techniques

**Status:** ⏳ Pending

REST conventions, resource design and API maintainability.

---

### 12 — Advanced API Modeling and Implementation

**Status:** ⏳ Pending

Expansion of the food delivery domain and business rules.

---

### 13 — Projections, Search and Reports

**Status:** ⏳ Pending

Advanced querying, projections, filtering and reporting.

---

## Phase 3 — Integration and HTTP Features

### 14 — File Upload and Download

**Status:** ⏳ Pending

File handling and product media resources.

---

### 15 — Transactional Emails and Domain Events

**Status:** ⏳ Pending

Application events and transactional communication.

---

### 16 — CORS and API Consumption

**Status:** ⏳ Pending

Cross-origin resource sharing and external API consumption.

---

### 17 — HTTP Cache

**Status:** ⏳ Pending

HTTP caching semantics and conditional requests.

---

## Phase 4 — Documentation, Discoverability and Evolution

### 18 — OpenAPI, Swagger UI and SpringFox

**Status:** ⚠️ Requires significant modernization

The original module includes SpringFox.

**2026 direction:** evaluate the original concepts while implementing current API documentation using SpringDoc and OpenAPI 3.

---

### 19 — Discoverability and HATEOAS: The Glory of REST

**Status:** ⏳ Pending

Hypermedia, discoverability and REST maturity.

---

### 20 — API Evolution and Versioning

**Status:** ⏳ Pending

Compatibility, API evolution and versioning strategies.

---

### 21 — Logging

**Status:** ⏳ Pending

Application logging and observability fundamentals.

---

## Phase 5 — Security

### 22 — Spring Security and OAuth 2

**Status:** ⚠️ Requires modernization

Authentication, authorization and OAuth 2 fundamentals.

---

### 23 — Advanced OAuth 2, JWT and Access Control

**Status:** ⚠️ Requires modernization

JWT-based authorization and fine-grained access control.

---

## Phase 6 — Containers and Deployment

### 24 — Dockerizing the Application

**Status:** ⏳ Pending

Application and infrastructure containerization.

---

### 25 — Deploying Docker Containers on Amazon

**Status:** ⏳ Pending

Cloud/container deployment concepts.

Deployment choices will be reassessed when this module is reached rather than copied directly from the historical material.

---

## Phase 7 — Modern Spring Stack

### 26 — API Documentation with SpringDoc

**Status:** ⏳ Pending

SpringDoc and OpenAPI-based API documentation.

This module becomes particularly relevant when comparing it with the SpringFox-based approach introduced earlier.

---

### 27 — Spring Authorization Server

**Status:** ⏳ Pending

Modern authorization server infrastructure in the Spring ecosystem.

---

### 28 — Spring Boot 3

**Status:** ⏳ Pending

Spring Boot 3 modernization concepts.

Because this project starts directly on Spring Boot 3.5.x and Java 21, concepts from this module may be encountered throughout the entire development lifecycle rather than only at the end.

---

# Progress

```text
Completed:   0 / 28
In Progress: 1 / 28
Pending:    27 / 28
```

This document will be updated as modules progress.

Relevant commits, modernization decisions and implementation observations will be added incrementally rather than predicted in advance.
