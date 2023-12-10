package whc.design.pattern.creational.object.builder.example;

//客户端测试类
public class ActorClient {

    public static void main(String[] args) {
        ActorBuilder ab = (ActorBuilder) ActorBuilderUtil.getBean();
        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(ab);
        System.out.println(actor.getType()+"的外观：");
        System.out.println("性别："+actor.getSex());
        System.out.println("面容："+actor.getFace());
        System.out.println("服装："+actor.getCostume());
        System.out.println("发型："+actor.getHairstyle());
    }
}
