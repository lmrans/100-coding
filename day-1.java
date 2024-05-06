package tugas2;
public class Animal {
public String name;
public int age;
public String alamat;
public Animal (String name,int age,String alamat){
this.name = name;
this.age = age;
this.alamat = alamat;
}
    public String getname(){
    return name;
    }    
 public int getage(){
     return age;
 }       
 public String getalamat(){
   return alamat;
 }
 public void setname(String name){
 this.name = name;
 }
 public void setage(int age){
 this.age = age;
 } 
 public void setAlamat(String alamat){
 this.alamat = alamat;
 }
 
    }

//class dog
package tugas2;

public class dog extends Animal {
  public String breed;    

    public dog(String name, int age ,String alamat) {
        super(name, age, alamat);
        this.breed = breed;
    }

    public String getBreed (){
    return breed;
    }
    public void setbreed(String breed){
    this.breed = breed;
    }
            public void makesound(){
                System.out.println("Woof! woof!");
                
            }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
//class main
package tugas2;

public class Main {
    public static void main(String[] args) {
       dog su = new dog("harimau",12,"sumatra");
        System.out.println("nama : "+su.getName());
        System.out.println("age : "+su.getAge());
        System.out.println("alamat : "+su.getalamat());
        System.out.println("breed : "+su.getBreed());
    }
}


