package org.example.chapter02;

import org.example.NotThreadSafe;

@NotThreadSafe
public class LazyInitRace {

    /*
    * A common idiom that uses check-then-act is lazy initialization. The goal of lazy
initialization is to defer initializing an object until it is actually needed while at
the same time ensuring that it is initialized only once. LazyInitRace in Listing
2.3 illustrates the lazy initialization idiom. The getInstance method first checks
whether the ExpensiveObject has already been initialized, in which case it returns
the existing instance; otherwise it creates a new instance and returns it after
retaining a reference to it so that future invocations can avoid the more expensive
code path.
    * */
    private ExpensiveObject instance = null;
    public ExpensiveObject getInstance() {
        if (instance == null)
            instance = new ExpensiveObject();
        return instance;
    }
}
