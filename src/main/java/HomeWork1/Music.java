package HomeWork1;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите желаемый стиль звучания и Желаемое настроение");
        MusicStyle style1 = new MusicStyle(scan.next(),scan.next());
        style1.setStyle();
        style1.setMood();
        System.out.println("Введите уровень громкости и уровень басов");
        Equalizer equa = new Equalizer(scan.nextInt(),scan.nextInt());
        equa.equalizerPreset();
    }
}
