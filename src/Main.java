
public class Main {
    
    public static void main(String[] args) {
        
        Student john = new Student();
        john.setName("J"); // unchecked exception
        
        try {
            john.setGpa(4.5); // checked exception
        } catch (MyCheckedException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
