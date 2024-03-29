# Functional Interface

-----------------------------------------------

The Function Interface is a part of the **java.util.function** package which has been introduced since Java 8.
It represents a function which takes in no or one or more argument and produces a result.

> **Functional interface can have only 1 abstract method**

Hence, this functional interface can take 2 generics namely as follows:
```
T: denotes the type of the input argument
R: denotes the return type of the function
```

### Thumb rule for Functional Interface

* **Only one abstract method** _also known as SAM (Single abstract method)._
* _can have any number of_ **default methods**
* _can have any number of_ **static methods**
* _can have any number of_ **private methods**
* _Functional interface cannot extend another interface which already has abstract method in it, whereas it can extend interface which do not have any abstract method in it._

> _Functional interface is created in java by annotating with_ **@FunctionalInterface**

### Java Predefined-Functional Interfaces

Java provides predefined functional interfaces to deal with functional programming by using lambda and method references.

You can also define your own custom functional interface. Following is the list of functional interface which are placed in java.util.function package.

| Interface                | 	Description                                                                                                              |
|--------------------------|---------------------------------------------------------------------------------------------------------------------------|
| BiConsumer<T,U>	         | It represents an operation that accepts two input arguments and returns no result.                                        |
| Consumer<T>	             | It represents an operation that accepts a single argument and returns no result.                                          |
| Function<T,R>	           | It represents a function that accepts one argument and returns a result.                                                  |
| Predicate<T>	            | It represents a predicate (boolean-valued function) of one argument.                                                      |
| BiFunction<T,U,R>	       | It represents a function that accepts two arguments and returns a a result.                                               |
| BinaryOperator<T>	       | It represents an operation upon two operands of the same data type. It returns a result of the same type as the operands. |
| BiPredicate<T,U>	        | It represents a predicate (boolean-valued function) of two arguments.                                                     |
| BooleanSupplier	         | It represents a supplier of boolean-valued results.                                                                       |
| DoubleBinaryOperator	    | It represents an operation upon two double type operands and returns a double type value.                                 |
| DoubleConsumer	          | It represents an operation that accepts a single double type argument and returns no result.                              |
| DoubleFunction<R>	       | It represents a function that accepts a double type argument and produces a result.                                       |
| DoublePredicate	         | It represents a predicate (boolean-valued function) of one double type argument.                                          |
| DoubleSupplier	          | It represents a supplier of double type results.                                                                          |
| DoubleToIntFunction	     | It represents a function that accepts a double type argument and produces an int type result.                             |
| DoubleToLongFunction	    | It represents a function that accepts a double type argument and produces a long type result.                             |
| DoubleUnaryOperator	     | It represents an operation on a single double type operand that produces a double type result.                            |
| IntBinaryOperator	       | It represents an operation upon two int type operands and returns an int type result.                                     |
| IntConsumer	             | It represents an operation that accepts a single integer argument and returns no result.                                  |
| IntFunction<R>	          | It represents a function that accepts an integer argument and returns a result.                                           |
| IntPredicate	            | It represents a predicate (boolean-valued function) of one integer argument.                                              |
| IntSupplier	             | It represents a supplier of integer type.                                                                                 |
| IntToDoubleFunction	     | It represents a function that accepts an integer argument and returns a double.                                           |
| IntToLongFunction	       | It represents a function that accepts an integer argument and returns a long.                                             |
| IntUnaryOperator	        | It represents an operation on a single integer operand that produces an integer result.                                   |
| LongBinaryOperator	      | It represents an operation upon two long type operands and returns a long type result.                                    |
| LongConsumer	            | It represents an operation that accepts a single long type argument and returns no result.                                |
| LongFunction<R>	         | It represents a function that accepts a long type argument and returns a result.                                          |
| LongPredicate	           | It represents a predicate (boolean-valued function) of one long type argument.                                            |
| LongSupplier	            | It represents a supplier of long type results.                                                                            |
| LongToDoubleFunction	    | It represents a function that accepts a long type argument and returns a result of double type.                           |
| LongToIntFunction	       | It represents a function that accepts a long type argument and returns an integer result.                                 |
| LongUnaryOperator	       | It represents an operation on a single long type operand that returns a long type result.                                 |
| ObjDoubleConsumer<T>	    | It represents an operation that accepts an object and a double argument, and returns no result.                           |
| ObjIntConsumer<T>	       | It represents an operation that accepts an object and an integer argument. It does not return result.                     |
| ObjLongConsumer<T>	      | It represents an operation that accepts an object and a long argument, it returns no result.                              |
| Supplier<T>	             | It represents a supplier of results.                                                                                      |
| ToDoubleBiFunction<T,U>	 | It represents a function that accepts two arguments and produces a double type result.                                    |
| ToDoubleFunction<T>	     | It represents a function that returns a double type result.                                                               |
| ToIntBiFunction<T,U>	    | It represents a function that accepts two arguments and returns an integer.                                               |
| ToIntFunction<T>	        | It represents a function that returns an integer.                                                                         |
| ToLongBiFunction<T,U>	   | It represents a function that accepts two arguments and returns a result of long type.                                    |
| ToLongFunction<T>	       | It represents a function that returns a result of long type.                                                              |
| UnaryOperator<T>	        | It represents an operation on a single operand that return's a result of the same type as its operand.                    |

