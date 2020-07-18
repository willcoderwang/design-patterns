### improve multithreading

1. Do nothing if the performance of getInstance() isn't critical to your application
2. Move to an eagerly created instance rather than a lazily created one

    If your application always creates and users an instance of the Singleton or the
    overhead of creation and runtime aspects of the Singleton are not onerous, you may
    want to create your Singleton eagerly, like this:
    
        public class Singleton {
            private static Singleton uniqueInstance = new Singleton();
            
            private Singleton() {}
            
            public static Singleton getInstance() {
                return uniqueInstance;
            }
            
        }
        
3. Use "double-checked locking" to reduce the use of synchronization in getInstance()

    With double-checked locking, we first check to see if an instance is created, and if
    not, THEN we synchronize. This way, we only synchronize the first time through, just
    what we want. Let's check out the code:
    
        public class Singleton {
            private volatile static Singleton uniqueInstance;
            
            private Singleton() {}
            
            public static Singleton getInstance() {
                if (uniqueInstance == null) {
                    sychronized (Single.class) {
                        if (uniqueInstance == null) {
                            uniqueInstance = new Singleton();
                        }
                    }
                }
                return uniqueInstance;
            }
        }