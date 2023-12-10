package whc.design.pattern.creational.type.factoryMethod.example;


//DatabaseLoggerFactory：数据库日志记录器工厂类，充当具体工厂角色
public class DatabaseLoggerFactory implements LoggerFactory{

    public Logger createLogger(){
        //连接数据库
        //创建数据库日志记录器对象
        Logger logger=new DatabaseLogger();
        //初始化数据库日志记录器
        return logger;
    }
}
