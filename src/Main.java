public class Main {

    public static void main(String[] args) {

        TransportFactory tf = new TransportFactory();
        tf.createTransport(TransportType.TRUCK);
        tf.createTransport(TransportType.SHIP);
        tf.createTransport(TransportType.AIRPLANE);


    }
}
class TransportFactory {
    public Transport createTransport(TransportType type){
        Transport transport = null;

        switch (type){
            case TRUCK:
                transport = new Truck();
                break;
            case SHIP:
                transport = new Ship();
                break;
            case AIRPLANE:
                transport = new Airplane();
                break;
        }

        transport.transportation();
        return transport;
    }

}

enum TransportType{
    TRUCK,
    SHIP,
    AIRPLANE
}
class Transport{
    public void transportation(){
        System.out.println("Перевозка");
    }
}
class Truck extends Transport{
    @Override
    public void transportation(){
        System.out.println("Перевозка по дороге");
    }
}
class Ship extends Transport {
    @Override
    public void transportation(){
        System.out.println("Перевозка по морю");
    }
}
class Airplane extends Transport{
    @Override
    public void transportation(){
        System.out.println("Перевозка по суше");
    }
}