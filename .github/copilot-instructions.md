# Copilot instructions for Java-Revision

## Project purpose

This repository is a collection of Java code snippets and extras rather than a single application or library. The README is the main source of project context, and the repo should be treated as a lightweight examples repo unless new structure is introduced deliberately.

## Build, test, and lint commands

No build system is present in this repository. There is no `pom.xml`, `build.gradle`, Gradle wrapper, Maven wrapper, package manifest, or CI configuration detected.

Because the repo is a snippet collection, validation is typically done per file:

- Compile a Java source file:
  - `javac SomeExample.java`
- Run the compiled class:
  - `java SomeExample`

If a snippet includes a `main` method, it should usually be runnable with those two commands. There is no single "full suite" or lint command to run across the repo.

## High-level architecture

- The repository is intentionally minimal and flat.
- Most content is expected to be standalone Java examples or small exercises, each self-contained and focused on one concept.
- There is no application lifecycle, service layer, dependency injection container, or multi-module structure to follow.
- Future changes should assume a low-complexity layout: snippets remain independent unless a clear need for shared classes or folders emerges.

## Key conventions

- Keep examples self-contained and easy to run in isolation.
- Prefer clear, single-purpose Java classes with a direct `main` entry point when demonstrating a concept.
- Avoid adding framework assumptions (Spring, Maven archetypes, build plugins, or app scaffolding) unless the repository grows into a real Java project.
- Preserve the repo’s “snippets and extras” nature; changes should stay small, readable, and focused on Java learning or experimentation.
- When adding a sample, document the exact compile/run command in the relevant context instead of creating repo-wide project tooling that does not exist.

## Working assumptions for future Copilot sessions

- Treat the repo as a Java examples repository, not as a production application.
- Prefer direct, minimal Java code over introducing project conventions that do not already exist.
- Use the README as the canonical description of the project’s intent and keep new additions aligned with that scope.
