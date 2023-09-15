import javax.swing.*;
import java.awt.*;
class MyProgramm extends JFrame {
    static int milanScore = 0; static int madridScore = 0; static String lastScorerTeam = "N/A";
    static String winner = "DRAW"; JLabel ResultJLabel = new JLabel("Result: " + madridScore +" X " + milanScore );
    JLabel LastScorerJLabel = new JLabel("Last Scorer: "+ lastScorerTeam); Label WinnerLabel = new Label("Winner: " + winner);
    JButton MilanButton = new JButton("AC Milan"); JButton RealButton = new JButton("Real Madrid");
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
                getContentPane().setBackground(Color.RED);
                ResultJLabel.setForeground(Color.BLACK); // весь цвет не нужен!
                LastScorerJLabel.setForeground(Color.BLACK);

            } else if(milanScore == madridScore) {
                winner = "DRAW";
                WinnerLabel.setText("Winner: " + winner);
                getContentPane().setBackground(Color.GRAY);
                ResultJLabel.setForeground(Color.WHITE);
                LastScorerJLabel.setForeground(Color.WHITE);
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
                getContentPane().setBackground(Color.BLUE);
                ResultJLabel.setForeground(Color.WHITE);
                LastScorerJLabel.setForeground(Color.WHITE);
            } else if(milanScore == madridScore) {
                winner = "DRAW";
                WinnerLabel.setText("Winner: " + winner);
                getContentPane().setBackground(Color.GRAY);
                ResultJLabel.setForeground(Color.WHITE);
                LastScorerJLabel.setForeground(Color.WHITE);
            }
        });
        ResultJLabel.setHorizontalAlignment(0);
        add(ResultJLabel, BorderLayout.NORTH);
        add(LastScorerJLabel, BorderLayout.CENTER);
        add(WinnerLabel, BorderLayout.SOUTH);
        add(MilanButton, BorderLayout.EAST);
        add(RealButton, BorderLayout.WEST);
    }
    public static void main(String[]args){
        new MyProgramm().setVisible(true);
    }
}
