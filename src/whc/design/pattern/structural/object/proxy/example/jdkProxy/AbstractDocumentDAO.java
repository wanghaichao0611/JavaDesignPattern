package whc.design.pattern.structural.object.proxy.example.jdkProxy;

/**
 * 抽象文档DAO类，抽象主题角色
 */
public interface AbstractDocumentDAO {
    public Boolean deleteDocumentById(String documentId);
}
