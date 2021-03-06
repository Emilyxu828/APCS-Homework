import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;


public class Canvas extends JPanel implements MouseListener, MouseMotionListener
{
    private ArrayList<Line> lines = new ArrayList<Line>();
    private Line tmpline;


    private boolean drawing=false;
    private int startX,startY;
    private int oldX, oldY;

    private boolean enabled = true;
    
    public void mouseMoved(MouseEvent e)
    {
    }
    public void mouseDragged(MouseEvent e)
    {
	this.startDrawing(new Line(startX,startY,
				     e.getX(),e.getY(),
				     Color.blue));

	this.addLine(new Line(oldX, oldY,
				e.getX(),e.getY(),
				Color.green));
	oldX = e.getX();
	oldY = e.getY();
	this.update(this.getGraphics());
    }
    public void mouseEntered(MouseEvent e)
    {
    }
    public void mouseExited(MouseEvent e)
    {
    }
    public void mouseClicked(MouseEvent e)
    {
	Node n = new Node(e.getX(),e.getY(),Color.red);
	this.add(n);
	this.update(this.getGraphics());
    }
    public void mousePressed(MouseEvent e)
    {
	startX = e.getX();
	startY = e.getY();
	oldX = startX;
	oldY = startY;
    }
    public void mouseReleased(MouseEvent e)
    {
	this.addLine(new Line(startX,startY,
				e.getX(),e.getY(),
				Color.red));
	this.stopDrawing();
	this.update(this.getGraphics());

    }



    public void clear()
    {
	lines = new ArrayList<Line>();
	drawing=false;
    }
    public void startDrawing(Line l)
    {
	drawing = true;
	tmpline = l;
    }

    public void stopDrawing()
    {
	drawing=false;
    }

    public Dimension getPreferredSize()
    {
	return new Dimension(300,300);
    }


    public void addLine(Line l)
    {
	lines.add(l);
    }

    public void paintComponent(Graphics g)
    {
	super.paintComponent(g);
	
	if (drawing)
	    {
		g.setColor(tmpline.c);
		g.drawLine(tmpline.x0,tmpline.y0,
			   tmpline.x1,tmpline.y1);
	    }
	
	for (Line l : lines)
	    {
		g.setColor(l.c);
		g.drawLine(l.x0,l.y0,l.x1,l.y1);
	    }
	
    }

    public Canvas()
    {
	
	this.addMouseListener(this);
	this.addMouseMotionListener(this);
    }



}