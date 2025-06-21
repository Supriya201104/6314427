public class SingletonLoggerExample 
{
    static class Logger 
    {
        private static Logger singleInstance = null;
        private Logger() 
        {
            System.out.println("Logger instance created.");
        }
        public static Logger getInstance() 
        {
            if (singleInstance == null) 
            {
                singleInstance = new Logger();
            }
            return singleInstance;
        }
        public void log(String msg) 
        {
            System.out.println(msg);
        }
    }
    public static void main(String[] args) 
    {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        l1.log("First msg");
        l2.log("Second msg");
        if (l1 == l2) 
        {
            System.out.println("Both are same");
        } 
        else 
        {
            System.out.println("Not same");
        }
    }
}
