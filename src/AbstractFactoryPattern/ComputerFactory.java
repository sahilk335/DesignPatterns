package AbstractFactoryPattern;

//This is a client class that will provide entry point to the subclasses
//It contains a method that will return a Abstract Product given the Abstract factory as a parameter

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
