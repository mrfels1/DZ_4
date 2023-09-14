import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyProgramm extends JFrame {
    static int milanScore = 0;
    static int madridScore = 0;
    static String lastScorerTeam = "N/A";
    static String winner = "DRAW";

    JLabel ResultJLabel = new JLabel("Result: " + madridScore +" X " + milanScore );
    JLabel LastScorerJLabel = new JLabel("Last Scorer: "+ lastScorerTeam);
    Label WinnerLabel = new Label("Winner: " + winner);
    JButton MilanButton = new JButton("AC Milan");

    JButton RealButton = new JButton("Real Madrid");
    public MyProgramm()
    {
        super("Score table");
        setSize(400,400);
        setLayout(new BorderLayout());
        MilanButton.addActionListener(a -> {
            milanScore++;
            lastScorerTeam = "AC Milan";
            ResultJLabel.setText("Result: " + madridScore + " X " + milanScore);
            LastScorerJLabel.setText("Last Scorer: " + lastScorerTeam);
            if(milanScore > madridScore){
                winner = "AC Milan";
                WinnerLabel.setText("Winner: " + winner);
            } else if(milanScore == madridScore) {
                winner = "DRAW";
                WinnerLabel.setText("Winner: " + winner);
            }
        });

        RealButton.addActionListener(b -> {
            madridScore++;
            lastScorerTeam = "Real Madrid";
            ResultJLabel.setText("Result: " + madridScore + " X " + milanScore );
            LastScorerJLabel.setText("Last Scorer: " + lastScorerTeam);
            if(madridScore > milanScore){
                winner = "Real Madrid";
                WinnerLabel.setText("Winner: " + winner);
            } else if(milanScore == madridScore) {
                winner = "DRAW";
                WinnerLabel.setText("Winner: " + winner);
            }
        });
        ResultJLabel.setHorizontalAlignment(0);
        add(ResultJLabel, BorderLayout.PAGE_START);
        add(LastScorerJLabel, BorderLayout.CENTER);
        add(WinnerLabel, BorderLayout.PAGE_END);
        add(MilanButton, BorderLayout.LINE_END);
        add(RealButton, BorderLayout.LINE_START);
    }
    public static void main(String[]args){
        new MyProgramm().setVisible(true);
    }
}