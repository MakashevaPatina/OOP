import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String student, int magic, int apparition, int honor, int nobility, int bravery) {
        super(student, magic, apparition);
        this.honor = honor;
        this.nobility = nobility;
        this.bravery = bravery;
    }

    public int getTotalScore() {
        return super.getTotalScore() + nobility + honor + bravery;
    }

    public static void compareStudentsGriffindor(Gryffindor student1, Gryffindor student2) {
        Hogwarts.compareStudentsInDepartment(student1, student2);
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (isInRange(nobility)) {
            this.nobility = nobility;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (isInRange(honor)) {
            this.honor = honor;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (isInRange(bravery)) {
            this.bravery = bravery;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "nobility: " + nobility + "\n" +
                "honor: " + honor + "\n" +
                "bravery: " + bravery;
    }
}


