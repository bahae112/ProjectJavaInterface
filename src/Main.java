import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Fenetre extends JFrame implements ActionListener {
    private JButton b1, b2, b3, b4, b5, b6,b7; // Déclarer les boutons comme variables globales

    public Fenetre() {
        // Configurer la fenêtre principale
        this.setTitle("Fenetre avec 6 Boutons");
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);

        // Créer les boutons
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        b6 = new JButton("Delete"); // Nouveau bouton pour vérifier et rendre les boutons jaunes invisibles
        b7 = new JButton("Show"); //

        // Ajouter des écouteurs d'événements sur les boutons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        // Créer les panneaux pour chaque bouton et un panneau principal
        Panel p = new Panel();
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p5 = new Panel();
        Panel p6 = new Panel();
        Panel p7 = new Panel(); // Nouveau panneau pour vérifier et rendre les boutons jaunes invisibles

        // Adapter la taille des panneaux
        p1.setPreferredSize(new Dimension(100, 100));
        p2.setPreferredSize(new Dimension(100, 100));
        p3.setPreferredSize(new Dimension(100, 100));
        p4.setPreferredSize(new Dimension(100, 100));
        p5.setPreferredSize(new Dimension(100, 100));
        p6.setPreferredSize(new Dimension(100, 100));
        p7.add(b7); // Ajouter le bouton "Afficher"
        // Ajouter les boutons dans les panneaux
        p1.add(b1);
        p2.add(b2);
        p3.add(b3);
        p4.add(b4);
        p5.add(b5);
        p6.add(b6); // Ajouter le bouton "Verifier"
        p7.add(b7); // Ajouter le bouton "Afficher"
        // Ajouter les panneaux dans le panneau principal
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        p.add(p6); // Ajouter le panneau contenant "Verifier"
        p.add(p7); // Ajouter le panneau contenant "Afficher"
        // Ajouter le panneau principal dans la fenêtre
        this.setContentPane(p);

        // Rendre la fenêtre visible
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Récupérer le bouton cliqué
        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton == b6) {
            // Si le bouton "Verifier" est cliqué, vérifier les boutons jaunes
            rendreBoutonsJaunesInvisibles();
        }else if( clickedButton == b7) {
            rendreBoutonsJaunesVisibles();
        }
        else {
            // Changer la couleur du bouton
            if (clickedButton.getBackground().equals(Color.YELLOW)) {
                // Si le bouton est déjà jaune, revenir à la couleur par défaut
                clickedButton.setBackground(null);
            } else {
                // Sinon, changer la couleur en jaune
                clickedButton.setBackground(Color.YELLOW);
            }
        }
    }

    // Méthode pour rendre les boutons jaunes invisibles
    private void rendreBoutonsJaunesInvisibles() {
        // Vérifier chaque bouton et le rendre invisible s'il est jaune
        if (b1.getBackground().equals(Color.YELLOW)) b1.setVisible(false);
        if (b2.getBackground().equals(Color.YELLOW)) b2.setVisible(false);
        if (b3.getBackground().equals(Color.YELLOW)) b3.setVisible(false);
        if (b4.getBackground().equals(Color.YELLOW)) b4.setVisible(false);
        if (b5.getBackground().equals(Color.YELLOW)) b5.setVisible(false);
    }
    private void rendreBoutonsJaunesVisibles() {
        // Rendre tous les boutons visibles et rétablir leur couleur par défaut
        b1.setVisible(true);
        b1.setBackground(null);
        b2.setVisible(true);
        b2.setBackground(null);
        b3.setVisible(true);
        b3.setBackground(null);
        b4.setVisible(true);
        b4.setBackground(null);
        b5.setVisible(true);
        b5.setBackground(null);
    }
}

public class Main {
    public static void main(String[] args) {
        Fenetre f = new Fenetre();
    }
}
