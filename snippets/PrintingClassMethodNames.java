package com.main;

import java.util.Arrays;

public class App {
    public static void main(String args[]) {
      Arrays.stream(App.class.getMethods()).filter(method -> method.getDeclaringClass().equals(App.class)).peek(method -> System.out.println(method.getName())).collect(Collectors.toList());
    }

    public static void hello(){
    }

}

// Output 
// main
// hello

// Explanation
// Arrays.stream(App.class.getMethods()) - Creates a stream for the supplied input
// filter(method -> method.getDeclaringClass().equals(App.class)) - Since App class extends Object class by default it will iterate through methods names
// in Object class . So check if class = App and return true 
// peek(method->System.out.println(method.getName())) - peek()‘s Javadoc page says: “This method exists mainly to support debugging,
// where you want to see the elements as they flow past a certain point in a pipeline“. This is an intermediate operation . 
// collect(Collectors.toList()) - for peek method to work we should apply a terminal operation . Returns a list with App class method names 
// The result isn't stored anywhere in the code here , but it is added to run the code supplied in peek method . Removing collect method will not run peek method 
