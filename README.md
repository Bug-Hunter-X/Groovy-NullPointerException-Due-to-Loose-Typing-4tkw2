# Groovy NullPointerException Example

This repository demonstrates a common issue in Groovy: unexpected `NullPointerExceptions` arising from the language's dynamic typing and its handling of null values.

The `bug.groovy` file contains a simple method that fails to handle `null` inputs correctly.  The `bugSolution.groovy` file shows how to fix this using explicit null checks.

## How to Reproduce

1. Clone this repository.
2. Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`). Observe the `NullPointerException` when null values are passed.
3. Run `bugSolution.groovy`.  This version demonstrates a solution involving proper null checks. 

## Lesson Learned

This example highlights the importance of defensive programming when working with dynamically typed languages like Groovy. Always consider the possibility of null values and implement appropriate checks to prevent runtime exceptions.