package bb;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Timer;
public class View extends Applet   {
int f=0;
int w=0;
int sizex = 600;
int sizey = 600;
static Applet applet;
int fabryka = 1;
Model ViewModel = Model.getInstance();
Kontroler ViewController = new Kontroler();
Timer timer = new Timer();
Image bufor;
Graphics bg;
static int stan = 0;

Image floor;
Image face;
Image koniec;
Image wall;

public int getSizeY()
{
	return sizey;
}

public int getSizeX()
{
	return sizex;
}

public void init()
{
	applet = this;
	ViewController.appletakl();
	applet.setSize(sizex,sizey);
	applet.setBackground(Color.LIGHT_GRAY);
	bufor = createImage(sizex,sizey);
	bg = bufor.getGraphics();
	timer.scheduleAtFixedRate(ViewModel, 10, 10);
	ViewModel.tablica();	
	floor = getImage(getDocumentBase(),"img/floor.jpg");
	face = getImage(getDocumentBase(),"img/face.png");
	koniec = getImage(getDocumentBase(),"img/exit.jpg");
	wall = getImage(getDocumentBase(),"img/wall.jpg");	
}


public void update(Graphics g)
{
	bg.clearRect(0,0,sizex,sizey);
	paint(bg);
	g.drawImage(bufor,0,0,applet);
}

public void startorend()
{
	if(stan==0)
	{
		startorend SOS = new startorend();
		Iff SI = new Iff();
		SOS.view();
		SOS=SI;
		SOS.view();
		Start SS = new WzorzecFabryka().getInstance(fabryka);
		SS.view();
		
	}
	if(stan==2)
	{
	ZakonczAdapter SEA = new ZakonczAdapter();
	SEA.view();
	
	}
}

public void paint(Graphics g)
{
	switch(stan)
	{
	case 0:
	startorend();
	stan=1;
	break;
	case 1:
	drawtheboard(g);
	
	break;
	case 2:
	startorend();
	end(g);
	break;
	}
}
public void end(Graphics g)
{
}
public void drawtheboard(Graphics g)
{
	
	for(int i = 0;i<ViewModel.board.length;i++)
	{
		for(int j=0;j<ViewModel.board[0].length;j++)
		{

			switch(ViewModel.board[i][j])
			{
			case 0:
				g.drawImage(floor,20*j,20*i,this);
				f=1;
				break;
			case 1:
				g.drawImage(wall,20*j,20*i,this);
				w=1;
				break;

			}
			if(ViewModel.exit[i][j]==2)
			{
				g.drawImage(koniec,20*j,20*i,this);
			}
			switch(ViewModel.board[i][j])
			{

			case 3:
			case 4:
				if(ViewModel.ifexit()==true){
					g.drawImage(koniec,20*j,20*i,this);
					g.drawImage(face,20*j,20*i,this);
					break;
				}
				else{
				g.drawImage(floor,20*j,20*i,this);
				g.drawImage(face,20*j,20*i,this);
				break;
				}
			}
		}
	}
	
}

int getf(){
	return f;
}

int getw(){
	return w;
}

}


