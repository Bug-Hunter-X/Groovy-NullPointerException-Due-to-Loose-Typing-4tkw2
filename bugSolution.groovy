```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Or handle nulls appropriately, e.g., throw an exception
  }
  return a + b
}

println myMethod(1, 2) // Output: 3
println myMethod(null, 2) // Output: 0
println myMethod(1, null) // Output: 0
println myMethod(null, null) // Output: 0
```