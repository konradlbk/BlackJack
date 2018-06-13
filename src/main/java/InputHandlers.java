import java.util.Arrays;
import java.util.List;

public class InputHandlers implements InputHandler {


    public Boolean isApplicable(String word) {

        if (word.equals("tak")){
            return true;
        }

        return false;
    }



}
