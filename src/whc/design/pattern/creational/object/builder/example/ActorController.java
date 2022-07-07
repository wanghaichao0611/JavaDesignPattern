package whc.design.pattern.creational.object.builder.example;

//指挥者
public class ActorController {

    public Actor construct(ActorBuilder actorBuilder) {
        Actor actor;
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actorBuilder.buildHairstyle();
        return actorBuilder.createActor();
    }
}
