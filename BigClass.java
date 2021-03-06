public class BigClass {

    private int number;
    private String text;

    //Ändra här också.
    public BigClass(int n, String t){
        this.number = n; //testa direkt med set;
        this.text = t;
    }

    public BigClass(int n){
        this(n, null);
    }

    public BigClass(String t){
        this(0,t);
    }

    public BigClass(){
        this(0,null);
    }
    // Här implementera
    public void setNumber(int n){
        if(n > 0) {
            this.number = n;
        } else {
            System.out.println("Error.");
        }
    }

    public int getNumber(){
        return number;
    }

    public void setText(String t){
        this.text = t;
    }

    public String getText(){
        return text;
    }

    public void changeToUpperCase(String t, String input){
        t = input.toUpperCase();
    }

    public void changeToNull(String t) {
        t = null;
    }

    @Override
    public String toString() {
        return "BigClass{" +
                "number=" + number +
                ", text='" + text + '\'' +
                '}';
    }
}
