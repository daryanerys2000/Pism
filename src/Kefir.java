public class Kefir extends diaryProducts {

    // добавляем объём тары и количество бифидобактерий
    int containerVolume, bifidobacteria;

    public Kefir(String expiryDate, float protein, float fat, int c, int b){
        super(expiryDate, protein, fat); // вызов конструктора с параметрами из суперкласса
        containerVolume = c;
        bifidobacteria = b;
    }

    public Kefir(String expiryDate, float protein, float fat){
        super(expiryDate, protein, fat); // вызов конструктора с параметрами из суперкласса
        containerVolume = 32;
        bifidobacteria = 10000000;
    }

    public Kefir(){
        super(); //вызов конструктора без параметров из суперкласса
        containerVolume = 28;
        bifidobacteria = 10000000;
    }

    public int GetContainerVolume(){
        return containerVolume;
    }

    public int GetBifidobacteria(){
        return bifidobacteria;
    }

    public String Producer (float protein){ // переопределение метода производителя
        this.protein = protein;

        if (0 <= protein && protein <= 2)
            producer = "Nestlé";
        if (2 < protein && protein <= 6)
            producer = "Activia";
        if (6 < protein && protein <= 13)
            producer = "Danone";
        if (13 < protein && protein <= 20)
            producer = "Lactalis";

        return producer;
    }
}
