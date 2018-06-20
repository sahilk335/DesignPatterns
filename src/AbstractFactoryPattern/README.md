Abstract Factory Pattern
========================

Abstract Factory design pattern is one of the Creational pattern. Abstract Factory pattern is almost similar to Factory Pattern is considered as another layer of abstraction over factory pattern. Abstract Factory patterns work around a super-factory which creates other factories.

Abstract factory pattern implementation provides us a framework that allows us to create objects that follow a general pattern. So at runtime, abstract factory is coupled with any desired concrete factory which can create objects of desired type.

UML class diagram example for the Abstract Factory Design Pattern.

AbstractFactory : Declares an interface for operations that create abstract product objects.
ConcreteFactory : Implements the operations declared in the AbstractFactory to create concrete product objects.
Product : Defines a product object to be created by the corresponding concrete factory and implements the AbstractProduct interface.
Client : Uses only interfaces declared by AbstractFactory and AbstractProduct classes.


```
Client software creates a concrete implementation of the abstract factory and then uses the generic interfaces to create the concrete +objects that are part of the family of objects.
The client does not know or care which concrete objects it gets from each of these concrete factories since it uses only the generic interfaces of their products.

So with this idea of Abstract Factory pattern, we will now try to create a design that will facilitate the creation of related objects.
```
![abstract-factory-pattern](https://user-images.githubusercontent.com/21277982/41678990-60abae2e-74ea-11e8-8330-11964eb0efa5.png)

```
Implementation

Let’s take an example, Suppose we want to build a global ComputerAbstract factory. If it was factory design pattern, then it was suitable for a single location. But for this pattern, we need multiple locations and some critical design changes.

We need Computer factories in each location like PCFactory, ServerFactory. Now, our application should be smart enough to identify the location where it is being used, so we should be able to use appropriate Computer factory without even knowing which car factory implementation will be used internally. This also saves us from someone calling wrong factory for a particular location.

Here we need another layer of abstraction which will identify the location and internally use correct computer factory implementation without even giving a single hint to user. This is exactly the problem, which abstract factory pattern is used to solve.
```
