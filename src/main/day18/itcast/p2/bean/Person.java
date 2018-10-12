package main.day18.itcast.p2.bean;
/*
*@author  zhangyufeng
*@data 2018/8/22 下午12:55
*/

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person() {
        super();
    }
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }





    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }





    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    @Override
    public int compareTo( Person p ) {
        int temp =this.age-p.age;
        return temp==0?this.name.compareTo(p.name):temp;
    }


    }

