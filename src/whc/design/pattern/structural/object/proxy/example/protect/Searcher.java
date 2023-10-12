package whc.design.pattern.structural.object.proxy.example.protect;


/**
 * 抽象查询类，充当抽象主题角色，它声明了doSearch方法
 */
public interface Searcher {

    public String doSearch(String userId, String keyword);

}