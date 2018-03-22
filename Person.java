public class Person {

        public String name;
        public String birthplace;

        public Person(String name,String birthplace){
            this.name = name;
            this.birthplace = birthplace;
        }

        public void getSelfIntroduction(){
            System.out.println("私の名前は" + this.name + "です。" + this.birthplace + "出身です。");
        }
}



