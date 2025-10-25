import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@interface Circket{
    String team();
    int run();

}
@Circket(team="India", run=12000)
class Virat{
    private String name;
    private int innings;

    public int getInnings(){
        return innings;
    }
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setInnings(int innings){
        this.innings=innings;
    }
}
public class AnnototionJavaDemo {
    public static void main(String[] args) {
        Virat virat = new Virat();
        virat.setInnings(100);
        System.out.println("Virat's innings: " + virat.getInnings());
        virat.setName("Virat Kohli");
        System.out.println("Player Name: " + virat.getName());
        Class obj = virat.getClass();
        Circket circket = (Circket) obj.getAnnotation(Circket.class);
        System.out.println("Team: " + circket.team());  
        System.out.println("Runs: " + circket.run());


    }
    
}
