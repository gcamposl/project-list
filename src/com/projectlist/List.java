package com.projectlist;

public class List {
    private Node init;
    private Node end;

    public List () {
        init = end = null;
    }

    public void init () {
        init = end = null;
    }

    public void insertInit(int info){
        Node no  = new Node(info, init, null);
        if (init == null){
            init = end = no;
        } else {
            init.setAnt(no);
            init = no;
        }
    }

    public void insertEnd(int info){
        Node no  = new Node(info, null, end);
        if (init == null){
            init = end = no;

        } else {
            end.setProx(no);
            end = no;
        }
    }

    public void show (){
        Node aux = init;
        while(aux != null){
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

    public Node findInfo(int info){
        Node aux = init;
        while(aux != null && aux.getInfo() != info)
            aux = aux.getProx();
        if(aux!=null && aux.getInfo() == info)
            return aux;
        return null;
    }

    public void remove (int info){
        Node aux = findInfo(info);
        if(aux != null){
            if(init == end)
                init();
            else{
                if(aux == init){ //primeiro elemento da lista
                    init = init.getProx();
                    init.setAnt(null);
                }
                else if (aux == end){ //ultimo elemento da lista
                    end = end.getAnt();
                    end.setProx(null);
                }
                else { // nao está no começo e nem no final da lista
                    aux.getAnt().setProx(aux.getProx());
                    aux.getProx().setAnt(aux.getAnt());
                    aux.setAnt(null);
                    aux.setProx(null);
                }
            }
        }
    }

    public void directSelection (){
        int smaller;
        Node pi = init, pj, posSmaller;
        while (pi.getProx() != null){
            smaller = pi.getInfo();
            posSmaller = pi;
            pj = pi.getProx();
            while (pj!=null){
                if(pj.getInfo() < smaller){
                    smaller = pj.getInfo();
                    posSmaller = pj;
                }
                pj = pj.getProx();
            }
            posSmaller.setInfo(pi.getInfo());
            pi.setInfo(smaller);
            pi = pi.getProx();
        }
    }
}
