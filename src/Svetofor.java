/**
 * Класс описывающий модель светофора.
 */
public class Svetofor {

    static Boolean red = false;
    static Boolean yellow = false;
    static Boolean green = false;
    static Boolean yellowBlink = true;

    /**
     * Кнопка оператора "вкл/выкл".
     */
    public static void onOff() {
        if (!yellowBlink) {
            red = false;
            yellow = false;
            green = false;
            yellowBlink = true;
            System.out.println("Светофор выключен");
            System.out.println("Жёлтый мигает");
            System.out.println();
        } else {
            yellowBlink = false;
            yellow = true;
            System.out.println("Светофор включен");
            System.out.println("Жёлтый загорелся");
            System.out.println();
        }
    }

    /**
     * Кнопка оператора "включить красный".
     * */
    public static void setRed() {
        if (red) {
            System.out.println("Красный уже горит");
            System.out.println();
        } else if (yellowBlink) {
            System.out.println("Светофор выключен, сначала включите светофор");
            System.out.println();
        } else if (green) {
            green = false;
            System.out.println("Зелёный потух");
            yellow = true;
            System.out.println("Жёлтый загорелся");
            yellow = false;
            System.out.println("Жёлтый потух");
            red = true;
            System.out.println("Красный загорелся");
            System.out.println();
        } else if (yellow) {
            yellow = false;
            System.out.println("Жёлтый потух");
            red = true;
            System.out.println("Красный загорелся");
            System.out.println();
        }
    }

    /**
     * Кнопка оператора "включить зелёный".
     */
    public static void setGreen() {
        if (green) {
            System.out.println("Зелёный уже горит");
            System.out.println();
        } else if (yellowBlink) {
            System.out.println("Светофор выключен, сначала включите светофор");
            System.out.println();
        } else if (red) {
            red = false;
            System.out.println("Красный потух");
            yellow = true;
            System.out.println("Жёлтый загорелся");
            yellow = false;
            System.out.println("Жёлтый потух");
            green = true;
            System.out.println("Зелёный загорелся");
            System.out.println();
        } else if (yellow) {
            yellow = false;
            System.out.println("Жёлтый потух");
            green = true;
            System.out.println("Зелёный загорелся");
            System.out.println();
        }
    }
}
