package whc.design.pattern.structural.object.proxy.example.protect;


/**
 * AccessValidator: 身份验证业务类,它提供validate()方法来实现身份验证
 */
public class AccessValidator {

    //模拟实现登录验证
    public boolean validator(String userId) {
        System.out.println("在数据库中验证用户'" + userId + "'是否为合法用户");
        if (userId.equalsIgnoreCase("杨过")) {
            System.out.println("'" + userId + "'登录成功!");
            return true;
        } else {
            System.out.println("'" + userId + "'登陆失败!");
            return false;
        }
    }

}