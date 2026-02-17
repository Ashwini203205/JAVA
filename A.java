// JAVA

/* JAVA compiler JDK 
   (compiler =at at time whole , interpreter=line by line)

   JDK : java development kit
   JRE : java runtime environment,inside jdk
   JVM : java virtual machine , inside jre

   java code(source code) -->  compiler(JDK) --> byte code(.class)
   byte code(.class)      -->      JVM       --> native code
*/


/*1. function: 
    void main(){
                 }

  2. class:  
     class main{
        void main(){
                 }
            }
*/


public class A {
        public static void main(String[] args) {
               
        System.out.print("Hello ");         // (;) for command/line finish.
        System.out.print("Ashwini!!");     // print :same line print

        System.out.println("  ");
        System.out.println("\n");          // break line or next line

        System.out.println("wel");        // println : diff line print
        System.out.println("come");



/*  Variables :
   use to store data in memory.
   can vary or change.
   e.g 2(a+b)  a&b are var

   constant :
   can not chamge,fix value
   e.g int a=20;
*/

String name="Ashwini";
int age=20;
double price=20.9;

System.out.println(name);
System.out.println(age);
System.out.println(price);

    }
}

