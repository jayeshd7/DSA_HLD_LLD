package AugustBatchProblem.LLD.Iterator;


import java.util.List;

public class MyIteratorImpl implements MyIterator{
    private final List<User> list;
    private final int length;

    private int position=0;
    public MyIteratorImpl(List<User> list){
        this.list = list;
        this.length= list.size();
    }

    @Override
    public boolean hasNext() {
        return position < length;
    }

    @Override
    public Object next() {
        User user = list.get(position);
        position +=1;
        return user;

    }
}
