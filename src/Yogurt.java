public class Yogurt extends diaryProducts { // класс Yogurt наследует класс diaryProducts

    // добавляем вкусовые добавки, объём тары и термизированность
    private String flavoring;
    int containerVolume;
    boolean termization;

    public Yogurt (String expiryDate, float protein, float fat, String flavoring, int containerVolume, boolean termization) {
        super(expiryDate, protein, fat); // вызов конструктора с параметрами из суперкласса
        this.flavoring = flavoring;
        this.containerVolume = containerVolume;
        this.termization = termization;
    }

    public Yogurt (String expiryDate, float protein, float fat) {
        super(expiryDate, protein, fat); // вызов конструктора с параметрами из суперкласса
        flavoring = "caramel";
        containerVolume = 15;
        termization = true;
    }

    public Yogurt () {
        super(); // вызов конструктора без параметров из суперкласса
        flavoring = "vanilla";
        containerVolume = 10;
        termization = false;
    }

    public String GetFlavoring(){
        return flavoring;
    }

    public int GetContainerVolume(){
        return containerVolume;
    }

    public boolean GetTermization(){
        return termization;
    }

    public String Producer (float protein){ // переопределение метода производителя
        this.protein = protein;

        if (0 <= protein && protein <= 2)
            producer = "Lactalis";
        if (2 < protein && protein <= 6)
            producer = "Danone";
        if (6 < protein && protein <= 13)
            producer = "Activia";
        if (13 < protein && protein <= 20)
            producer = "Nestlé";

        return producer;
    }
}
