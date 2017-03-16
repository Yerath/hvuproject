/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hu.getMotivation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

@ActionID(
        category = "Help",
        id = "org.hu.getMotivation.getMotivation"
)
@ActionRegistration(
        displayName = "#CTL_getMotivation"
)
@ActionReference(path = "Menu/Help", position = 350)
@Messages("CTL_getMotivation=Retrieve Motivation")
public final class getMotivation implements ActionListener {
    private List<String> quotes = new ArrayList<String>();
    private Random randomGenerator = new Random();
    
    public getMotivation(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        TopComponent win = WindowManager.getDefault().findTopComponent("MotivationTopComponent");
        win.open();
        win.requestActive();
    }
    
    public String retrieveQuote(String category){
        quotes.clear();
        Scanner scanner = new Scanner(getClass().getResourceAsStream(category + "_quote.txt"));
    
        while(scanner.hasNextLine()){
            quotes.add(scanner.nextLine());
        }
        
        int index = randomGenerator.nextInt(quotes.size());
        return quotes.get(index);
    }
}
