package lab08;

public class OverflowGroupException extends Exception {
    @Override
    public String getMessage(){
        return "Помилка: група заповнена.";
    }
}