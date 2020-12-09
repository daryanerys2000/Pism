public class Curd extends diaryProducts{ // класс Curd наследует класс diaryProducts

    // добавляем массу и зернистость
    private int mass;
    boolean grain;

    public Curd(String expiryDate, float protein, float fat, int m, boolean g) {
        super(expiryDate, protein, fat); // вызов конструктора с параметрами из суперкласса
        mass = m;
        grain = g;
    }

    public Curd (String expiryDate, float protein, float fat, int m){
        super(expiryDate, protein, fat); // вызов конструктора с параметрами из суперкласса
        mass = m;
        grain = true;
    }

    public Curd() {
        super(); // вызов конструктора без параметров из суперкласса
        mass = 200;
        grain = false;
    }

    public int GetMass(){
        return mass;
    }

    public boolean GetGrain(){
        return grain;
    }

    public String Producer (float protein){ // переопределение метода производителя
        this.protein = protein;

        if (0 <= protein && protein <= 2)
            producer = "Danone";
        if (2 < protein && protein <= 6)
            producer = "Nestlé";
        if (6 < protein && protein <= 13)
            producer = "Activia";
        if (13 < protein && protein <= 20)
            producer = "Lactalis";

        return producer;
    }
}
