package AugustBatchProblem.LLD.Iterator;

public class Main {
    public static void main(String[] args) {
        UserManagment userManagment = new UserManagment();
        userManagment.adduser(new User("Jayesh","123"));
        userManagment.adduser(new User("Pooja","456"));
        userManagment.adduser(new User("Bhavi","789"));

        MyIterator myIterator = userManagment.getIterator();
        while(myIterator.hasNext()){
            User user = (User) myIterator.next();
            System.out.println(user.getName());
            System.out.println(user.getId());
        }

    }
}
