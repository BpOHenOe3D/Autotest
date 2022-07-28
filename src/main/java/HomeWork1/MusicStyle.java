package HomeWork1;

public class MusicStyle {
    String style;
    String mood;

    public MusicStyle(){

    }
    public MusicStyle(String style,String mood){
        this.mood=mood;
        this.style=style;
    }

    void setStyle(){
        System.out.println("Ваш стиль музыки: " + style);
    }
    void setMood(){
        System.out.println("Ваше настроение: " + mood);
    }
}
