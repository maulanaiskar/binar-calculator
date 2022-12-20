fun bagi(a: Int, b: Int) {
    if (b == 0) {
        throw IllegalArgumentException("Cannot divide by zero")
    } else {
        a / b
    }
}