import java.util.Objects;

public class Hogwarts {
    private String student;
    private int magic;
    private int apparition;

    public Hogwarts(String student, int magic, int apparition) {
        this.student = student;
        this.magic = magic;
        this.apparition = apparition;
    }

    protected boolean isInRange(int value) {
        return value >= 0 && value <= 100;
    }

    protected int getTotalScore() {
        return magic + apparition;
    }

    protected static void compareStudentsInDepartment(Hogwarts student1, Hogwarts student2) {
        int total1 = student1.getTotalScore();
        int total2 = student2.getTotalScore();
        if (student1.getClass().equals(student2.getClass())) {
            if (total1 > total2) {
                System.out.println(student1.getStudent() + " is a better " + student1.getClass().getSimpleName() + " than " + student2.getStudent());
            } else if (total1 < total2) {
                System.out.println(student2.getStudent() + " is a better " + student2.getClass().getSimpleName() + " than " + student1.getStudent());
            } else {
                System.out.println("Both " + student1.getClass().getSimpleName() + " students have the same total score.");
            }
        } else {
            System.out.println("Students from different faculties cannot be compared.");
        }
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        int magicAndApparition1 = student1.getMagic() + student1.getApparition();
        int magicAndApparition2 = student2.getMagic() + student2.getApparition();

        if (magicAndApparition1 > magicAndApparition2) {
            System.out.println(student1.getStudent() + "  has a higher score in magic and transfiguration than " + student2.getStudent());
        } else if (magicAndApparition1 < magicAndApparition2) {
            System.out.println(student2.getStudent() + "  has a higher score in magic and transfiguration than " + student1.getStudent());
        } else {
            System.out.println(student1.getStudent() + " and " + student2.getStudent() + " have the same scores in magic and transfiguration.");
        }
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        if (isInRange(magic)) {
            this.magic = magic;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        if (isInRange(apparition)) {
            this.apparition = apparition;
        } else {
            System.out.println("Введите значение от 0 до 100");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magic == hogwarts.magic && apparition == hogwarts.apparition && Objects.equals(student, hogwarts.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, magic, apparition);
    }

    @Override
    public String toString() {
        return "Student: " + student + "\n" +
                "magic: " + magic + "\n" +
                "apparition: " + apparition;
    }
}

