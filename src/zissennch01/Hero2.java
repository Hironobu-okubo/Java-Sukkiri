package zissennch01;

public class Hero2 {
    public String name;
    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null) return false;
        if(!(o instanceof Account)) return false;
        Hero2 r = (Hero2)o;
        if(!this.name.trim().equals(r.name.trim())){
            return false;
        }
        return true;
    }
}
