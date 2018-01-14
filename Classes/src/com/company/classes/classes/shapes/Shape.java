package com.company.classes.classes.shapes;

import java.awt.*;

abstract class Shape {

    private Color color;

    public void darken(){
        //TODO
    }

    public void draw(Graphics g){
        g.setColor(this.color);
        render(g);
    }

    abstract protected void render(Graphics g);
}
