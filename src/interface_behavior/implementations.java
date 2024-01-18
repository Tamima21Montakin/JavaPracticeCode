package interface_behavior;

public class implementations implements contract{
    @Override
    public void term1() {
        System.out.println("Implemented: Term1");
    }
    public void term2() {
        System.out.println("Implemented: Term2");
    }

    @Override
    public void extendTerm() {
        System.out.println("Implemented: extendTerm");
    }
}
