package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    private Needle7 neddle;

    @Override
    public String toString() {
        return ", в яйце иголка " + neddle.toString();
    }

    @Autowired
    public void setNeddle(Needle7 neddle) {
        this.neddle = neddle;
    }
}
