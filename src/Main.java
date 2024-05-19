public class Main {
    public static void main(String[] args) {
        System.out.println("OOP_1");
        // Creating Gryffindor students
        Gryffindor harry = new Gryffindor("Harry Potter", 90, 80, 95, 95, 90);
        Gryffindor hermione = new Gryffindor("Hermione Granger", 95, 85, 90, 95, 85);
        Gryffindor ron = new Gryffindor("Ron Weasley", 85, 90, 85, 90, 95);

        // Creating Hufflepuff students
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 85, 75, 90, 95, 85);
        Hufflepuff zahariya = new Hufflepuff("Zahariya Smit", 80, 85, 95, 90, 85);
        Hufflepuff finch = new Hufflepuff("Jastin Finch-Fletchli", 90, 90, 85, 95, 90);

        // Creating Slytherin students
        Slytherin draco = new Slytherin("Draco Malfoy", 85, 80, 90, 80, 95, 85, 90);
        Slytherin grehem = new Slytherin("Grehem Montegu", 70, 85, 85, 80, 85, 80, 85);
        Slytherin goyl = new Slytherin("Gregery Goyl", 75, 70, 75, 75, 75, 82, 88);

        // Creating Ravenclaw students
        Ravenclaw padma = new Ravenclaw("Padma Patil", 95, 85, 95, 90, 95, 90);
        Ravenclaw cho = new Ravenclaw("Cho Chang", 90, 90, 85, 95, 90, 85);
        Ravenclaw belbi = new Ravenclaw("Marcus Belbi", 85, 95, 90, 85, 95, 90);

        Gryffindor.compareStudentsGriffindor(harry, hermione);

        Hufflepuff.compareStudentsHufflepuff(cedric, finch);

        Slytherin.compareStudentsSlytherin(draco, goyl);

        Ravenclaw.compareStudentsRavenclaw(cho, padma);

        Hogwarts.compareStudents(draco, hermione);

        Hogwarts.compareStudentsInDepartment(draco, hermione);

    }
}
