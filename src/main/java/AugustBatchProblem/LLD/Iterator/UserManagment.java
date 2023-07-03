package AugustBatchProblem.LLD.Iterator;


import java.util.ArrayList;

public class UserManagment {
   private ArrayList<User> userList= new ArrayList<>();

   public void adduser(User user){
       userList.add(user);
   }
   public  User getuser(int index) {
       return userList.get(index);
   }

    public MyIterator getIterator() {
       return new MyIteratorImpl(userList);
    }


}
