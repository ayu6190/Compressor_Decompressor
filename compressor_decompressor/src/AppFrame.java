import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.*;
import java.io.File;

public class AppFrame extends JFrame implements ActionListener{
    JButton compressButton;
    JButton decompressButton;
    AppFrame(){
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("Compressor & Decompressor");
        compressButton = new JButton("Select File To Compress");
        compressButton.setLayout(null);
        compressButton.setSize(100, 50);
        compressButton.setBounds(50, 100, 200, 50);
        compressButton.setBackground(Color.RED);
        compressButton.addActionListener(this);

        decompressButton = new JButton("Select File To Decompress");
        decompressButton.setLayout(null);
        decompressButton.setSize(100, 50);
        decompressButton.setBounds(500, 100, 200, 50);
        decompressButton.setBackground(Color.GREEN);
        decompressButton.addActionListener(this);

        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(1000, 500);
        this.getContentPane().setBackground(Color.BLACK);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==compressButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
               
                try{
                    compress.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }

        if(e.getSource()==decompressButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
           
                try{
                    decompress.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
    }
   
}

