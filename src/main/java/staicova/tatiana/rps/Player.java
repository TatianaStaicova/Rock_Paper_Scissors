package staicova.tatiana.rps;

import java.security.PublicKey;

public class Player {

    private String name;
    private String tauntMessage;

    public Player(String name, String tauntMessage){
        this.name = name;
        this.tauntMessage = tauntMessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String taunt(){
        return tauntMessage;

    }

}

