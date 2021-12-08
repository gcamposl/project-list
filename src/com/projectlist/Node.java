package com.projectlist;

public class Node {
    private int info;
    private Node ant;
    private Node prox;

    public Node () {
        this.info = 0;
        this.ant = null;
        this.prox = null;
    }

    public Node (int info){
        this.info = info;
        this.prox = null;
        this.ant = null;
    }
    public Node(int info, Node ant, Node prox) {
      this.info = info;
      this.ant = ant;
      this.prox = prox;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getAnt() {
        return ant;
    }

    public void setAnt(Node ant) {
        this.ant = ant;
    }

    public Node getProx() {
        return prox;
    }

    public void setProx(Node prox) {
        this.prox = prox;
    }
}
