package school.management.system;

// This class is responsible for keeping the track of students fees, name , grade & fees paid.

public class Student {


    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * To create a new Student object by initializing.
     * Fees for every student is $30,000.
     * Fees paid initally is 0.
     *
     * @param id    for the students. it should be unique.
     * @param name  of the student.
     * @param grade of the student.
     */

    // create constructor
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id; // my id is from the class(Student.java) is equal to id in the method from the parameter.
        this.name = name;
        this.grade = grade;

    }

    // Not going to alter student's name, student's id.

    /**
     * Used to update the student's grade.
     *
     * @param grade new grade of the student.
     */

    public void setGrade(int grade) {

        this.grade = grade;

    }

    /**
     * Keep adding the fees paid to feesPaid Field.
     * The school is going to receive the funds.
     * Add the fees to the feesPaid.
     *
     * @param fees the fees that the student pays.
     */

    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * @return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * @return grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return fees paid by the student.
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * @return the remaining fees.
     */
    public int getRemainingFees() {
        return feesTotal -= feesPaid;

    }

    @Override
    public String toString() {
        return "Student' name : " + name + " Total fees paid so far: $" + feesPaid;
    }

}

