public class Shart  extends Animal{
    private String color;
    private int age;
    private  String gender;


    public Shart(String color, int age, String gender) {
        this.color = color;
        this.age = age;
        this.gender = gender;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void Attack(){

        Shart shart = new Shart("Kok",10,"Erkek");
        System.out.println(shart);
    }
}
