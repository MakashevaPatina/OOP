import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String student, int magic, int apparition, int diligence, int loyalty, int honesty) {
        super(student, magic, apparition);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getTotalScore() {
        return super.getTotalScore() + diligence + loyalty + honesty;
    }

    public static void compareStudentsHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        Hogwarts.compareStudentsInDepartment(student1, student2);
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        if (isInRange(diligence)) {
            this.diligence = diligence;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (isInRange(loyalty)) {
            this.loyalty = loyalty;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (isInRange(honesty)) {
            this.honesty = honesty;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hufflepuff that = (Hufflepuff) o;
        return diligence == that.diligence && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diligence, loyalty, honesty);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "diligence: " + diligence + "\n" +
                "loyalty: " + loyalty + "\n" +
                "honesty: " + honesty;
    }
}

