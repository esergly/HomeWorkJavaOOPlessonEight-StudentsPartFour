public class AdditionalException extends Exception {
    @Override
    public String getMessage(){
        return "The group is full!";
    }
}
