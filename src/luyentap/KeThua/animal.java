package luyentap.KeThua;

public class animal {
    protected String name;
    public animal(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void eat(){
        System.out.println(" dang an " );
    }
}

