# Koly
Koly is a general package for transpiling code from Kotlin programming language to other programming languages, and vice versa. It is designed to be extensible and modular. It will be used as a backend for Kompute numerical library in Kotlin, allowing to write numerical code in Kotlin and transpile it to other languages like Python, C++, etc. 

It will later on be used to transpile code from other languages to Kotlin, allowing to write code in other languages and transpile it to Kotlin as well.
It will be used to develop numerical libraries at faster rate for Kotlin, by using already written libraries in C/C++, Fortran and Julia.

## Methodology
Koly will use a combination of parsing, AST generation, and code generation techniques to achieve its goals. It will leverage existing libraries and tools for parsing Kotlin code and generating ASTs. The code generation will be done using template-based approaches, allowing for easy customization and extension to support new target languages. It will go recursively through the code base and the libraries until it finds the root implementations, which are available in the target language.

For example, suppose a Kotlin code as below:

```kotlin
fun main() {
    val x = 10
    val y = 20
    val z = x + y
    println("The sum of $x and $y is $z")
}
```
Koly will parse this code, generate an AST representation of the code, and then use templates to generate equivalent code in the target language, such as Python:

```python
def main():
    x = 10
    y = 20
    z = x + y
    print(f"The sum of {x} and {y} is {z}")
```
or in cpp:

```cpp
#include <iostream>
int main() {
    int x = 10;
    int y = 20;
    int z = x + y;
    std::cout << "The sum of " << x << " and " << y << " is " << z << std::endl;
    return 0;
}
```

Koly understands the dependencies in Cpp is different than Python, and it will add the necessary includes and headers for the target language. In future goals Koly would have optimization methods included to optimize the generated code for performance and readability.

## Current Status
Currently, Koly is in its early stages of development. It can parse Kotlin code and generate an Abstract Syntax Tree (AST) representation of the code. 

## Usage in Kompute
Kompute will use Koly as a part of the backend for producing native cpp code from Kotlin. This would be achieved by annotating the functions in Kotlin with a special annotation and using Kompute gradle plugin to trigger the transpilation process.

## Future Goals
- Support for more target languages like JavaScript, Rust, etc.
- Optimization techniques for generated code.
- Integration with build systems like Gradle and Maven for seamless transpilation during the build process.
- Development of a user-friendly CLI tool for Koly.
- Comprehensive testing and validation of generated code to ensure correctness and performance.