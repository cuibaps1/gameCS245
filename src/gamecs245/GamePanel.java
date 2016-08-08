/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamecs245;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ozhang
 */
public class GamePanel extends JPanel implements ActionListener {
    
    JButton a, b, c, d, E, f, g, h, i, j, k , l ,m, n, o, p, q, r, s, t, u, v, w, x, y, z, skipB;
    
    public GamePanel(){
        
        setLayout(null);
        createButtons();
        setButtonLocations();
        addButtons();
 
        
        
    }
    
    public void createButtons(){
        a = new JButton("A");
        b = new JButton("B");
        c = new JButton("C");
        d = new JButton("D");
        E = new JButton("E");
        f = new JButton("F");
        g = new JButton("G");
        h = new JButton("H");
        i = new JButton("I");
        j = new JButton("J");
        k = new JButton("K");
        l = new JButton("L");
        m = new JButton("M");
        n = new JButton("N");
        o = new JButton("O");
        p = new JButton("P");
        q = new JButton("Q");
        r = new JButton("R");
        s = new JButton("S");
        t = new JButton("T");
        u = new JButton("U");
        v = new JButton("V");
        w = new JButton("W");
        x = new JButton("X");
        y = new JButton("Y");
        z = new JButton("Z");
        skipB = new JButton("Skip");
    }
    
    public void addButtons(){
        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        E.addActionListener(this);
        f.addActionListener(this);
        g.addActionListener(this);
        h.addActionListener(this);
        i.addActionListener(this);
        j.addActionListener(this);
        k.addActionListener(this);
        l.addActionListener(this);
        m.addActionListener(this);
        n.addActionListener(this);
        o.addActionListener(this);
        p.addActionListener(this);
        q.addActionListener(this);
        r.addActionListener(this);
        s.addActionListener(this);
        t.addActionListener(this);
        u.addActionListener(this);
        v.addActionListener(this);
        w.addActionListener(this);
        x.addActionListener(this);
        y.addActionListener(this);
        z.addActionListener(this);
        add(a);
        add(b);
        add(c);
        add(d);
        add(E);
        add(f);
        add(g);
        add(h);
        add(i);
        add(j);
        add(k);
        add(l);
        add(m);
        add(n);
        add(o);
        add(p);
        add(q);
        add(r);
        add(s);
        add(t);
        add(u);
        add(v);
        add(w);
        add(x);
        add(y);
        add(z);
        add(skipB);
    }

    private void setButtonLocations(){
        a.setBounds(45, 275, 50, 20);
        b.setBounds(95, 275, 50, 20);
        c.setBounds(145, 275, 50, 20);
        d.setBounds(195, 275, 50, 20);
        E.setBounds(245, 275, 50, 20);
        f.setBounds(295, 275, 50, 20);
        g.setBounds(345, 275, 50, 20);
        h.setBounds(395, 275, 50, 20);
        i.setBounds(445, 275, 50, 20);
        j.setBounds(495, 275, 50, 20);
        k.setBounds(45, 295, 50, 20);
        l.setBounds(95, 295, 50, 20);
        m.setBounds(145, 295, 50, 20);
        n.setBounds(195, 295, 50, 20);
        o.setBounds(245, 295, 50, 20);
        p.setBounds(295, 295, 50, 20);
        q.setBounds(345, 295, 50, 20);
        r.setBounds(395, 295, 50, 20);
        s.setBounds(445, 295, 50, 20);
        t.setBounds(495, 295, 50, 20);
        u.setBounds(45, 315, 50, 20);
        v.setBounds(95, 315, 50, 20);
        w.setBounds(145, 315, 50, 20);
        x.setBounds(195, 315, 50, 20);
        y.setBounds(245, 315, 50, 20);
        z.setBounds(295, 315, 50, 20);
        skipB.setBounds(495, 50, 70, 25);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == a){
            remove(a);
        }
        else if(e.getSource() == b){
            remove(b);
        }
        else if(e.getSource() == c){
            remove(c);
        }
        else if(e.getSource() == d){
            remove(d);
        }
        else if(e.getSource() == E){
            remove(E);
        }
        else if(e.getSource() == f){
            remove(f);
        }
        else if(e.getSource() == g){
            remove(g);
        }
        else if(e.getSource() == h){
            remove(h);
        }
        else if(e.getSource() == i){
            remove(i);
        }
        else if(e.getSource() == j){
            remove(j);
        }
        else if(e.getSource() == k){
            remove(k);
        }
        else if(e.getSource() == l){
            remove(l);
        }
        else if(e.getSource() == m){
            remove(m);
        }
        else if(e.getSource() == n){
            remove(n);
        }
        else if(e.getSource() == o){
            remove(o);
        }
        else if(e.getSource() == p){
            remove(p);
        }
        else if(e.getSource() == q){
            remove(q);
        }
        else if(e.getSource() == r){
            remove(r);
        }
        else if(e.getSource() == s){
            remove(s);
        }
        else if(e.getSource() == t){
            remove(t);
        }
        else if(e.getSource() == u){
            remove(u);
        }
        else if(e.getSource() == v){
            remove(v);
        }
        else if(e.getSource() == w){
            remove(w);
        }
        else if(e.getSource() == x){
            remove(x);
        }
        else if(e.getSource() == y){
            remove(y);
        }
        else if(e.getSource() == z){
            remove(z);
        }
        repaint();
    }
    
}
