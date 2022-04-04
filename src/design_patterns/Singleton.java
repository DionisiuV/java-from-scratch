package design_patterns;

public class Singleton {
    public static void main(String[] args) {
        //new HttpConnection(); //Compilation error.
        HttpConnection connection = HttpConnection.getInstance();
        String info = connection.getInfo();
        System.out.println(info);
    }
}

class HttpConnection {
    private static HttpConnection httpConnection;

    private HttpConnection() {
        System.out.println("HttpConnection constructor called.");
    }

    public static synchronized HttpConnection getInstance() {
        if (httpConnection == null) {
            httpConnection = new HttpConnection();
        }
        return httpConnection;
    }

    public String getInfo() {
        return "You established a HTTP connection.";
    }
}