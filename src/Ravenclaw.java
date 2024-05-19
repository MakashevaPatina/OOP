import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String student, int magic, int apparition, int intelligence, int wisdom, int wit, int creativity) {
        super(student, magic, apparition);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getTotalScore() {
        return super.getTotalScore() + intelligence + wisdom + wit + creativity;
    }

    public static void compareStudentsRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        Hogwarts.compareStudentsInDepartment(student1, student2);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        if (isInRange(intelligence)) {
            this.intelligence = intelligence;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if (isInRange(wisdom)) {
            this.wisdom = wisdom;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        if (isInRange(wit)) {
            this.wit = wit;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (isInRange(creativity)) {
            this.creativity = creativity;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return intelligence == ravenclaw.intelligence && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creativity == ravenclaw.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intelligence, wisdom, wit, creativity);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "intelligence: " + intelligence + "\n" +
                "wisdom: " + wisdom + "\n" +
                "wit: " + wit + "\n" +
                "creativity: " + creativity;
    }
}
