public class Main {
    public static void main(String[] args) {
        bus bus = new bus(10, 1, 1000, 1, 11, 1);
        bus.addUser();
        bus.playChange();
        bus.speedChange();
        System.out.println("버스끝 택시 시작");
        taxi taxi = new taxi(1,  11,  1,  "인천",  5,  10,  3000,  0,  300);
        taxi.addUser();
        taxi.speedChange();
        taxi.pay();

    }
}