# Koly

Koly is a transpilation infrastructure that bridges Kotlin and C++ for high-performance computational science. It is not a user-facing tool, but rather the foundational layer that powers ISK Kompute, a scientific computing engine for Kotlin.

## Vision

Koly aims to make Kotlin and C++ feel like two representations of the same computational space. Instead of slow FFI/JNI bindings that call across language boundaries repeatedly, Koly enables:

- Type-safe Kotlin APIs backed by C++ performance
- Seamless transpilation from Kotlin to C++ for compute-intensive sections
- Zero-Overhead Interop by eliminiating repeated binding calls.

## Justification

### Traditional Approaches

In traditional approaches for JVM software we would've used Java Native Access and Java Native Interface projects to make binding calls to C++ projects. For example:

```kotlin
for (i in 0 until 1_000_000) {
    result[i] = NativeLib.sin(data[i])
}
```

This would inherently mean calling JNI 1 million times. Each call crosses the language boundary, marshals data, and returns. For computational loops, this overhead dominates. Koly, transpiles entire functions to C++, and the data goes there at once, processed natively and returned.

```kotlin
@Native
fun heavyComputation(data: DoubleArray) : DoubleArray {
    return data.map {
        Sin(it)
    }
}
```
In general Koly provides:

1. Existing C++ ecosystem access: Leverage decades of optimized scientific libraries (GSL, Armadillo, Eigen).
2. Selective Performance: Not all code needs C++ speed; transpile only what matters.
3. Cross-platform: Works with Kotlin/JVM, Kotlin/Native, Kotlin WASM, Multiplatform

