package lab10;

public class Test {
    public static void main(String[] args) {
        Film film1 = new Film("Harry Potter");
        Film film2 = new Film("Split");
        Film film3 = new Film("Victor Frankenstein");

        Actor actor1 = new Actor("Daniel Redcliff");
        Actor actor2 = new Actor("Emma Watson");
        Actor actor3 = new Actor("James McAvoy");
        Actor actor4 = new Actor("BattleField Overwatch");
        Actor actor5 = new Actor("Alan Rickman");
        Database.addFilm(film1);
        Database.addFilm(film2);
        Database.addFilm(film3);
        Database.addActor(actor1);
        Database.addActor(actor2);
        Database.addActor(actor3);
        Database.addActor(actor4);

        film1.addActor(actor1);
        film1.addActor(actor2);
        film1.addActor(actor5);
        film2.addActor(actor3);
        film3.addActor(actor3);
        actor1.addFilm(film1);
        actor1.addFilm(film3);
        actor2.addFilm(film1);
        actor3.addFilm(film2);
        actor3.addFilm(film3);
        actor5.addFilm(film1);
        lab10.Actor.notFilmed();
        lab10.Film.filmWithMaxCountOfActors();
        lab10.Film.listOfActorsWithWhichCurrentActorHasPlayed(actor3);
    }
}