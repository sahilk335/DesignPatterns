package AbstractFactoryPattern;

//This is Concrete Factory that will implement abstract factory interface and its create method

public class PCFactory implements ComputerAbstractFactory{


    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }


    //Concrete Factory has a product PC, so it returns  PC
    @Override
    public Computer createComputer() {
        return null;
    }
}
