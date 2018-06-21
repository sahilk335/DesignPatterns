package BuilderPattern;

public class TestBuilderPattern {

    public static void main(String[] args){
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineerDirector engineer = new CivilEngineerDirector(iglooBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("Builder constructed: "+ house);
    }
}
