package whc.design.pattern.behavioral.object.interpreter.example;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        //String instruction = "down run 10 and left move 20";
        String instruction = "up move 5 and down run 10 and left move 5";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        System.out.println(handler.output());
    }
}
