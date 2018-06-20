package AbstractFactoryPattern;

public class TestDesignPatterns {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {

        //Abstract product is Computer-> we use ComputerFactory which is a client to get the Computer by
        //passing a PCFactory which will return a concrete product pc which is of type Computer
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));


        //Abstract product is Computer-> we use ComputerFactory which is a client to get the Computer by
        //passing a ServerFactory which will return a concrete product server which is of type Computer
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));



        /*
        Note in Test class
        We pass Factory objects to get the product
        like we pass newPCFactory and newServerFactory from client to get the concrete product
         */
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }

}
