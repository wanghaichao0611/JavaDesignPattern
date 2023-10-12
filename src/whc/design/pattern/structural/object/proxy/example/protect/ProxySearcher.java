package whc.design.pattern.structural.object.proxy.example.protect;


/**
 * 代理查询类，充当主题角色
 */
public class ProxySearcher implements Searcher {


    private RealSearcher searcher = new RealSearcher();//

    private AccessValidator validator;


    private Logger logger;

    @Override
    public String doSearch(String userId, String keyword) {
        // 如果身份验证成功，则执行查询
        if (this.validator(userId)) {
            String result = searcher.doSearch(userId, keyword);//调用真实主题对象的查询方法
            this.log(userId);//记录查询日志
            return result; //返回查询结果
        } else {
            return null;
        }
    }

    //创建访问验证对象并调用其validate()来实现身份验证
    private boolean validator(String userId) {
        validator = new AccessValidator();
        return validator.validator(userId);
    }


    //创建日志记录对象并调用其log()方法实现日志记录
    public void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }

}