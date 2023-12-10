package whc.design.pattern.structural.object.proxy.example.jdkProxy;

/**
 * 抽象用户DAO类，抽象主题角色
 */
public interface AbstractUserDAO {
    public Boolean findUserById(String userId);
}
