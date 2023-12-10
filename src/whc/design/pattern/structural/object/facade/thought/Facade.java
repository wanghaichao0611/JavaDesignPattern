package whc.design.pattern.structural.object.facade.thought;

/**
 * 
 */
public class Facade {

    private final SubSystemA a= new SubSystemA();
    private final SubSystemB b= new SubSystemB();
    private final SubSystemC c= new SubSystemC();

    /**
     * Default constructor
     */
    public Facade() {
    }

    public void method(){
        a.methodA();
        b.methodB();
        c.methodC();
    }

}