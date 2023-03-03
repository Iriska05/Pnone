import java.util.Arrays;
//№1
public class Phone {
        String number;
        String model;
        String weight;
        //№4
        void receiveCall(String name){

                System.out.println("Звонит: " + name);
        }

        String getNumber(){

                return number;
        }
        //№5
        Phone(String num, String mod, String wei){
                number = num;
                model = mod;
                weight = wei;
        }
        //№6
        Phone(String num, String mod) {
                number = num;
                model = mod;
        }
        //№7
        Phone(){

        }
        //№8
        //Phone(String nu, String mo, String we) {
                //this(nu, mo);
               //weight = we;
        //}
        //№9
        void receiveCall(String name,String number){

                System.out.println("Звонит: " + name + " с номера: " + number);
        }
        //№10
        void sendMessage(String message, String... numbers) {
                System.out.println("Сообщение " + message + " отправлено:" + Arrays.toString(numbers));
        }

}




