# Lecture 1.1

```python
print("Hello World!")
```



```java
public class HelloWorld{
  public static void main(String[] args){
    System.out.println("Hello World!");
  }
}
```

1. All code in Java must be part of a class.
2. Classes are defined with "public class **CLASSNAME**".
3. We delimit the beginning and end of segments of code using {and}.
4. All statements in Java must end in a semi-colon.
5. For code to run we need ***public static void main(String[ ] args)***





```python
x = 0
while x<10:
  print(x)
  x += 1
  
x = "horese"
print(x)
```



```java
public class HelloNumbers{
  public static void main(String[] args){
    int x = 0;
    while(x<10){
      System.out.println(x);
      x += 1;
    }
    
    x = "horse";//error
  }
}
```

1. Before Java variables can be used, they must be declared.
2. Java variables must have a specific type.
3. Java variable types can never change.
4. **Types are verified befroe the code even runs!!!**





```python
def larger(x,y):
  if(x>y):
    return x
  return y

print(larger(-5,10))
```



```java
public class LargerDemo{
  /** Returns the larger of x and y.*/
  public static int larger(int x,int y){
    if(x>y){
      return x;
    }
    return y;
  }
  public static void main(String[] args){
    System.out.println(larger(-5,10));
  }
}
```

1. Funcitons must be declared as part of a class in Java.

   A function that is part of a class is called a "method", so in Java, **all functions are methods.**

2. To define a function in Java, we use "public static", we'll see alternate ways of defining functions later.

3. All parameters of a function must have a declared type, and the return value of the function must have a declared type.

   **Functions in Java return only one value!**