# Singleton Design Pattern

The singleton pattern is one of the simplest design patterns. Sometimes we need to have only one instance of our class for example a single DB connection shared by multiple objects as creating a separate DB connection for every object may be costly. Similarly, there can be a single configuration manager or error manager in an application that handles all problems instead of creating multiple managers.


## Easy Initialization

This is the simplest method of creating a singleton class. In this, object of class is created when it is loaded to the memory by JVM.
It is done by assigning the reference an instance directly.
It can be used when program will always use instance of this class, 
or the cost of creating the instance is not too large in terms of resources and time.

### Method 1 Easy Initialization
/*
Pros:
Very simple to implement.
No need to implement getInstance() method. Instance can be accessed directly.
Cons:
May lead to resource wastage. Because instance of class is created always, whether it is required or not.
CPU time is also wasted in creation of instance if it is not required.
Exception handling is not possible.
 */
```
public class Singleton
{
	public static Singleton instance=new Singleton();
	
	private Singleton()
	{
	}
}

```
### Method 2 Easy Initialization

/*
Pros:
Very simple to implement.
No need to implement getInstance() method. Instance can be accessed directly.
Exceptions can be handled in static block.
Cons:
May lead to resource wastage. Because instance of class is created always, whether it is required or not.
CPU time is also wasted in creation of instance if it is not required.
 */
 
```
public class Singleton
{
	public static Singleton instance;
	
	private Singleton()
	{
	}
	static
	{
		instance=new Singleton();
	}
}
```


## Lazy Initialization


### Method 1  - Not Thread Safe

/*
Pros:
Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
Exception handling is also possible in method.
Cons:
Every time a condition of null has to be checked.
instance can’t be accessed directly.
In multithreaded environment, it may break singleton property.
 */
 
```
public class Singleton
{
	private static Singleton instance;
	
	private Singleton()
	{
	}
	public static Singleton getInstance()
	{
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
}
```

### Method 2 - Thread safe but memory inefficient using Synchronization Method

/*
Pros:
Lazy initialization is possible.
It is also thread safe.
Cons:
getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.
 */
 
```
public class Singleton
{
	private static Singleton instance;
	
	private Singleton()
	{
	}
	synchronized public static Singleton getInstance()
	{
		if(instance==null)
		{
			instance=new Singleton();
		}
		return instance;
	}
}
```

### Method 3 Thread safe but memory inefficient using Synchronization block and checking again for null instance

/*
Pros:
Lazy initialization is possible.
It is also thread safe.
Performance reduced because of synchronized keyword is overcome.
Cons:
First time, it can affect performance.
 */
 
```
public class Singleton
{
	private static Singleton instance;
	
	private Singleton()
	{
	}
	public static Singleton getInstance()
	{
		if(instance==null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}

```
### Method 4 : using Inner class to create static final outer class object

/*
When the singleton class is loaded, inner class is not loaded and hence doesn’t create object when loading the class.
Inner class is created only when getInstance() method is called. So it may seem like eager initialization but it is lazy initialization.
This is the most widely used approach as it doesn’t use synchronization.
This is Best Approach

```
 */
public class Singleton
{
    private Singleton()
    {
    }
    private class Inner
    {
        private static final Singleton INSTANCE=new Singleton();
    }
    public static Singleton getInstance()
    {
        return Inner.INSTANCE;
    }
}
```

### Method 5 : Double Checking Locking - Using volatile keyword and synchronization block

// Double Checked Locking based Java implementation of
// singleton design pattern

```
class Singleton
{
    private volatile static Singleton instance;
 
    private Singleton() {}
 
    public static Singleton getInstance()
    {
        if (instance == null)
        {
            // To make thread safe
            synchronized (Singleton.class)
            {
                // check again as multiple threads
                // can reach above step
                if (instance==null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}

```



