class Animals{  
void eat(){System.out.println("eating...");}  
}  
class Dogs extends Animals{  
void bark(){System.out.println("barking...");}  
}  
class Cat1 extends Animals{  
void meow(){System.out.println("meowing...");}  
}  
class Hierarchical{  
public static void main(String args[]){  
Cat1 c=new Cat1();  
c.meow();  
c.eat();  
//c.bark();//C.T.Error  
}}  