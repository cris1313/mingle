package spring;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by owen on 2017/11/4.
 */
public class Rewrite {
    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o){
        if (((Rewrite)o).name.equals(this.name)) return true;
        else return false;
    }

    @Override
    public int hashCode(){
        return this.id+10;
    }

    public Rewrite(String name,int id) {
        this.name = name;
        this.id=  id;
    }

    public static void main(String[] args) {
        Rewrite a = new Rewrite("a",1);
        Rewrite b = new Rewrite("a",1);
        Set set = new HashSet();

        System.out.println(a==b);
    }
}
