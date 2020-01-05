package _02_Chat_Application;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;

/*
 * Using the Click_Chat example, write an application that allows a server computer to chat with a client computer.
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChatApp extends JFrame implements KeyListener {
    static final int WIDTH = 400;
    static final int HEIGHT = 300;
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    Stack<Character> typedChars = new Stack<Character>();
    String message = "";
    String oldMessages = "<html>";
    boolean isServer = true;

    Server server;
    Client client;

    public static void main(String[] args) {
        new ChatApp();
    }

    public ChatApp() {
        int response = JOptionPane.showConfirmDialog( null, "Would you like to host a connection?", "Buttons!",
                JOptionPane.YES_NO_OPTION );

        if( response == JOptionPane.YES_OPTION ) {
            server = new Server( this, 8080 );
            setTitle( "SERVER" );
            JOptionPane.showMessageDialog( null,
                    "Server started at: " + server.getIPAddress() + "\nPort: " + server.getPort() );

            isServer = true;
            
            // Setup frame
            setVisible( true );
            setSize( WIDTH, HEIGHT );
            setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            
            // Setup panel
            panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ) );
            panel.setPreferredSize( new Dimension( WIDTH, HEIGHT ) );
            add( panel );

            // Setup label and text field
            label.setPreferredSize( new Dimension( WIDTH, ( HEIGHT * 3 ) / 4 ) );
            textField.setPreferredSize( new Dimension( WIDTH, HEIGHT / 4 ) );
            textField.setBorder( BorderFactory.createLineBorder( Color.GREEN, 2 ) );
            textField.addKeyListener( this );
            panel.add( label );
            panel.add( textField );

            server.start();

        } else {
            setTitle( "CLIENT" );
            String ipStr = JOptionPane.showInputDialog( "Enter the IP Address" );
            String prtStr = JOptionPane.showInputDialog( "Enter the port number" );
            int port = Integer.parseInt( prtStr );
            client = new Client( this, ipStr, port );

            isServer = false;

            // Setup frame
            setVisible( true );
            setSize( WIDTH, HEIGHT );
            setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            
            // Setup panel
            panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ) );
            panel.setPreferredSize( new Dimension( WIDTH, HEIGHT ) );
            add( panel );

            // Setup label and textfield
            label.setPreferredSize( new Dimension( WIDTH, ( HEIGHT * 3 ) / 4 ) );
            textField.setPreferredSize( new Dimension( WIDTH, HEIGHT / 4 ) );
            textField.setBorder( BorderFactory.createLineBorder( Color.GREEN, 2 ) );
            textField.addKeyListener( this );
            panel.add( label );
            panel.add( textField );
            
            client.start();
        }
    }
    
    public void addMessageToLabel( boolean isIncomingMessage, String message ) {
        
        if( isIncomingMessage ) {
            
            // Incoming messages are indented and colored red
            oldMessages += "<blockquote>" + "<font color='red'>" + message + "</font>" + "</blockquote>";
            
        } else {
            
            // If not the first message, then a new line may need to be added
            if( !oldMessages.equals( "<html>" ) ) {
                String blockquoteTag = "";
                
                if( oldMessages.length() > "</blockquote>".length() ) {
                    blockquoteTag = oldMessages.substring( oldMessages.length() - "</blockquote>".length() );
                }
                
                System.out.println( blockquoteTag );
                
                // No new line needed if the last message was a blockquote
                if( !blockquoteTag.equals( "</blockquote>" ) ) {
                    oldMessages += "<br>";
                }
            }
            
            // User messages are blue
            oldMessages += "<font color='blue'>" + message + "</font>";
        }
        
        // Update the message history on the JLabel
        label.setText( oldMessages + "</html>" );
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        System.out.println( keyCode );

        if( keyCode == KeyEvent.VK_ENTER ) {
            message = textField.getText();

            addMessageToLabel( false, message );

            if( isServer ) {
                server.sendMessage( message );
            } else {
                client.sendMessage( message );
            }

            message = "";
            textField.setText( "" );
        }
    }
}
