package Lesson1;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Obstacle[]{new Cross(80), new Wall(2), new Wall(1), new Cross(120), new Water(100)});
        Team team = new Team("Horde", new Competitor[]{new Human("Trall"), new Human("Sylvana"), new Dog("Voljiin")});
        c.go(team);
        team.showResults();
    }
}