package whc.design.pattern.structural.object.composite.example;

/**
 * client
 */
public class Client {
    public static void main(String[] args) {
        //针对抽象类编程
        AbstractFile file1, file2, file3, file4, file5, folder1, folder2, folder3, folder4;

        folder1 = new Folder("Sunny的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");

        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.gif");
        file3 = new ImageFile("九阳真经.txt");
        file4 = new ImageFile("葵花宝典.doc");
        file5 = new ImageFile("笑傲江湖.rmvb");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        //开始进行操作
        folder1.killVirus();
    }
}
