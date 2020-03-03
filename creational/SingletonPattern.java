class President {
    private static President instance = null;
    private String mName = null;

    private President() {
        this.mName = "Mahendra Liya";
    }

    public static President getInstance() {
        if (instance == null) {
            instance = new President();
        }

        return instance;
    }

    public String getName() {
        return mName;
    }
}

public class SingletonPattern {
    public static void main(String args[]) {
        // President president = new President() is not allowed and will result in an
        // error
        President president = President.getInstance();
        System.out.println("The name of the president is: " + president.getName());

        // Trying to create a new president
        President president2 = President.getInstance();
        System.out.println("The name of the second president is: " + president2.getName());
    }
}