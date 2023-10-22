package whc.design.pattern.structural.object.proxy.example.jdkProxy;

/**
 *
 */
public class DocumentDAO implements AbstractDocumentDAO {
    @Override
    public Boolean deleteDocumentById(String documentId) {
        if (documentId.equalsIgnoreCase("D001")) {
            System.out.println("删除ID为：" + documentId + "的用户信息成功!");
            return true;
        } else {
            System.out.println("删除ID为：" + documentId + "的用户信息失败!");
            return false;
        }
    }
}
