package lab10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Film{
    private String name;
    private List<Actor> actors = new ArrayList();
    public Film(String name) {
        this.name = name;
    }
    public void addActor(Actor actor) {
        this.actors.add(actor);
    }
    public List<Actor> getActors(){
        return this.actors;
    }
    public String getName() {
        return this.name;
    }
    public static String filmMaxCountOfActors() {
        String result = "";

//        Iterator<lab10.Actor> actorIterator = Database.getActors().iterator();
//        while (actorIterator.hasNext()) {
//            lab10.Actor actor = actorIterator.next();
//            Iterator<Film> filmIterator = Database.getFilms().iterator();
//
//            boolean present = false;
//            while (filmIterator.hasNext()) {
//                Film film = filmIterator.next();
//                if (film.getActors().contains(actor)) {
//                    present = true;
//                    break;
//                }
//            }


        return result;
    }
}