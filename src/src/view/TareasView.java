package view;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import  javax.swing.JLabel;
import javax.swing.JPanel;

public class TareasView extends JFrame{
    private int [] pantalla = new int[]{1500,800};

    public TareasView(){
        this.setSize(this.pantalla[0], this.pantalla[1]);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(3);
        JPanel headerPanel =new JPanel();
        headerPanel.setPreferredSize(new Dimension(this.pantalla[0],60));
        headerPanel.setBackground(Color.red);
        headerPanel.setLayout(new BorderLayout());
        JLabel tareasLabel = new JLabel("Tareas");
        tareasLabel.setForeground(Color.blue);
        tareasLabel.setHorizontalAlignment(2);
        tareasLabel.setBorder(BorderFactory.createEmptyBorder(10, 10,10,10));
        headerPanel.add(tareasLabel, "west");
        JPanel tareaAsignadaPanel = new JPanel(new GridLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = 2;
        JPanel logoPanel = new JPanel();
        logoPanel.setPreferredSize(new Dimension(40, 40));
        logoPanel.setBackground(Color.green);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        tareaAsignadaPanel.add(logoPanel, gbc);
        JLabel nombreDeLaTareaLabel = new JLabel("");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        tareaAsignadaPanel.add(tareaAsignadaPanel, "East");
        this.add(headerPanel, "North");
        this.add(this.barraBaja(), "West");
        this.setVisible(true);

    }

    public static void main(String[] args){new TareasView();}

    private  JPanel barraBaja() {
        JPanel menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(250, this.pantalla[1]));
        menuPanel.setBackground(Color.DARK_GRAY);
        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(2, 5));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = 2;
        gbc.gridx = 0;
        menu.add(this.op("Panel Para Controles"));
        menu.add(this.op ("Panel De Tareas"));
        menu.add(this.op("Formulario Para Nueva Tarea"));
        menu.add(this.op("Formulario Para Eliminar Tarea"));

        return menuPanel;
    }

    private JButton op (String texto){
        JButton op = new JButton(texto);
        op.addActionListener(e ->{
         System.out.println(texto);
        });
        return op;
    }









}



