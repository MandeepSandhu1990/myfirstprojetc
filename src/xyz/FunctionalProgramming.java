package xyz;

public class FunctionalProgramming {
    public static void main(String[] args) {
        Greeting greeting = n -> "Hello " + n;
        System.out.println(greeting.greet("mandeep"));

        /// lamba expressions /////
        Max max = (a,b) -> a>b?a:b;
        System.out.println(max.max(6, 7));



//////////////  complex logic  /////////
//        Max max = (a,b)->{
//            if(a>b){
//                return a;
//            }else{
//                return b;
//            }
//        }
    }

    @FunctionalInterface
    interface Greeting{
        String greet(String name);
        class Genetator{

        }
        interface inner{
            String myData();
        }
    }

    class ABC implements Greeting{
        @Override
        public String greet(String name) {
            return null;
        }
        class InnClass implements Greeting.inner{
            @Override
            public String myData() {
                return "My data";
            }
        }
    }
    interface Max{
        int max(int num1, int num2);
    }
}
