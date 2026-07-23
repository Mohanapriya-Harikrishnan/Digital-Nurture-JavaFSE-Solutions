# Difference between JPA, Hibernate and Spring Data JPA

## JPA (Java Persistence API)
- It is a specification.
- Defines standard APIs for ORM.
- Does not provide implementation.
- Requires an implementation like Hibernate.

## Hibernate
- ORM framework.
- Implements JPA specification.
- Converts Java objects into database tables.
- Provides HQL, caching, lazy loading, etc.

## Spring Data JPA
- Built on top of JPA.
- Reduces boilerplate code.
- Provides JpaRepository.
- Automatically generates CRUD methods.
- Integrates easily with Spring Boot.

## Relationship

Application
      ↓
Spring Data JPA
      ↓
Hibernate
      ↓
JPA Specification
      ↓
Database