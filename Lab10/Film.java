package lab10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Film{
    private String name;
    private List<lab10.Actor> actors = new ArrayList();
    public Film(String name) {
        this.name = name;
    }
    public void addActor(lab10.Actor actor) {
        this.actors.add(actor);
    }
    public List<lab10.Actor> getActors(){
        return this.actors;
    }
    public String getName() {
        return this.name;
    }
    public static String filmWithMaxCountOfActors() {
        int max = 0;
        String rightFilm = "";
        for (Film s: lab10.Database.getFilms())
        {
            if(s.getActors().size() >= max)
            {
                max = s.getActors().size();
                rightFilm = s.getName();
            }
        }

        System.out.println("filmWithMaxCountOfActors: " + rightFilm);
        return rightFilm;
    }

    public static List<lab10.Actor> listOfActorsWithWhichCurrentActorHasPlayed(lab10.Actor actorFind) {
        List<lab10.Actor> resultList = new ArrayList<>();
        Iterator<lab10.Actor> actorIterator = Database.getActors().iterator();
        while (actorIterator.hasNext()) {
            lab10.Actor actor = actorIterator.next();
            Iterator<Film> filmIterator = Database.getFilms().iterator();
            while (filmIterator.hasNext()) {
                Film film = filmIterator.next();
                if (film.getActors().contains(actorFind)) {
                    resultList.add(actor);
                    break;
                }
            }
        }

        System.out.print("listOfActorsWithWhichCurrentActorHasPlayed: ");
        for(lab10.Actor model : resultList) {
            System.out.println(model.getName());
        }

        return resultList;
    }
}