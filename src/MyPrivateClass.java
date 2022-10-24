public class MyPrivateClass {
   private static String str = "My String";

   public String getStr(){
       return str;
   }
   public void setStr(String str){
       this.str = str;
   }

   public void printString(){
       System.out.println(str);
   }

   private void myMethod(){
       System.out.println("my method");
   }
}
