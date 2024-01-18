package interface_behavior;

public class application {

    public static void main(String[] args)
    {
        // through contrct object, instances of contract interface can be fetched
        contract contrct = new implementations();

        printInterfacecontents(contrct);

    }

    private static void printInterfacecontents(contract con)
    {
        con.term1();
        con.term2();
    }
}
