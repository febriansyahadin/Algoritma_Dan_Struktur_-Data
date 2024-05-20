package Quis2;

public class node {
    teamVoli data;
    node prev,next;

    public node(node prev, teamVoli data, node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
