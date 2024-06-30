public class equals_ {
    public static void main(String[] args) {

    }
}

class People {
    private String name;
    private int age;
    private char gender;

    public People(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {return true;}

        if (obj instanceof People) {
            People p = (People) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
