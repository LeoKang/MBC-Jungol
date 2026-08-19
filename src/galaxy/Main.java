package galaxy;

public class Main {
    public static void main(String[] args) {
        GalaxyS9 s9 = new GalaxyS9();
        s9.powerOn();
//        s9.fold();
        s9.powerOff();

        GalaxyNote10 note10 = new GalaxyNote10();
        note10.powerOn();
        note10.drawPen();
        note10.powerOff();

        GalaxyFold fold = new GalaxyFold();
        fold.powerOn();
        fold.fold();
        fold.powerOff();
    }
}
