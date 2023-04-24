import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Interfaz {
    private JTabbedPane tabbedPane1;
    private JEditorPane editorPane1;
    private JEditorPane editorPane2;
    private JTextArea textArea1;
    private JTextArea areaPredeterminados;
    private JTextPane textPane1;
    private JTextField id;
    private JButton AGREGARButton;
    private JTextField nombre;
    private JTextField edad;
    private JTextField prioridad;
    private JButton INGRESARDATOSPREDETERMINADOSButton;

    private SocialNetwork sn = new SocialNetwork();


    public Interfaz() {
        textArea1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });

        AGREGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Persona p = new Persona(Integer.parseInt(id.getText()), nombre.getText(),
                     Integer.parseInt(edad.getText()), Integer.parseInt(prioridad.getText()));
                sn.agregarPersona(p);

            }
        });
        INGRESARDATOSPREDETERMINADOSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Persona p1 = new Persona(001, "Juan Lopez",
                        25, 49);
                sn.agregarPersona(p1);
                Persona p2 = new Persona(002, "Julian Cruz",
                        18, 52);
                sn.agregarPersona(p2);
                Persona p3 = new Persona(003, "Andres Guaman",
                        27, 70);
                sn.agregarPersona(p3);
                Persona p4 = new Persona(004, "Sebastian Cabrera",
                        22, 51);
                sn.agregarPersona(p4);

                Persona p5 = new Persona(005, "Julio Perez",
                        16, 34);
                sn.agregarPersona(p5);
                Persona p6 = new Persona(006, "Nando Sanchez",
                        45, 31);
                sn.agregarPersona(p6);
            }
        });
    }

    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        JFrame frame = new JFrame("Mi Interfaz");
        frame.setContentPane(interfaz.tabbedPane1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
