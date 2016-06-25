package com.poorgroupproject.thrumainamenu;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author amin
 * @version 1.0.0
 */
public class Menu extends JFrame {

    private BufferedImage backgoundImage;
    private JButton singlePlayerButton;
    private Image singlePlayerImage;


    public Menu() {
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setUndecorated(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        try {
            singlePlayerImage = ImageIO.read(new File("singleplayer.png"));
            backgoundImage = ImageIO.read(new File("background.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setContentPane(new MenuBackground(backgoundImage.getScaledInstance(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height, Image.SCALE_DEFAULT)));
        setVisible(true);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);

    }

    public static void main(String[] args) {
        new Menu();
    }


}
