public class Eagle extends Animal{
    private String color;
    private int  age;
    private String gender;

    public Eagle(String color, int age, String gender) {
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

    public void Fly(){
         Eagle eagle = new Eagle("AK",20,"aaaa");
        System.out.println(eagle);
    }
}
