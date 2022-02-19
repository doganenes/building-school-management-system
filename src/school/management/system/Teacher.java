package school.management.system;

// This class is responsible for keeping the track of the teacher's name, id, salary.

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create a new Teacher object.
     *
     * @param id     id for the teacher
     * @param name   of the teacher.
     * @param salary of the teacher.
     */
    public Teacher(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return the id of the teacher.
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return the name of the teacher.
     */
    public String getName() {

        return this.name; // return the name of the teacher.
    }

    /**
     * @return the salary of the teacher.
     */
    public int getSalary() {
        return this.salary;
    }

    /**
     * set salary of the teacher.
     *
     * @param salary
     */
    public void setSalary(int salary) {

        this.salary = salary;
    }

    /**
     * Adds to the salary earned.
     * Removes from the total money earned by school.
     *
     * @param salary
     */
    public void receiveSalary(int salary) {

        salaryEarned += salary;
        School.updateMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher: " + name + " Total salary earned so far: $" + salaryEarned;
    }
}
