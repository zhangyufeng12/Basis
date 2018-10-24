package main.day21.itcast.p5.wrapper;
/*
*@author  zhangyufeng
*@data 2018/10/22 上午11:57
*/


public class PersonDemo {

    public static void main( String[] args ) {

        Person p = new Person();
//        p.chifan();
        NewPerson p1 = new NewPerson(p);
        p1.chifan();
        NewPerson2 p2 = new NewPerson2();
        p2.chifan();
    }


    static class  Person{
        void chifan(){
            System.out.println("吃饭");
        }
    }

    //这个类的出现是为了增强Person而出现的。
    static class NewPerson {
        private Person p;
        NewPerson(Person p){
            this.p=p;
        }
        public void chifan(){
            System.out.println("开胃酒");
            p.chifan();
            System.out.println("甜点");
        }
    }

     static class NewPerson2 extends Person{
         public void chifan() {
             System.out.println("开胃酒");
             super.chifan();
             System.out.println("甜点");
         }
         }
     }
