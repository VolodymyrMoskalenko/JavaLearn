
package lab10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Actor{
    private String name;
    private List<Film> films = new ArrayList();
    public Actor(String name) {
        this.name = name;
    }
    public void addFilm(Film film) {
        this.films.add(film);
    }
    public List<Film> getFilms(){
        return this.films;
    }
    public String getName() {
        return this.name;
    }

    public static List<Actor> notFilmed() {
        List<Actor> resultList = new ArrayList<>();

        Iterator<Actor> actorIterator = Database.getActors().iterator();
        while (actorIterator.hasNext()) {
            Actor actor = actorIterator.next();
            Iterator<Film> filmIterator = Database.getFilms().iterator();

            boolean present = false;
            while (filmIterator.hasNext()) {
                Film film = filmIterator.next();
                if (film.getActors().contains(actor)) {
                    present = true;
                    break;
                }
            }

            if (!present) {
                resultList.add(actor);
            }
        }
        for(Actor model : resultList) {
            System.out.println(model.getName());
        }

        return resultList;
    }
}