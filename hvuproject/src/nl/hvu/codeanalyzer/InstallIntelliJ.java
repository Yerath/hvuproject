/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hvu.codeanalyzer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import java.awt.Desktop;
import java.net.URI;

@ActionID(
        category = "Tools",
        id = "nl.hvu.codeanalyzer.InstallIntelliJ"
)
@ActionRegistration(
        displayName = "#CTL_InstallIntelliJ"
)
@ActionReference(path = "Menu/Tools", position = 190)
@Messages("CTL_InstallIntelliJ=Fuck this.... Install IntelliJ")
public final class InstallIntelliJ implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Desktop.getDesktop().browse(new URI("http://www.example.com"));
        // TODO implement action body
    }
}
