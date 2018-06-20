package AbstractFactoryPattern;

//This is Abstract factory class or interface , that is the higher level Abstract class , that creates type of Factory

public interface ComputerAbstractFactory {

    public Computer createComputer();

    //Notice that createComputer() method is returning an instance of super class Computer.
}
