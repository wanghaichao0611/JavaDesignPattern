package whc.design.pattern.structural.object.facade.example;

/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt("F:\\GitHubProject\\JavaDesignPattern\\src\\whc\\design\\pattern\\structural\\object\\facade\\img\\text.txt",
                "F:\\GitHubProject\\JavaDesignPattern\\src\\whc\\design\\pattern\\structural\\object\\facade\\img\\textSercurity.txt");
    }
}
