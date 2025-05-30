package ro.cts.clase;

public class StudentStaticBlock {
    private String nume;
    private int varsta;
    private Sex sex;

    public enum Sex {
        M,
        F
    }
    private static final StudentStaticBlock instantaStudent;

    static{
        try{
            instantaStudent = new StudentStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Studentul nu a putut fi creat!", e);
        }
    }

    private StudentStaticBlock() {
        nume = "Daniela";
        varsta = 23;
        sex = Sex.F;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public static StudentStaticBlock getInstantaStudent() {
        return instantaStudent;
    }

    @Override
    public String toString() {
        return "StudentStaticBlock{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", sex=" + sex +
                '}';
    }
}
