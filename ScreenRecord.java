import javax.swing.*;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.FlowLayout;
public class ScreenRecord
{
public static void main(String []agrs)throws AWTException
{
JFrame jf=new JFrame();

JLabel jl=new JLabel();
jf.add(jl);
//jf.setLayout(new FlowLayout());
jf.setSize(1300,700);
jf.pack();
jf.setVisible(true);
Robot r=new Robot();
Rectangle capture =  new Rectangle();
capture.setSize(1300,700);
while(true)
{
System.gc();
jl.setIcon(new ImageIcon(r.createScreenCapture(capture)));
}
}
}