package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ToDoList implements ActionListener {
    /*
     * Create a program with five buttons, add task, view tasks, remove task, save
     * list, and load list.
     * 
     * When add task is clicked: ask the user for a task and save it to an array
     * list
     * 
     * When the view tasks button is clicked: show all the tasks in the list
     * 
     * When the remove task button is clicked: prompt the user for which task to
     * remove and take it off of the list.
     * 
     * When the save list button is clicked: Save the list to a file
     * 
     * When the load list button is clicked: Prompt the user for the location of the
     * file and load the list from that file
     * 
     * When the program starts, it should automatically load the last saved file
     * into the list.
     */
    JFrame frame;
    JPanel panel;
    JButton[] buttons;
    JButton previousButtonPressed = null;
    JButton submitButton;
    JTextArea inputField;
    JLabel label;
    ArrayList<String> tasks;
    String lastOpenedFilename = "_last.txt";

    public ToDoList() {
        frame = new JFrame();
        panel = new JPanel();
        inputField = new JTextArea( 1, 20 );
        label = new JLabel();
        buttons = new JButton[ 5 ];
        submitButton = new JButton();
        tasks = new ArrayList<String>();

        for( int i = 0; i < buttons.length; i++ ) {
            buttons[ i ] = new JButton();
        }

    }

    public void startToDoList() {
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
        frame.setTitle( "My To Do List" );
        frame.add( panel );

        buttons[ 0 ].setText( "Add Task" );
        buttons[ 1 ].setText( "View Task" );
        buttons[ 2 ].setText( "Remove Task" );
        buttons[ 3 ].setText( "Save List" );
        buttons[ 4 ].setText( "Load List" );

        for( int i = 0; i < buttons.length; i++ ) {
            buttons[ i ].addActionListener( this );
            panel.add( buttons[ i ] );
        }

        label.setText( "Select a button" );
        panel.add( label );

        panel.add( inputField );

        submitButton.setText( "Submit" );
        submitButton.addActionListener( this );
        panel.add( submitButton );

        // Load last saved task list, if one exists
        String lastSaveFilename = FileIO.readFile( lastOpenedFilename );

        if( lastSaveFilename != null ) {
            String tasksStr = FileIO.readFile( lastSaveFilename );

            if( tasksStr != null ) {
                String[] tasksStrArr = tasksStr.split( "\n" );

                tasks.clear();

                for( int i = 0; i < tasksStrArr.length; i++ ) {
                    tasks.add( tasksStrArr[ i ] );
                }
            }
        }

        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        JButton buttonPressed = (JButton)arg0.getSource();

        if( buttonPressed == buttons[ 0 ] ) {
            // Add task

            label.setText( "Enter a task" );
            inputField.setText( "" );
            previousButtonPressed = buttons[ 0 ];

        } else if( buttonPressed == buttons[ 1 ] ) {
            // View tasks

            if( tasks.size() == 0 ) {
                label.setText( "No tasks added" );
            } else {
                label.setText( "Tasks ->" );
                String tasksStr = "";

                for( int i = 0; i < tasks.size(); i++ ) {
                    tasksStr += tasks.get( i );

                    if( i != tasks.size() - 1 ) {
                        tasksStr += "\n";
                    }
                }

                inputField.setText( tasksStr );
            }

        } else if( buttonPressed == buttons[ 2 ] ) {
            // Remove tasks

            if( tasks.size() > 0 ) {
                label.setText( "Enter the task to remove" );
                inputField.setText( "" );
                previousButtonPressed = buttons[ 2 ];
            } else {
                label.setText( "No tasks to remove" );
            }

        } else if( buttonPressed == buttons[ 3 ] ) {
            // Save tasks

            label.setText( "Enter filename to save tasks" );
            inputField.setText( "" );
            previousButtonPressed = buttons[ 3 ];

        } else if( buttonPressed == buttons[ 4 ] ) {
            // Load tasks

            label.setText( "Enter filename to load tasks" );
            inputField.setText( "" );
            previousButtonPressed = buttons[ 4 ];

        } else if( buttonPressed == submitButton ) {

            if( previousButtonPressed == null ) {
                label.setText( "Select a button first" );
            } else if( previousButtonPressed == buttons[ 0 ] ) {
                // Add task

                label.setText( "Adding task: " + inputField.getText() );
                tasks.add( inputField.getText() );

            } else if( previousButtonPressed == buttons[ 2 ] ) {
                // Remove task

                inputField.getText();
                if( tasks.remove( inputField.getText() ) ) {
                    label.setText( "Removed task " + inputField.getText() );
                } else {
                    label.setText( inputField.getText() + " is not a task in the list" );
                }

            } else if( previousButtonPressed == buttons[ 3 ] ) {
                // Save tasks

                String tasksStr = "";

                for( int i = 0; i < tasks.size(); i++ ) {
                    tasksStr += tasks.get( i ) + "\n";
                }

                if( FileIO.writeFile( inputField.getText(), tasksStr ) ) {
                    label.setText( "file write successful" );

                    // Write filename of last saved tasks
                    FileIO.writeFile( lastOpenedFilename, inputField.getText() );
                } else {
                    label.setText( "ERROR writing file" );
                }

            } else if( previousButtonPressed == buttons[ 4 ] ) {
                // Load tasks

                String tasksStr = FileIO.readFile( inputField.getText() );

                if( tasksStr == null ) {
                    label.setText( "ERROR reading file" );
                } else {
                    String[] tasksStrArr = tasksStr.split( "\n" );

                    tasks.clear();

                    for( int i = 0; i < tasksStrArr.length; i++ ) {
                        tasks.add( tasksStrArr[ i ] );
                    }
                }
            }

            previousButtonPressed = null;
        }

        frame.pack();
    }

}