package AugustBatchProblem.LLD.singleton.impone;

public class Database {
    private static Database instance ;

    private Database() {}

    public static Database getInstance() {
        if(instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }


        return instance;
    }
}
