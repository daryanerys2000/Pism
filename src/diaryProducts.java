// создание суперкласса
public class diaryProducts {

    protected String producer, expiryDate;
    public float protein, fat;

    public diaryProducts(String expiryDate1, float protein1, float fat1){
        expiryDate = expiryDate1;
        protein = protein1;
        fat = fat1;
    }

    public diaryProducts(){
        expiryDate = "7/05/2020";
        protein = 1.6f; // при float требуется указывать f или F, так как без них типом будет считаться double
        fat = 2;
    }

    public String GetExpiryDate(){
        return expiryDate;
    }

    public float GetProtein(){
        return protein;
    }

    public float GetFat(){
        return fat;
    }

    // метод класса производитель, который будет переопределять производные классы в подклассах
    public String Producer (float protein) {
        producer = "Nestlé";
        return producer;
    }
}
