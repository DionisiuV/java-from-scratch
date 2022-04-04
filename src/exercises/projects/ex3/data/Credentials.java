package exercises.projects.ex3.data;

import java.util.Date;

public class Credentials {
    public String email, pass;
    public Date date;

    public Credentials(String email, String pass) {
        this.email = email;
        this.pass = pass;
        date = new Date();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Credentials credentials) {
            return this.email.equals(credentials.email) && this.pass.equals(credentials.pass);
        }
        return false;
    }
}