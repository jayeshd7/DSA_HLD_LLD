package AugustBatchProblem.LLD;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DependecyInversion {
    // High level modules should not depend on low level modules. Both should depend on abstractions.
    // Abstractions should not depend on details. Details should depend on abstractions.
    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        Research research = new Research(relationships);

    }

}

enum Relationship{
    PARENT,
    CHILD,
    SIBLING
}

class Person{
    public String name;

    public Person(String name) {
        this.name = name;
    }
}

interface RelationshipBrowser{ // introduce interface to break the dependency in the high level module
    List<Person> findAllChildrenOf(String name);
}
class Relationships implements RelationshipBrowser { // low level module
    private List<TripletRelatioship<Person, Relationship, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child){
        relations.add(new TripletRelatioship<>(parent, Relationship.PARENT, child));
        relations.add(new TripletRelatioship<>(child, Relationship.CHILD, parent));
    }

    public List<TripletRelatioship<Person, Relationship, Person>> getRelations() {
        return relations;
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.stream().filter(x->x.first.name.equals(name) && x.second == Relationship.PARENT).map(x->x.third).collect(Collectors.toList());
    }
}

class TripletRelatioship<T, U, V>{
    public T first;
    public U   second;
    public V third;

    public TripletRelatioship(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}

class Research // high level module
{
   /* public Research(Relationships relationships){
        List<TripletRelatioship<Person, Relationship, Person>> relations = relationships.getRelations(); // violation of dependency inversion principle as we are directly accessing the low level module directly

        relations.stream().filter(x->x.first.name.equals("John") && x.second == Relationship.PARENT).forEach(ch-> System.out.println("John has a child called "+ch.third.name));
    }*/
    public Research(RelationshipBrowser browser){
        List<Person> children = browser.findAllChildrenOf("John");
        for(Person child: children){
            System.out.println("John has a child called "+child.name);
        }
    }
}
