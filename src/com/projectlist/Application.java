package com.projectlist;

public class Application {
    private List list;

    public Application(){
        list = new List();
    }

    public void execute (){
        list.insertInit(10);
        list.insertInit(8);
        list.show();
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.execute();
    }
}
