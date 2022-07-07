package whc.design.pattern.creational.object.singleton.example;

public class Client {
    public static void main(String[] args) {
        //创建4个LoadBalancer对象
        LoadBalancer balancer1, balancer2, balancer3, balancer4;
        balancer1 = LoadBalancer.getLoadBalancer();
        balancer2 = LoadBalancer.getLoadBalancer();
        balancer3 = LoadBalancer.getLoadBalancer();
        balancer4 = LoadBalancer.getLoadBalancer();

        //判断负载均衡的服务器是否相同
        if (balancer1 == balancer2 & balancer2 == balancer3 & balancer3 == balancer4) {
            System.out.println("服务器负载均衡器是否具有唯一性");
        }

        //增加服务器
        balancer1.addServer("Server 1");
        balancer1.addServer("Server 2");
        balancer1.addServer("Server 3");
        balancer1.addServer("Server 4");

        //模拟客户端请求的分发，如果输出结果为同一个server，可以将i适当方法，例如改为 “i < 100”
        for (int i = 0; i < 10; i++) {
            System.out.println("分发服务器请求至服务器：" + balancer1.getServer());
        }
    }
}
