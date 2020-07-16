package com.codeLearn;

public class Singleton {
//    ------------------------------ 饿汉式-------------------------------------------------------------------
//    优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
//    缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费
//    private static final Singleton INSTANCE = new Singleton();
//    private Singleton() {
//    }
//    public static final Singleton getInstance() {
//        return INSTANCE;
//    }
//    -----------------------------------懒汉式--------------------------------------------------------------
//静态内部类方式  懒加载且线程安全
//    不同的地方在饿汉式方式是只要Singleton类被装载就会实例化，没有Lazy-Loading的作用，
//    而静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，
//    才会装载SingletonInstance类，从而完成Singleton的实例化。
//    类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
//    private static class SingletonHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//
//    private Singleton() {
//    }
//
//    public static final Singleton getInstance() {
//        return SingletonHolder.INSTANCE;
//    }


        //    懒汉式双重检查加锁版本
//    实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
    private volatile static Singleton uniqueInstance;
    public Singleton() {
    }
    public static Singleton getInstance() {
//        检查实例，如果不存在，就进入同步代码块
        if (uniqueInstance != null) {
//            只有第一次才彻底执行这里的代码
            synchronized (Singleton.class) {
                if (uniqueInstance != null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }


}
