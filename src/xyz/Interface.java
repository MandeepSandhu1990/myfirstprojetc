package xyz;

import java.lang.reflect.WildcardType;

public interface Interface {
    public static void main(String[] args) {
        Work work = new Employee();
        work.work();

    }
    interface Work{
        void work();
    }
    interface IPlay{
        void play();
    }


    class Employee implements Work, IPlay {
        @Override
        public void work() {
            System.out.println("Working");
        }

        @Override
        public void play() {
            System.out.println("Working");
        }
    }
}
