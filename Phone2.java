public class Phone2 {
    public static void main(String[] args) {
        //№2
        Phone instance1 = new Phone();
        Phone instance2 = new Phone();
        Phone instance3 = new Phone();
        //№3
        instance1.number = "8906879057";
        instance1.model = "Sumsung";
        instance1.weight = "10";

        instance2.number = "8678567864";
        instance2.model = "Honor";
        instance2.weight = "13";

        instance3.number = "86185246524";
        instance3.model = "Nokia";
        instance3.weight = "15";

        System.out.println(instance1.number);
        System.out.println(instance1.model);
        System.out.println(instance1.weight);

        System.out.println(instance2.number);
        System.out.println(instance2.model);
        System.out.println(instance2.weight);

        System.out.println(instance3.number);
        System.out.println(instance3.model);
        System.out.println(instance3.weight);
        //№4
        instance1.receiveCall ("Марина");
        instance2.receiveCall ("Иришка");
        instance3.receiveCall ("Влада");

        System.out.println(instance1.getNumber());
        System.out.println(instance2.getNumber());
        System.out.println(instance3.getNumber());
        //№9
        instance1.receiveCall ("Марина", "8906879057");
        instance1.receiveCall ("Иришка", "8678567864");
        instance1.receiveCall ("Влада", "8618524652");
        //№10
        instance1.sendMessage("первое", "8906879057", "8678567864");
        instance2.sendMessage("второе", "8678567864");
        instance3.sendMessage("третье","8618524652");



    }
}
