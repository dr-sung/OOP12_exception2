
public class Student {
    
    private String name;
    private int id;
    private double gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        
        this.name = name;
        
        if (name.length() < 2) {
            throw new MyUncheckedException("Name too short");
        }
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) throws MyCheckedException {
        if (gpa < 0 || gpa > 4) {
            throw new MyCheckedException("GPA out of range");
        }
        this.gpa = gpa;
    }
    
    
}
