
public class Main {
    public static void main(String[] args) {
        KidUser Aubrey = new KidUser(10, "Kids");
        KidUser Ashley = new KidUser(18, "Fiction");
        Aubrey.requestBook();
        Ashley.requestBook();
        Ashley.registerAccount();
        Aubrey.registerAccount();

        AdultUser Eiden = new AdultUser(5, "Kids");
        AdultUser Edwin = new AdultUser(23, "Fiction");
        Eiden.requestBook();
        Edwin.requestBook();
        Edwin.requestBook();
        Eiden.requestBook();

    }
}