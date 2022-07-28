package HomeWork1;

public class Equalizer {
    int volume;
    int bass;

    public Equalizer(){

    }
    public Equalizer (int volume, int bass){
        this.bass=bass;
        this.volume=volume;
    }

    void equalizerPreset(){
        if (volume >= 6 & bass >=6){
            System.out.println("Выбран режим повышенного звучания");
        }
        else if (volume <= 4 & bass <=4){
            System.out.println("Выбран режим пониженного звучания");
        }
        else {
            System.out.println("Выбран режим звучания по умолчанию");
        }
    }
}
