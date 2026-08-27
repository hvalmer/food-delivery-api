# Spring REST Modernization Notes

This document records modernization decisions made during the development of the **Food Delivery API**.

The project revisits concepts from training material originally created across earlier generations of Java and Spring.

The objective is not to classify older approaches as incorrect. Many were appropriate for their ecosystem and time.

Instead, this document answers:

> How should the same engineering problem be approached using the project's current Java and Spring stack?

---

## Project Baseline

The modernization study currently starts from:

* Java 21
* Spring Boot 3.5.x
* Maven
* Spring Web
* Spring Data JPA
* PostgreSQL
* Flyway

Additional technologies will be documented when they are actually introduced.

---

## Modernization Principles

### 1. Understand before replacing

Legacy code or configuration should first be understood in its original context before being replaced.

### 2. Preserve concepts, reconsider implementations

Core concepts such as dependency injection, persistence contexts, REST semantics, validation and authorization remain important even when their APIs or configuration styles change.

### 3. Prefer supported APIs

Deprecated or discontinued libraries should not be introduced merely to reproduce historical examples.

### 4. Avoid speculative modernization

A technology is documented here only after its corresponding topic is reached and its implementation is analyzed.

### 5. Keep the application executable

Modernization changes should be incremental and preferably leave the project in a buildable and testable state.

---

# Modernization Register

## Java Platform

### Older Java → Java 21

**Status:** Active from project bootstrap.

The project uses Java 21 as its development baseline.

Relevant language and platform improvements may be adopted when they improve clarity or design without unnecessarily complicating the educational purpose of the implementation.

---

## Java EE / Jakarta EE Namespace

### `javax.*` → `jakarta.*`

**Status:** Expected throughout the project.

Modern Spring Boot generations use Jakarta EE APIs.

Examples expected during implementation include:

```text
javax.persistence.*   → jakarta.persistence.*
javax.validation.*    → jakarta.validation.*
```

Concrete migration examples will be added when those APIs are introduced in the project.

---

## Spring Boot

### Earlier Spring Boot generations → Spring Boot 3.5.x

**Status:** Active from project bootstrap.

The application starts directly on Spring Boot 3 rather than implementing an older version and performing a full migration afterward.

This means modernization differences will be documented when historical examples diverge from the current implementation.

---

## API Documentation

### SpringFox → SpringDoc

**Status:** Planned.

The historical training includes SpringFox-based API documentation as well as a later SpringDoc module.

The current project will preserve the OpenAPI/documentation concepts while favoring SpringDoc for the modern implementation.

Detailed implementation notes will be added when API documentation is introduced.

---

## Spring Security

### Legacy configuration → modern component-based configuration

**Status:** Planned.

Older Spring Security examples may rely on configuration APIs that are no longer the preferred approach.

The current implementation is expected to use modern security configuration based on Spring-managed components such as `SecurityFilterChain`.

Exact differences will be documented during the security modules.

---

## OAuth 2 and Authorization

### Historical OAuth infrastructure → current Spring Security ecosystem

**Status:** Planned.

The original security implementation will be analyzed conceptually before selecting its current equivalent.

Topics expected to include:

* OAuth 2
* JWT
* resource server configuration
* authorization rules
* Spring Authorization Server

No implementation decision beyond the project's current baseline is considered final until the corresponding modules are reached.

---

## Database Evolution

### Manual schema evolution → versioned migrations

**Status:** Planned.

Flyway will be used to version database schema changes as persistence is introduced.

Each schema evolution should be reproducible across development environments.

---

## Environment Portability

### Machine-specific setup → reproducible development environment

**Status:** In Progress.

The project is intended to be developed on more than one machine.

The repository therefore favors:

* Maven Wrapper;
* environment-independent source code;
* externalized configuration;
* Git-based synchronization;
* containerized infrastructure when appropriate.

Machine-specific IDE configuration and build output must remain outside version control.

---

# Decision Log

Modernization decisions will be registered using the following structure:

```text
## Decision — <title>

Date:
Module:
Status:

### Historical approach
...

### Current implementation
...

### Why it changed
...

### Impact
...

### Related commits
...
```

This creates a technical history explaining not only **what changed**, but **why it changed**.

---

# Current Modernization Map

| Area                | Historical direction      | Current direction                                        | Status      |
| ------------------- | ------------------------- | -------------------------------------------------------- | ----------- |
| Java                | Earlier Java generation   | Java 21                                                  | Active      |
| Persistence API     | `javax.persistence`       | `jakarta.persistence`                                    | Planned     |
| Validation          | `javax.validation`        | `jakarta.validation`                                     | Planned     |
| Spring Boot         | Earlier generations       | Spring Boot 3.5.x                                        | Active      |
| API Docs            | SpringFox                 | SpringDoc / OpenAPI 3                                    | Planned     |
| Security            | Legacy configuration APIs | `SecurityFilterChain` approach                           | Planned     |
| Authorization       | Historical OAuth stack    | Current Spring Security / Authorization Server ecosystem | Planned     |
| Database migrations | Historical implementation | Flyway                                                   | Planned     |
| Environment         | Machine-oriented          | Reproducible / externalized                              | In Progress |

---

## Guiding Principle

The purpose of modernization is not to rewrite code merely because it is old.

The purpose is to understand the engineering problem, identify what changed in the ecosystem and implement a solution that remains technically relevant today.
