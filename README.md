# CS Intro Programming (Java)

Coursework from **[Term, Year]** at **[School Name]**.

These are small programs from an introductory Java course, focused on
object-oriented basics: classes, constructors, methods, arrays, and testing
a class with a driver program.

## Contents

| Folder | Topic | Concepts practiced |
|--------|-------|--------------------|
| [`fan/`](fan) | `Fan` class and driver | Constructors, instance variables, methods that return values |
| [`song/`](song) | `Song` class and tester | Overloaded constructors, getters/setters, `toString()` |
| [`circle/`](circle) | `Circle` class and tester | `Math` methods, object references, arrays of objects |
| [`review/`](review) | Array review | Large arrays, seeded `Random` |

## Requirements

- Java Development Kit (JDK) 8 or newer

Check your version with `java -version`.

## Running an example

Each folder is self-contained. From the repo root:

```bash
cd fan
javac *.java
java FanDriver
```

| Folder | Main class to run |
|--------|-------------------|
| `fan/` | `FanDriver` |
| `song/` | `SongTester` |
| `circle/` | `CircleTester` |
| `review/` | `Review1` |

## Notes

- Compiled `.class` files are intentionally not committed (see `.gitignore`).
- Original course assignment text is not included.

## Author

[Your Name] · [GitHub profile link]
