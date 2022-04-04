package advanced_features.concurrency.deadlock;

public class Facebook {
    public static void main(String[] args) {
        Friend john = new Friend("John");
        Friend mark = new Friend("Mark");

        new Thread(new Runnable() {
            @Override
            public void run() {
                john.sendFriendRequest(mark);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                mark.sendFriendRequest(john);
            }
        }).start();
    }
}

class Friend {
    String name;

    public Friend(String name) {
        this.name = name;
    }

    public synchronized void sendFriendRequest(Friend friend) {
        System.out.printf("%s send a friend request to %s\n", this.name, friend.name);
        friend.confirmRequest(this); //Produces a deadlock.
        //this.confirmRequest(friend); //Solves the problem.
    }

    public synchronized void confirmRequest(Friend friend) {
        System.out.printf("%s has accepted the friend request from %s\n", friend.name, this.name);
    }
}