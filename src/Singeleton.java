class Singeleton{
    public String s;
    private Singeleton(){
        s="Hello, I am Rahul";
    }
    private static Singeleton single_instance=null;
    public static Singeleton getInstance(){
    if(single_instance==null)
        single_instance=new Singeleton();
    return single_instance;
    }
}

