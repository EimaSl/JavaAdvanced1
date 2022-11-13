package lesson12.homeworkCsvFile;

public class TrEvaluation {
    String student;
    int grade;
    String evaluation;

    public TrEvaluation() {
    }

    public TrEvaluation(String student, int grade, String evaluation) {
        this.student = student;
        this.grade = grade;
        this.evaluation = evaluation;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }
}
