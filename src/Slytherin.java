import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String student, int magic, int apparition, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(student, magic, apparition);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getTotalScore() {
        return super.getTotalScore() + cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public static void compareStudentsSlytherin(Slytherin student1, Slytherin student2) {
        Hogwarts.compareStudentsInDepartment(student1, student2);
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (isInRange(cunning)) {
            this.cunning = cunning;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (isInRange(determination)) {
            this.determination = determination;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (isInRange(ambition)) {
            this.ambition = ambition;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (isInRange(resourcefulness)) {
            this.resourcefulness = resourcefulness;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        if (isInRange(thirstForPower)) {
            this.thirstForPower = thirstForPower;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cunning, determination, ambition, resourcefulness, thirstForPower);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "cunning: " + cunning + "\n" +
                "determination: " + determination + "\n" +
                "ambition: " + ambition + "\n" +
                "resourcefulness: " + resourcefulness + "\n" +
                "thirstForPower: " + thirstForPower;
    }
}
