package lab08;

public class NullGroupException extends Exception {
    @Override
    public String getMessage(){
        return "Помилка.Група пуста";
    }

}